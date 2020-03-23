import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSelectionPanel extends JPanel implements ActionListener {
    public static Color SELECTED_COLOR = Color.BLACK;
    JButton[] buttons = new JButton[10];
    Color[] colors = new Color[]{Color.BLACK, Color.RED, Color.GRAY, Color.BLUE, Color.GREEN, Color.WHITE,
            Color.YELLOW, Color.PINK, Color.MAGENTA, Color.ORANGE};

    public ColorSelectionPanel() {
        setLayout(new GridLayout(2, 5));
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setPreferredSize(new Dimension(10, 20));
            buttons[i].setBackground(colors[i]);
            add(buttons[i]);
            buttons[i].addActionListener(this);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SELECTED_COLOR = ((JButton) e.getSource()).getBackground();
    }
}

