import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String... args) {   JFrame frame = new JFrame();
        frame.add(new PaintPanel(), BorderLayout.NORTH);
        frame.add(new ColorSelectionPanel(), BorderLayout.SOUTH);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        JOptionPane.showMessageDialog(frame, "User LMB To paint and RMB to clear screen!!");
    }
}

