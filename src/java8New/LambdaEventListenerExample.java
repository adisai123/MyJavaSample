package java8New;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class LambdaEventListenerExample
{

    public static void main(String[] args)
    {
        JTextField tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        JButton b = new JButton("click");
        b.setBounds(80, 100, 70, 30);
        JFrame f = new JFrame();
        b.addActionListener(e -> {
            tf.setText("hello swing");
            JTextField tfs = new JTextField();
            tfs.setBounds(10, 10, 150, 10);
            f.add(tfs);
        });
        f.add(tf);
        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}