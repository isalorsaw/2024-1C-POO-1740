import javax.swing.JPanel;
import java.awt.Graphics;
public class Escenario extends JPanel
{
    Fondo f;
    Yate y;
    public Escenario()
    {
        f=new Fondo("imagenes/fondo2.png",0,0);//Inicializando el Fondo
        y=new Yate("imagenes/yate_der.png",10,400);//Inicializando el Fondo
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        
        g.drawString("Elaborado por Ing Isaias Salinas",300,300);
        f.dibuja(g);//Dibujo el Fondo
        y.dibuja(g);//Dibujo el Fondo
    }
}