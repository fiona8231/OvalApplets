import java.applet.Applet;
import java.awt.*;
import javax.swing.*;

public class OvalApplets extends Applet{

    private double sum;

    public void  init(){
        String fn = JOptionPane.showInputDialog("Enter the first numbter");
        String sn = JOptionPane.showInputDialog("Enter the second number");

        double n1 = Double.parseDouble(fn);
        double n2 = Double.parseDouble(sn);

        sum = n1 + n2;

    }


   public void paint(Graphics g){
       super.paint(g);
       g.drawString("The sum is"+ sum, 40,30);

   }


}
