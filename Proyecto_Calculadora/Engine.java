package Proyecto_Calculadora;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

public class Engine {

    private JFrame frame;
    private JPanel contentPanel;
    private JPanel displayPanel;
    private JPanel buttonPanel;
    private JTextField display;
    private JButton n0, n1, n2, n3, n4, n5, n6, n7, n8, n9;
    private JButton divide, multiply, subtract, add, equal, reset;

    public Engine() {
        setSettings();
    }

    public void setSettings() {
        frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setLayout(new GridLayout());
        frame.getContentPane().setBackground(new Color(33, 33, 33));
        frame.getRootPane().setBorder(BorderFactory.createLineBorder(new Color(128, 0, 128), 3));

        contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(2, 1));
        contentPanel.setBackground(new Color(33, 33, 33));

        display = new JTextField();
        display.setEditable(false);
        display.setBackground(new Color(33, 33, 33));
        display.setForeground(Color.WHITE);
        display.setBorder(BorderFactory.createLineBorder(new Color(128, 0, 128), 2));

        displayPanel = new JPanel(new GridLayout(1, 1));
        displayPanel.add(display);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));
        buttonPanel.setBackground(new Color(33, 33, 33));

        n0 = new JButton("0");
        n1 = new JButton("1");
        n2 = new JButton("2");
        n3 = new JButton("3");
        n4 = new JButton("4");
        n5 = new JButton("5");
        n6 = new JButton("6");
        n7 = new JButton("7");
        n8 = new JButton("8");
        n9 = new JButton("9");
        divide = new JButton("/");
        multiply = new JButton("*");
        subtract = new JButton("-");
        add = new JButton("+");
        equal = new JButton("=");
        reset = new JButton("C");

        JButton[] buttons = { n1, n2, n3, divide, n4, n5, n6, multiply, n7, n8, n9, subtract, reset, n0, equal, add };

        for (JButton button : buttons) {
            buttonPanel.add(button);
            setFeaturesButton(button);
        }

        contentPanel.add(displayPanel, BorderLayout.NORTH);
        contentPanel.add(buttonPanel, BorderLayout.CENTER);

        frame.add(contentPanel);
        frame.setVisible(true);
    }

    public void setFeaturesButton(JButton boton) {
        boton.setFont(new Font("Arial", Font.PLAIN, 18));
        boton.setBackground(new Color(50, 50, 50));
        boton.setForeground(Color.WHITE);
        
        boton.setBorder(BorderFactory.createLineBorder(new Color(128, 0, 128), 2));
        boton.setBorder(BorderFactory.createCompoundBorder(boton.getBorder(),BorderFactory.createEmptyBorder(10, 15, 10, 15)));
    }
}
