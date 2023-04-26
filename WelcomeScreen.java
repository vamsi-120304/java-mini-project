import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;



public class WelcomeScreen {

    

    //private static int n;

    private static int value;

    public static void main(String[] args){

        JFrame frame = new JFrame();
        
        JLabel label = new JLabel();

        JProgressBar bar = new JProgressBar();
        bar.setValue(value);
        bar.setBounds(160, 280, 270, 9);
        bar.setStringPainted(true);

        //int value = bar.getValue();
        

Thread thread = new Thread(() -> {
    for (int i = 0; i <= 100; i += 20) {
        try {
            Thread.sleep(600); // Sleep for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bar.setValue(i); // Update the progress bar value
        if(bar.getValue()==100){

            frame.dispose();
            SelectionPage mywindow = new SelectionPage();

        }
    }
});
thread.start();

       
        
        //JLabel label = new JLabel();
        ImageIcon image1 = new ImageIcon("lpu_logo3.png");
        label.setIcon(image1);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        //label.setBounds(100,20,100,20);
        label.add(bar);


        //JFrame frame = new JFrame();
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("LPU CGPA Calculator");
        frame.setLocationRelativeTo(null);
        //frame.setResizable(false);
        //frame.getContentPane().setBackground(new Color(33, 41, 48));
        frame.getContentPane().setBackground(new Color(0,0,0));
        frame.add(label);
        frame.setVisible(true);

        
    }
    
    
}


      
    
    

