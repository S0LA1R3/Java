import java.awt.Graphics;
import javax.swing.JPanel;

public class Draw extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        int width = getWidth();
        int newWidth = width;
        int height = getHeight()+37;
        int newHeight = height;
        int move = 0;

        while (newHeight > 0)
        {
            move += 15;
            newWidth -= 15;
            g.drawLine(0 , move, move, height);
            g.drawLine(width, move, newWidth, height);
            g.drawLine(0, newHeight, move, 0);
            g.drawLine(width, newHeight, newWidth, 0);
            newHeight -= 15;
            System.out.printf("%d %d %d%n", move, newHeight, newWidth);
        }
    }
}
