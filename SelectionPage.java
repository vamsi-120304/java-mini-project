import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class SelectionPage implements ActionListener {

    JButton button = new JButton();
    JButton button2 = new JButton();
    

SelectionPage(){
        
       
        
        
        JLabel label = new JLabel();
        

    
       

        

        
        
       // label.setText("Hi");

        //JButton button = new JButton();
        button.setBounds(100,100,243,190);
        label.add(button);

        //ImageIcon icon = new ImageIcon("GPA1.png");
        //button.setIcon(icon);
        button.setText("TGPA Calculation");
        /*button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                
                selection1page m1 = selection1page();
            }
        });*/
        
        
            
        
      
         
        


            
        

        //JButton button2 = new JButton();
        button2.setBounds(400,100,235,190);
        button2.setText("CGPA Calculation");
        //button2.setForeground(Color.BLACK);
        //button2.setBackground(Color.ORANGE);
        //button2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
        /*button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JFrame frame2 = new JFrame();
                frame2.setSize(100,100);
                frame2.setVisible(true);
                frame.setVisible(false);

                
            
            }
        });*/
        label.add(button2);

        //ImageIcon icon2 = new ImageIcon("GPA1.png");
        //button.setIcon(icon2);

       

        




        




        

        


        

        JFrame frame = new JFrame();
        frame.setSize(800,450);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(33,41,48));
        frame.add(label);
       
        //frame.add(panel);

       
        
        
        //frame.add(button);
        
       
        

        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //JFrame frame2 = new JFrame();
                //frame2.setSize(100,100);
                //frame2.setVisible(true);
                frame.setVisible(false);
                //window2 w2 = new window2();
                //w2.showWindow();

                TGPACalculator w2 = new TGPACalculator();
                
               

                
            
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                frame.setVisible(false);
                CGPACalculator W1 = new CGPACalculator();
            }
        });


      
   

    
}


@Override
public void actionPerformed(ActionEvent e) {}


        
        

}


    






