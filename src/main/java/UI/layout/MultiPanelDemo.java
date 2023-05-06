package UI.layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MultiPanelDemo implements ActionListener {

    JFrame frame;
    JPanel panelContainer, panel1, panel2, panel3;
    JButton button1, button2, button3;

    public static void main(String[] args) {
        new MultiPanelDemo();
    }

    public MultiPanelDemo() {
        frame = new JFrame("MultiPanel Demo");
        panelContainer = new JPanel(new BorderLayout());

        // Panel 1
        panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panelContainer.add(panel1, BorderLayout.CENTER);

        // Panel 2
        panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);

        // Panel 3
        panel3 = new JPanel();
        panel3.setBackground(Color.BLUE);

        // Buttons
        button1 = new JButton("Panel 1");
        button1.addActionListener(this);
        panelContainer.add(button1, BorderLayout.NORTH);

        button2 = new JButton("Panel 2");
        button2.addActionListener(this);
        panelContainer.add(button2, BorderLayout.WEST);

        button3 = new JButton("Panel 3");
        button3.addActionListener(this);
        panelContainer.add(button3, BorderLayout.EAST);

        frame.add(panelContainer);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            panelContainer.remove(panel2);
            panelContainer.remove(panel3);
            panelContainer.add(panel1, BorderLayout.CENTER);
            panelContainer.revalidate();
            panelContainer.repaint();
        } else if (e.getSource() == button2) {
            panelContainer.remove(panel1);
            panelContainer.remove(panel3);
            panelContainer.add(panel2, BorderLayout.CENTER);
            panelContainer.revalidate();
            panelContainer.repaint();
        } else if (e.getSource() == button3) {
            panelContainer.remove(panel1);
            panelContainer.remove(panel2);
            panelContainer.add(panel3, BorderLayout.CENTER);
            panelContainer.revalidate();
            panelContainer.repaint();
        }
    }
}