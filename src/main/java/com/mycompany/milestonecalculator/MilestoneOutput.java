/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.milestonecalculator;

/**
 *
 * @author Cha
 */
import javax.swing.*;
import java.awt.event.*;
import javax.swing.SpringLayout;

public class MilestoneOutput extends JFrame {
    // Declare private variables for the Swing components
    private JLabel label1, label2, label3, label4, label5, label6;
    private JTextField tf1, tf2, tf3, tf4, tf5, tf6;
    private JButton closeButton;
    
    public MilestoneOutput(Student stud) {
        // Set up the frame
        super("Computation");
        setSize(450, 250);


        // Compute Average
        stud.computeAverage();


        // Create the components
        // Create labels
        label1 = new JLabel("Student Name:");
        label2 = new JLabel("Student Number:");
        label3 = new JLabel("Milestone 1:");
        label4 = new JLabel("Milestone 2:");
        label5 = new JLabel("Terminal Assessment:");
        label6 = new JLabel("Average Grade:");
       
        // Create Student Name textfield
        tf1 = new JTextField(30);
        tf1.setEnabled(false);
        tf1.setText(stud.getStudentName());
       
        // Create Student Number textfield
        tf2 = new JTextField(30);
        tf2.setEnabled(false);
        tf2.setText(stud.getStudentNumber());
       
        // Create Milestone 1 textfield
        tf3 = new JTextField(10);
        tf3.setEnabled(false);
        tf3.setText(stud.getm1());
       
        // Create Quiz 2 textfield
        tf4 = new JTextField(10);
        tf4.setEnabled(false);
        tf4.setText(stud.getm2());
       
        // Create Quiz 3 textfield
        tf5 = new JTextField(10);
        tf5.setEnabled(false);
        tf5.setText(stud.getm3());
       
        // Create Average Grade textfield
        tf6 = new JTextField(10);
        tf6.setEnabled(false);
        tf6.setText(stud.getAveGrade());
       
        // Create Close button
        closeButton = new JButton("Close");
       
        // Define the panel to hold the components  
        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();
        panel.setSize(50, 50);
        panel.setLayout(layout);
       
        // Add the components to the frame
        panel.add(label1);
        panel.add(tf1);
        panel.add(label2);
        panel.add(tf2);
        panel.add(label3);
        panel.add(tf3);
        panel.add(label4);
        panel.add(tf4);
        panel.add(label5);
        panel.add(tf5);
        panel.add(label6);
        panel.add(tf6);
        panel.add(closeButton);
 
        // Put constraint on components
        // Set label position: left
        layout.putConstraint(SpringLayout.WEST, label1, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, label2, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, label3, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, label4, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, label5, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, label6, 6, SpringLayout.WEST, panel);
       
        // Set label and textfield position: top and bottom
        layout.putConstraint(SpringLayout.NORTH, label1, 6, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.NORTH, tf1, 6, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.NORTH, label2, 10, SpringLayout.SOUTH, label1);
        layout.putConstraint(SpringLayout.NORTH, tf2, 6, SpringLayout.SOUTH, tf1);
        layout.putConstraint(SpringLayout.NORTH, label3, 10, SpringLayout.SOUTH, label2);
        layout.putConstraint(SpringLayout.NORTH, tf3, 6, SpringLayout.SOUTH, tf2);
        layout.putConstraint(SpringLayout.NORTH, label4, 10, SpringLayout.SOUTH, label3);
        layout.putConstraint(SpringLayout.NORTH, tf4, 6, SpringLayout.SOUTH, tf3);
        layout.putConstraint(SpringLayout.NORTH, label5, 10, SpringLayout.SOUTH, label4);
        layout.putConstraint(SpringLayout.NORTH, tf5, 6, SpringLayout.SOUTH, tf4);
        layout.putConstraint(SpringLayout.NORTH, label6, 10, SpringLayout.SOUTH, label5);
        layout.putConstraint(SpringLayout.NORTH, tf6, 6, SpringLayout.SOUTH, tf5);
       
        // Set textfield position: right
        layout.putConstraint(SpringLayout.WEST, tf1, 52, SpringLayout.EAST, label1);
        layout.putConstraint(SpringLayout.WEST, tf2, 40, SpringLayout.EAST, label2);
        layout.putConstraint(SpringLayout.WEST, tf3, 70, SpringLayout.EAST, label3);
        layout.putConstraint(SpringLayout.WEST, tf4, 70, SpringLayout.EAST, label4);
        layout.putConstraint(SpringLayout.WEST, tf5, 10, SpringLayout.EAST, label5);
        layout.putConstraint(SpringLayout.WEST, tf6, 50, SpringLayout.EAST, label6);
       
        // Set button position
        layout.putConstraint(SpringLayout.NORTH, closeButton, 6, SpringLayout.SOUTH, tf6);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, closeButton, 0, SpringLayout.HORIZONTAL_CENTER, panel);


        //Add panel to frame
        add(panel);


        // Add an ActionListener to the button
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
   
    }
}
