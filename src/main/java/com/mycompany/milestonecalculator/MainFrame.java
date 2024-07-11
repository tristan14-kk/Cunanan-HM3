/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.milestonecalculator;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.SpringLayout;


/**
 *
 * @author Cha
 */

public class MainFrame extends JFrame {
    // Declare private variables for the Swing components
    private JLabel label1, label2, label3, label4, label5;
    private JTextField tf1, tf2, tf3, tf4, tf5;
    private JButton calculateButton;

    
    MainFrame(){
        // Set up the frame
        super("Grade Calculator");
        setSize(450, 250);


        // Create the components
        // Create labels and textfields
        label1 = new JLabel("Student Name:");
        tf1 = new JTextField(30);
        label2 = new JLabel("Student Number:");
        tf2 = new JTextField(30);
        label3 = new JLabel("Milestone 1:");
        tf3 = new JTextField(10);    
        label4 = new JLabel("Milestone 2:");
        tf4 = new JTextField(10);
        label5 = new JLabel("Terminal Assessment:");
        tf5 = new JTextField(10);
        calculateButton = new JButton("Compute");
       
        // Define the panel to hold the components  
        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();
        panel.setSize(300, 250);
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
        panel.add(calculateButton);
 
        // Put constraint on components
        // Set label position: left
        layout.putConstraint(SpringLayout.WEST, label1, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, label2, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, label3, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, label4, 6, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.WEST, label5, 6, SpringLayout.WEST, panel);
       
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
       
        // Set textfield position: right
        layout.putConstraint(SpringLayout.WEST, tf1, 52, SpringLayout.EAST, label1);
        layout.putConstraint(SpringLayout.WEST, tf2, 40, SpringLayout.EAST, label2);
        layout.putConstraint(SpringLayout.WEST, tf3, 70, SpringLayout.EAST, label3);
        layout.putConstraint(SpringLayout.WEST, tf4, 70, SpringLayout.EAST, label4);
        layout.putConstraint(SpringLayout.WEST, tf5, 10, SpringLayout.EAST, label5);
       
        // Set button position
        layout.putConstraint(SpringLayout.NORTH, calculateButton, 6, SpringLayout.SOUTH, tf5);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, calculateButton, 0, SpringLayout.HORIZONTAL_CENTER, panel);


        //Add panel to frame
        add(panel); 
               
        
        
        setVisible(true);
        
        
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Instantiate Student class
                Student stud = new Student();
                
               
                // Assign textfield values to stud object
                stud.setStudentName(tf1.getText());
                stud.setStudentNumber(tf2.getText());
                
                float numtf3 =  Float.parseFloat(tf3.getText());
                float numtf4 =  Float.parseFloat(tf4.getText());
                float numtf5 =  Float.parseFloat(tf5.getText());
                
                if(numtf3<0 | numtf3>100| numtf4<0 | numtf4>100 | numtf5<0 | numtf5>100){
                    JOptionPane.showMessageDialog(null, "Enter values ranging 0-100", 
                            "Entry Error", JOptionPane.ERROR_MESSAGE);                 
                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("");
                    tf4.setText("");
                    tf5.setText("");
                }
                
                else{
                
                stud.setm1(Float.parseFloat(tf3.getText()));
                stud.setm2(Float.parseFloat(tf4.getText()));
                stud.setm3(Float.parseFloat(tf5.getText()));
               
                // Instantiate and call GradeOutput class
                MilestoneOutput output = new MilestoneOutput(stud);
                output.setVisible(true);
                dispose();
                }
            }
        });
    }
    
}
