package Lesson8;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    int count = 0;

    public Main() {
        setBounds(300, 300, 300, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Counter");
        setResizable(false);



        JLabel counter = new JLabel("0");
        JButton leftButton = new JButton("<");
        leftButton.setBackground(Color.LIGHT_GRAY);
        JButton rightButton = new JButton(">");
        rightButton.setBackground(Color.LIGHT_GRAY);

        Font font = new Font("Digital-7 Mono", Font.BOLD, 42);

        counter.setFont(font);
        counter.setHorizontalAlignment(SwingConstants.CENTER);

                leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                counter.setText(String.valueOf(count));
            }
        });

        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                counter.setText(String.valueOf(count));
            }
        });

        add(leftButton, BorderLayout.WEST);
        add(rightButton, BorderLayout.EAST);
        add(counter, BorderLayout.CENTER);

    setVisible(true);

    }

    public static void main(String[] args) {

        new Main();

    }


}
