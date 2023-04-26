

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TGPACalculator extends JFrame implements ActionListener {

    private JLabel numSubjectsLabel;
    private JTextField numSubjectsField;
    private JButton nextButton;

    private JLabel[] subjectLabels;
    private JComboBox<Integer>[] creditBoxes;
    private JComboBox<String>[] gradeBoxes;

    private JButton calculateButton;

    public TGPACalculator() {
        setTitle("CGPA Calculator");

        numSubjectsLabel = new JLabel("Number of subjects:");
        numSubjectsField = new JTextField(10);
        nextButton = new JButton("Next");
        nextButton.addActionListener(this);

        JPanel numSubjectsPanel = new JPanel();
        numSubjectsPanel.add(numSubjectsLabel);
        numSubjectsPanel.add(numSubjectsField);
        numSubjectsPanel.add(nextButton);

        setLayout(new GridLayout(2, 1)); 
        add(numSubjectsPanel);

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextButton) {
            int numSubjects = Integer.parseInt(numSubjectsField.getText());

            subjectLabels = new JLabel[numSubjects];
            creditBoxes = new JComboBox[numSubjects];
            gradeBoxes = new JComboBox[numSubjects];

            JPanel subjectsPanel = new JPanel();
            subjectsPanel.setLayout(new GridLayout(numSubjects + 1, 3));
            subjectsPanel.add(new JLabel("Subject"));
            subjectsPanel.add(new JLabel("Credits"));
            subjectsPanel.add(new JLabel("Grade"));

            for (int i = 0; i < numSubjects; i++) {
                subjectLabels[i] = new JLabel("Subject " + (i+1));
                subjectsPanel.add(subjectLabels[i]);

                creditBoxes[i] = new JComboBox<>();
                for (int j = 1; j <= 5; j++) {
                    creditBoxes[i].addItem(j);
                }
                subjectsPanel.add(creditBoxes[i]);

                gradeBoxes[i] = new JComboBox<>(new String[]{"O", "A+", "A", "B+", "B", "C","E"});
                subjectsPanel.add(gradeBoxes[i]);
            }

            calculateButton = new JButton("Calculate CGPA");
            calculateButton.addActionListener(this);

            JPanel buttonPanel = new JPanel();
            buttonPanel.add(calculateButton);

            setLayout(new GridLayout(2, 1));
            add(subjectsPanel);
            add(buttonPanel);

            pack();
            setLocationRelativeTo(null);
        } else if (e.getSource() == calculateButton) {
            double totalCredits = 0;
            double totalGradePoints = 0;

            for (int i = 0; i < subjectLabels.length; i++) {
                int credits = (int) creditBoxes[i].getSelectedItem();
                totalCredits += credits;

                String grade = (String) gradeBoxes[i].getSelectedItem();
                Double gradePoint;
                switch (grade) {
                    case "O":
                        gradePoint = 10.0;
                        break;
                    case "A+":
                        gradePoint = 9.0;
                        break;
                    case "A":
                        gradePoint = 8.0;
                        break;
                    case "B+":
                        gradePoint = 7.0;
                        break;
                    case "B":
                        gradePoint = 6.0;
                        break;
                    case "C":
                        gradePoint = 5.0;
                        break;
                    case "E":
                        gradePoint = 0.0;
                    default:
                        gradePoint = 0.0;
                        break;
                }
                totalGradePoints += credits * gradePoint;
            }
    
            Double cgpa = totalGradePoints / totalCredits;
    
            JOptionPane.showMessageDialog(this, "Your CGPA is: " + String.format("%.2f", cgpa));
        }
    }
    
    public static void main(String[] args) {
        new TGPACalculator();
    }
}

