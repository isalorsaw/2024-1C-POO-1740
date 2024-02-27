import javax.swing.JPanel;
import java.awt.Graphics;
public class Escenario extends JPanel
{
    public Escenario()
    {
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        
        g.drawString("Elaborado por Ing Isaias Salinas",300,300);
    }
}