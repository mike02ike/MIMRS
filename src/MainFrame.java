import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 * @author Michael Ike
 * @version 1.0
 * @since 12/04/2023
 */

/**
 * MainFrame class represents the main frame of Mike's Music Application.
 * It sets up the graphical user interface with text fields, buttons, and labels.
 */
public class MainFrame extends JFrame {
    // Font for the main components
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);

    // Text fields and label components
    JTextField tfFirstName, tfLastName;
    JLabel lbWelcome;

    /**
     * Initializes the graphical user interface components.
     * Sets up panels, labels, buttons, and their functionalities.
     */
    public void initialize() {

        /********** North Panel **********/
        //Welcome and sign-in labels for the north region
        JLabel welcomeLabel = new JLabel("Welcome to Mike Ike's Music Recommendation System (MIMRS)!");
        welcomeLabel.setFont(mainFont);

        JLabel signInLabel = new JLabel("Please Sign In");
        signInLabel.setFont(mainFont);

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2, 1, 5, 5));
        northPanel.setOpaque(false);
        northPanel.add(welcomeLabel);
        northPanel.add(signInLabel);

        /********** Central Panel **********/
        JPanel centralPanel = new JPanel();
        centralPanel.setLayout(new GridLayout(5, 1, 5, 5));
        centralPanel.setOpaque(false);


        JLabel lbFirstName = new JLabel("First Name");
        lbFirstName.setFont(mainFont);

        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);

        JLabel lbLastName = new JLabel("Last Name");
        lbLastName.setFont(mainFont);

        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);

        centralPanel.add(lbFirstName);
        centralPanel.add(tfFirstName);
        centralPanel.add(lbLastName);
        centralPanel.add(tfLastName);
        centralPanel.add(lbWelcome);

        /********** South Panel **********/
        JButton btnOK = new JButton("OK");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String firstName = tfFirstName.getText();
                String lastName = tfLastName.getText();

                if (firstName.isEmpty() || lastName.isEmpty()) {
                    // Show "Incorrect login" message
                    welcomeLabel.setText("INCORRECT LOGIN");
                    signInLabel.setText("");
                    return;
                }else{
                    lbWelcome.setText("Hello " + firstName + " " + lastName);
                    welcomeLabel.setText("");
                }
            }

        });

        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
                welcomeLabel.setText("");
                signInLabel.setText("Please Sign In");
            }
        });

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(1, 2, 5, 5));
        southPanel.setOpaque(false);
        southPanel.add(btnOK);
        southPanel.add(btnClear);

        // Main panel setup
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(centralPanel, BorderLayout.CENTER);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        // Adding the main panel to the frame
        add(mainPanel);

        setTitle("Mike Ike's Music Recommendation System");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }



    /**
     * Entry point for the Music Application.
     * Initializes the MainFrame and initializes the GUI.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }
}
