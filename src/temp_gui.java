import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.math.*;

public class temp_gui
{
     private static JTextField FahrenheitField;
     private static JTextField CelisusField;
     private static JButton calculateButton;

     public static void main(String args[])
     {
          //------------------------------------------------------------
          // Build the GUI
          
          JFrame app = new JFrame("Temperature Converter");
          Container c = app.getContentPane();

          c.setLayout(new GridLayout(2, 2));
          
          JLabel tempText = new JLabel("Temp in Fahrenheit");
          c.add(tempText);                     
          FahrenheitField = new JTextField();
          c.add(FahrenheitField);


          calculateButton = new JButton("Calculate ");   // calculate button
          c.add(calculateButton);
          calculateButton.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){calculatetemp();}
          });

          CelisusField = new JTextField();                      // result field
          CelisusField.setEditable(false);
          c.add(CelisusField);
          app.setSize(500,200);
          app.setVisible(true);
          
          // do this after setting look and feel

     }// end main
     //==================================================================
     // utility methods
     //    
     //---------------------------------------------
     // do the calculation
     public static void calculatetemp()
     {
          double F = getDouble(FahrenheitField);
          double C;
          
          C = ((F - 32.0)* (5.0/9.0) );
  		
  		double roundOff_deg = Math.round(C * 100.0) / 100.0;
  		
  		setDouble(CelisusField, roundOff_deg);
  		
  		
     }
     //---------------------------------------------
     // get the floating point value of a text field
     public static double getDouble(JTextField t)
     {
        return Double.parseDouble(t.getText());
     }
     //-------------------------------------------
     // set a text field to a floating point value
     
     public static void setDouble(JTextField t, double p)
     {
        t.setText((new Double(p)).toString() + "°C");
     }
}// end class Mileage