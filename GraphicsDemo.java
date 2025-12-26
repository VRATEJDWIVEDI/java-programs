import java.awt.*;
import javax.swing.*;

public class GraphicsDemo extends JFrame {

    public GraphicsDemo() {
        setTitle("Graphics Demo");
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.RED);
        g.drawString("Welcome", 50, 50);
        g.drawLine(20, 30, 20, 300);
        g.drawRect(70, 100, 30, 30);
        g.fillRect(170, 100, 30, 30);
        g.drawOval(70, 200, 30, 30);
        g.setColor(Color.PINK);
        g.fillOval(170, 200, 30, 30);
        g.drawArc(90, 150, 30, 30, 30, 270);
        g.fillArc(270, 150, 30, 30, 0, 180);
    }

    public static void main(String[] args) {
        new GraphicsDemo();
    }
}
