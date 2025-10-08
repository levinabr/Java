package jaava;

import javax.swing.*;
import java.awt.*;

public class guinew {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame();
        mainFrame.setTitle("GUI");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 300);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6, 2, 10, 10));

        JLabel nameLabel = new JLabel("Name");
        JTextField nameField = new JTextField();

        JLabel emailLabel = new JLabel("Email");
        JTextField emailField = new JTextField();

        JLabel genderLabel = new JLabel("Gender");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup genButtonGroup = new ButtonGroup();
        genButtonGroup.add(male);
        genButtonGroup.add(female);

        JPanel genderPanel = new JPanel();
        genderPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(male);
        genderPanel.add(female);

        JLabel countryLabel = new JLabel("Country");
        String[] countries = {"India", "China", "USA"};
        JComboBox<String> countryBox = new JComboBox<>(countries);

        JLabel addressLabel = new JLabel("Address");
        JTextArea addressArea = new JTextArea(3, 4);
        JScrollPane addressScrollPane = new JScrollPane(addressArea);

        JButton submitBtn = new JButton("Submit");

        mainPanel.add(nameLabel);
        mainPanel.add(nameField);

        mainPanel.add(emailLabel);
        mainPanel.add(emailField);

        mainPanel.add(genderLabel);
        mainPanel.add(genderPanel);

        mainPanel.add(countryLabel);
        mainPanel.add(countryBox);

        mainPanel.add(addressLabel);
        mainPanel.add(addressScrollPane);

        mainPanel.add(new JLabel());
        mainPanel.add(submitBtn);

        mainFrame.add(mainPanel);
        mainFrame.setVisible(true);
    }
}
