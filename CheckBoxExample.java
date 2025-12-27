import javax.swing.*;
import java.awt.event.*;

public class CheckBoxExample {

    CheckBoxExample() {

        JFrame f = new JFrame("CheckBox Example");

        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(50, 50, 300, 30);

        JCheckBox checkbox1 = new JCheckBox("C++");
        checkbox1.setBounds(150, 100, 100, 30);

        JCheckBox checkbox2 = new JCheckBox("Java");
        checkbox2.setBounds(150, 150, 100, 30);

        checkbox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("C++ Checkbox: " +
                        (e.getStateChange() == 1 ? "Checked" : "Unchecked"));
            }
        });

        checkbox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("Java Checkbox: " +
                        (e.getStateChange() == 1 ? "Checked" : "Unchecked"));
            }
        });

        f.add(checkbox1);
        f.add(checkbox2);
        f.add(label);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxExample();
    }
}
