

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CGPACalculator implements ActionListener {

    JFrame frame;
    JPanel panel;
    JLabel noOfTermsLabel, overallCGPALabel;
    JTextField noOfTermsField, overallCGPAField;
    JButton calculateButton;

    public CGPACalculator
() {
        frame = new JFrame("GPA Calculator");
        frame.setSize(820, 250);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(33,41,48));

        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        noOfTermsLabel = new JLabel("Number of terms completed: ");
        panel.add(noOfTermsLabel);
        noOfTermsField = new JTextField();
        //noOfTermsField.setPreferredSize(new Dimension(100, 10));
        panel.add(noOfTermsField);

        overallCGPALabel = new JLabel("Overall CGPA: ");
        panel.add(overallCGPALabel);
        overallCGPAField = new JTextField();
        overallCGPAField.setEditable(false);
        panel.add(overallCGPAField);

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        //calculateButton.setLocationRelativeTo(null);
        panel.add(calculateButton);
        

        frame.add(panel);
        //frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible(true);
        //frame.getContentPane().setBackground(Color.BLACK);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            int noOfTerms = Integer.parseInt(noOfTermsField.getText());
            double overallCGPA = 0.0;
            for (int i = 1; i <= noOfTerms; i++) {
                JTextField termCGPAField = new JTextField();
                Object[] fields = {"CGPA for Term " + i + ":", termCGPAField};
                int result = JOptionPane.showConfirmDialog(null, fields, "Term " + i + " Result", JOptionPane.OK_CANCEL_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                    double termCGPA = Double.parseDouble(termCGPAField.getText());
                    overallCGPA += termCGPA;
                } else {
                
                    return;
                }
            }
            overallCGPA /= noOfTerms;
            overallCGPAField.setText(String.format("%.2f", overallCGPA));
        }
    }

    public static void main(String[] args) {
        new CGPACalculator
    ();
    }
}


      
        

        



