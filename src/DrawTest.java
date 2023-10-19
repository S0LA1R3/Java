import javax.swing.JFrame;


public class DrawTest
{
    public static void main(String[] args)
    {
        Draw panel = new Draw();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
    }
}
