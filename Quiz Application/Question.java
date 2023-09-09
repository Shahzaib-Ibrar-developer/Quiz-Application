
//Quiz Application with Swing GUI
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Question extends JFrame {
    private ButtonGroup buttonGroup;
    int count = 0;

    public Question() {
        setTitle("Quiz Application (If you don't Select any answer you will be scored 0 )");
        setSize(700, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        JPanel panel2 = new JPanel();
        panel2.setBorder(new EmptyBorder(30, 30, 30, 30));
        JLabel questionLabel = new JLabel("<html><b>Que1: Which among on these is not a datatype</b></html> ");
        Font currentFont = questionLabel.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() + 5f); // Increase the size by 10
        questionLabel.setFont(newFont);
        panel2.setLayout(new GridLayout(6, 1));
        JRadioButton radioButton1 = new JRadioButton("int");
        JRadioButton radioButton2 = new JRadioButton("Float");
        JRadioButton radioButton3 = new JRadioButton("Boolean");
        JRadioButton radioButton4 = new JRadioButton("char");
        buttonGroup = new ButtonGroup(); // Create a new ButtonGroup
        buttonGroup.add(radioButton1); // Add the radio buttons to the ButtonGroup
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);
        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             if (radioButton3.isSelected()) {
                    count++;
                }
                question2();
            }
        });

        panel2.add(questionLabel);
        panel2.add(radioButton1);
        panel2.add(radioButton2);
        panel2.add(radioButton3);
        panel2.add(radioButton4);
        panel2.add(nextButton);
        getContentPane().add(panel2);

    }

    public void question2() {
        JFrame frame2 = new JFrame("Quiz Application");
        frame2.setSize(700, 500);
        frame2.setVisible(true);
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame2.setLocationRelativeTo(null);
        frame2.setResizable(false);
        JPanel panel3 = new JPanel();
        panel3.setBorder(new EmptyBorder(30, 30, 30, 30));
        JLabel questionLabel = new JLabel(
                "<html><b>Que2: Which class available to all the class automatically </b></html> ");
        Font currentFont = questionLabel.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() + 5f); // Increase the size by 10
        questionLabel.setFont(newFont);
        panel3.setLayout(new GridLayout(6, 1));
        JRadioButton radioButton1 = new JRadioButton("Swing");
        JRadioButton radioButton2 = new JRadioButton("Applet");
        JRadioButton radioButton3 = new JRadioButton("Object");
        JRadioButton radioButton4 = new JRadioButton("ActionEvent");
        buttonGroup = new ButtonGroup(); // Create a new ButtonGroup
        buttonGroup.add(radioButton1); // Add the radio buttons to the ButtonGroup
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);

        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (radioButton1.isSelected()) {
                    count++;
                }
                question3();
            }
        });
        panel3.add(questionLabel);
        panel3.add(radioButton1);
        panel3.add(radioButton2);
        panel3.add(radioButton3);
        panel3.add(radioButton4);
        panel3.add(nextButton);
        frame2.getContentPane().add(panel3);
    }

    public void question3() {
        JFrame frame3 = new JFrame("Quiz Application");
        frame3.setSize(700, 500);
        frame3.setVisible(true);
        frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame3.setLocationRelativeTo(null);
        frame3.setResizable(false);
        JPanel panel3 = new JPanel();
        panel3.setBorder(new EmptyBorder(30, 30, 30, 30));
        JLabel questionLabel = new JLabel("<html><b>Que3: What is Java </b></html> ");
        Font currentFont = questionLabel.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() + 5f); // Increase the size by 10
        questionLabel.setFont(newFont);
        panel3.setLayout(new GridLayout(6, 1));
        JRadioButton radioButton1 = new JRadioButton("Program");
        JRadioButton radioButton2 = new JRadioButton("Programming Language");
        JRadioButton radioButton3 = new JRadioButton("Objective");
        JRadioButton radioButton4 = new JRadioButton("None");
        buttonGroup = new ButtonGroup(); // Create a new ButtonGroup
        buttonGroup.add(radioButton1); // Add the radio buttons to the ButtonGroup
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);

        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (radioButton2.isSelected()) {
                    count++;
                }
                question4();
            }
        });
        panel3.add(questionLabel);
        panel3.add(radioButton1);
        panel3.add(radioButton2);
        panel3.add(radioButton3);
        panel3.add(radioButton4);
        panel3.add(nextButton);
        frame3.getContentPane().add(panel3);
    }

    public void question4() {
        JFrame frame3 = new JFrame("Quiz Application");
        frame3.setSize(700, 500);
        frame3.setVisible(true);
        frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame3.setLocationRelativeTo(null);
        frame3.setResizable(false);
        JPanel panel3 = new JPanel();
        panel3.setBorder(new EmptyBorder(30, 30, 30, 30));
        JLabel questionLabel = new JLabel("<html><b>Que4: Is Java have AI based libraries  </b></html> ");
        Font currentFont = questionLabel.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() + 5f); // Increase the size by 10
        questionLabel.setFont(newFont);
        panel3.setLayout(new GridLayout(6, 1));
        JRadioButton radioButton1 = new JRadioButton("Yes");
        JRadioButton radioButton2 = new JRadioButton("No");
        JRadioButton radioButton3 = new JRadioButton("Other");
        JRadioButton radioButton4 = new JRadioButton("None");
        buttonGroup = new ButtonGroup(); // Create a new ButtonGroup
        buttonGroup.add(radioButton1); // Add the radio buttons to the ButtonGroup
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);

        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (radioButton1.isSelected()) {
                    count++;
                }
                question5();
            }
        });
        panel3.add(questionLabel);
        panel3.add(radioButton1);
        panel3.add(radioButton2);
        panel3.add(radioButton3);
        panel3.add(radioButton4);
        panel3.add(nextButton);
        frame3.getContentPane().add(panel3);
    }

    public void question5() {
        JFrame frame3 = new JFrame("Quiz Application");
        frame3.setSize(700, 500);
        frame3.setVisible(true);
        frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame3.setLocationRelativeTo(null);
        frame3.setResizable(false);
        JPanel panel3 = new JPanel();
        panel3.setBorder(new EmptyBorder(30, 30, 30, 30));
        JLabel questionLabel = new JLabel("<html><b>Que5: Pakistanis are famous for   </b></html> ");
        Font currentFont = questionLabel.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() + 5f); // Increase the size by 10
        questionLabel.setFont(newFont);
        panel3.setLayout(new GridLayout(6, 1));
        JRadioButton radioButton1 = new JRadioButton("Lassii");
        JRadioButton radioButton2 = new JRadioButton("Chai");
        JRadioButton radioButton3 = new JRadioButton("Bakery");
        JRadioButton radioButton4 = new JRadioButton("Golgappay");
        buttonGroup = new ButtonGroup(); // Create a new ButtonGroup
        buttonGroup.add(radioButton1); // Add the radio buttons to the ButtonGroup
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);

        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (radioButton2.isSelected()) {
                    count++;
                }
                question6();
            }
        });
        panel3.add(questionLabel);
        panel3.add(radioButton1);
        panel3.add(radioButton2);
        panel3.add(radioButton3);
        panel3.add(radioButton4);
        panel3.add(nextButton);
        frame3.getContentPane().add(panel3);
    }

    public void question6() {
        JFrame frame3 = new JFrame("Quiz Application");
        frame3.setSize(700, 500);
        frame3.setVisible(true);
        frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame3.setLocationRelativeTo(null);
        frame3.setResizable(false);
        JPanel panel3 = new JPanel();
        panel3.setBorder(new EmptyBorder(30, 30, 30, 30));
        JLabel questionLabel = new JLabel("<html><b>Que6: What is Computer   </b></html> ");
        Font currentFont = questionLabel.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() + 5f); // Increase the size by 10
        questionLabel.setFont(newFont);
        panel3.setLayout(new GridLayout(6, 1));
        JRadioButton radioButton1 = new JRadioButton("Electronic Product");
        JRadioButton radioButton2 = new JRadioButton("Electronic Device");
        JRadioButton radioButton3 = new JRadioButton("Both a/b");
        JRadioButton radioButton4 = new JRadioButton("Object");
        buttonGroup = new ButtonGroup(); // Create a new ButtonGroup
        buttonGroup.add(radioButton1); // Add the radio buttons to the ButtonGroup
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);

        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (radioButton2.isSelected()) {
                    count++;
                }
                question7();
            }
        });
        panel3.add(questionLabel);
        panel3.add(radioButton1);
        panel3.add(radioButton2);
        panel3.add(radioButton3);
        panel3.add(radioButton4);
        panel3.add(nextButton);
        frame3.getContentPane().add(panel3);
    }

    public void question7() {
        JFrame frame3 = new JFrame("Quiz Application");
        frame3.setSize(700, 500);
        frame3.setVisible(true);
        frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame3.setLocationRelativeTo(null);
        frame3.setResizable(false);
        JPanel panel3 = new JPanel();
        panel3.setBorder(new EmptyBorder(30, 30, 30, 30));
        JLabel questionLabel = new JLabel("<html><b>Que7: Library is a set of what  </b></html> ");
        Font currentFont = questionLabel.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() + 5f); // Increase the size by 10
        questionLabel.setFont(newFont);
        panel3.setLayout(new GridLayout(6, 1));
        JRadioButton radioButton1 = new JRadioButton("Nets");
        JRadioButton radioButton2 = new JRadioButton("Feelings");
        JRadioButton radioButton3 = new JRadioButton("Books");
        JRadioButton radioButton4 = new JRadioButton("Trees");

        buttonGroup = new ButtonGroup(); // Create a new ButtonGroup
        buttonGroup.add(radioButton1); // Add the radio buttons to the ButtonGroup
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);
        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (radioButton3.isSelected()) {
                    count++;
                }
                question8();
            }
        });
        panel3.add(questionLabel);
        panel3.add(radioButton1);
        panel3.add(radioButton2);
        panel3.add(radioButton3);
        panel3.add(radioButton4);
        panel3.add(nextButton);
        frame3.getContentPane().add(panel3);
    }

    public void question8() {
        JFrame frame3 = new JFrame("Quiz Application");
        frame3.setSize(700, 500);
        frame3.setVisible(true);
        frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame3.setLocationRelativeTo(null);
        frame3.setResizable(false);
        JPanel panel3 = new JPanel();
        panel3.setBorder(new EmptyBorder(30, 30, 30, 30));
        JLabel questionLabel = new JLabel("<html><b>Que8: Is all humans are good   </b></html> ");
        Font currentFont = questionLabel.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() + 5f); // Increase the size by 10
        questionLabel.setFont(newFont);
        panel3.setLayout(new GridLayout(6, 1));
        JRadioButton radioButton1 = new JRadioButton("Yes");
        JRadioButton radioButton2 = new JRadioButton("No");
        JRadioButton radioButton3 = new JRadioButton("Other");
        JRadioButton radioButton4 = new JRadioButton("None");
        buttonGroup = new ButtonGroup(); // Create a new ButtonGroup
        buttonGroup.add(radioButton1); // Add the radio buttons to the ButtonGroup
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);

        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (radioButton2.isSelected()) {
                    count++;
                }
                question9();
            }
        });
        panel3.add(questionLabel);
        panel3.add(radioButton1);
        panel3.add(radioButton2);
        panel3.add(radioButton3);
        panel3.add(radioButton4);
        panel3.add(nextButton);
        frame3.getContentPane().add(panel3);
    }

    public void question9() {
        JFrame frame3 = new JFrame("Quiz Application");
        frame3.setSize(700, 500);
        frame3.setVisible(true);
        frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame3.setLocationRelativeTo(null);
        frame3.setResizable(false);
        JPanel panel3 = new JPanel();
        panel3.setBorder(new EmptyBorder(30, 30, 30, 30));
        JLabel questionLabel = new JLabel("<html><b>Que9: Can cat have two wings   </b></html> ");
        Font currentFont = questionLabel.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() + 5f); // Increase the size by 10
        questionLabel.setFont(newFont);
        panel3.setLayout(new GridLayout(6, 1));
        JRadioButton radioButton1 = new JRadioButton("Yes");
        JRadioButton radioButton2 = new JRadioButton("No");
        JRadioButton radioButton3 = new JRadioButton("Other");
        JRadioButton radioButton4 = new JRadioButton("None");
        buttonGroup = new ButtonGroup(); // Create a new ButtonGroup
        buttonGroup.add(radioButton1); // Add the radio buttons to the ButtonGroup
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);

        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (radioButton2.isSelected()) {
                    count++;
                }
                question10();
            }
        });
        panel3.add(questionLabel);
        panel3.add(radioButton1);
        panel3.add(radioButton2);
        panel3.add(radioButton3);
        panel3.add(radioButton4);
        panel3.add(nextButton);
        frame3.getContentPane().add(panel3);
    }

    public void question10() {
        JFrame frame3 = new JFrame("Quiz Application");
        frame3.setSize(700, 500);
        frame3.setVisible(true);
        frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame3.setLocationRelativeTo(null);
        frame3.setResizable(false);
        JPanel panel3 = new JPanel();
        panel3.setBorder(new EmptyBorder(30, 30, 30, 30));
        JLabel questionLabel = new JLabel("<html><b>Que10: Can man have two eyes   </b></html> ");
        Font currentFont = questionLabel.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() + 5f); // Increase the size by 10
        questionLabel.setFont(newFont);
        panel3.setLayout(new GridLayout(7, 1));
        JRadioButton radioButton1 = new JRadioButton("Yes");
        JRadioButton radioButton2 = new JRadioButton("No");
        JRadioButton radioButton3 = new JRadioButton("Other");
        JRadioButton radioButton4 = new JRadioButton("None");
        buttonGroup = new ButtonGroup(); // Create a new ButtonGroup
        buttonGroup.add(radioButton1); // Add the radio buttons to the ButtonGroup
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);

        JButton nextButton = new JButton("Next");
        JButton resultButton = new JButton("Result");
        resultButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (radioButton1.isSelected()) {
                    count++;
                }
                JOptionPane.showMessageDialog(null, "The total scores are " + count);

                frame3.dispose();
                for (Frame frame : Frame.getFrames()) {
                    frame.dispose();
                }
            }
        });
        nextButton.setEnabled(false);
        panel3.add(questionLabel);
        panel3.add(radioButton1);
        panel3.add(radioButton2);
        panel3.add(radioButton3);
        panel3.add(radioButton4);
        panel3.add(nextButton);
        panel3.add(resultButton);
        frame3.getContentPane().add(panel3);
    }

    public static void main(String[] args) {
        try {
            // Set the look and feel
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            // show the Swing application
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Question q = new Question();

            }
        });
   
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

       }
}
