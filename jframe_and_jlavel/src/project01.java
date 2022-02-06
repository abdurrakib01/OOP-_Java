import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class project01 extends JFrame implements ActionListener {
    JFrame frame;
    JLabel l1;
    JTextField t1, t2;
    JButton B1;
    project01(){
        this.frame = new JFrame();
        this.t1 = new JTextField(10);
        this.t2 = new JTextField(10);
        this.B1 = new JButton("sub");
        this.l1 = new JLabel();
        this.setLayout(new FlowLayout());
        this.setSize(240, 300);
        this.setTitle("Login page");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        B1.addActionListener(this);
        add(t1);
        add(t2);
        add(B1);
        add(l1);
    }
    public static void main(String[] args){
        project01 p1 = new project01();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int result = num1 - num2;
        l1.setText("Result =" + result);
    }
}
