import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class PaintPanel extends JPanel implements MouseMotionListener, MouseListener {

    public static final int PANEL_SIZE = 500;
    Cell[][] cells = new Cell[(PANEL_SIZE / Cell.SIZE)][(PANEL_SIZE / Cell.SIZE)];

    {//Init Block
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    PaintPanel() {
        setPreferredSize(new Dimension(500, 500));
        addMouseMotionListener(this);
        addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        for (int col = 0; col < cells.length; col++) {
            for (int row = 0; row < cells.length; row++) {
                g2d.setColor(cells[col][row].getColor());
                g2d.fillRect(col * Cell.SIZE, row * Cell.SIZE, Cell.SIZE, Cell.SIZE);
            }
        }
    }


    @Override
    public void mouseDragged(MouseEvent e) {
        int x = e.getX(), y = e.getY();
        int col = x / Cell.SIZE, row = y / Cell.SIZE;
        cells[col][row].setColor(ColorSelectionPanel.SELECTED_COLOR);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        switch (e.getButton()) {
            case MouseEvent.BUTTON1:
                int x = e.getX(), y = e.getY();
                int col = x / Cell.SIZE, row = y / Cell.SIZE;
                cells[col][row].setColor(ColorSelectionPanel.SELECTED_COLOR);
                repaint();
                return;
            case MouseEvent.BUTTON3:
                for (int i = 0; i < cells.length; i++) {
                    for (int j = 0; j < cells[i].length; j++) {
                        cells[i][j].setColor(Color.WHITE);
                    }
                }
                repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
