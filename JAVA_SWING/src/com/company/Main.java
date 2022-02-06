package com.company;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import java.awt.*;
public class Main {

    public static void main(String[] args) {
        ImageIcon image1 = new ImageIcon("icon.jpg");
        Border border = BorderFactory.createLineBorder(Color.green,2);
        JLabel label = new JLabel("Abdur Rakib"); // create a label
        label.setIcon(image1);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text left, center, right of image icon
        label.setVerticalTextPosition(JLabel.BOTTOM); // set text top, center, bottom of image icon
        label.setForeground(Color.white); // set the color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,20)); // set font of text
        label.setIconTextGap(2); // set gap to text image
        label.setBorder(border); // add border color
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(100, 0, 250, 250); // set x and y position within frame as well as dimension




        JFrame frame = new JFrame(); // create a frame
        frame.setSize(420, 420); // set the x-dimension and y-dimension of frame
        frame.setTitle("Java swing project"); // set tittle of frame
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); // exit out of application
        //frame.setResizable(false); // prevent frame from bing resize

        ImageIcon image = new ImageIcon("icon.jpg"); // create an image icon
        frame.setIconImage(image.getImage()); // change icon of frame
        frame.getContentPane().setBackground(new Color(0,0,0)); // change color of background
        frame.add(label);
        //frame.setLayout(null); // when we use set bounds we need this
        frame.setVisible(true); // make frame visible


    }
}
