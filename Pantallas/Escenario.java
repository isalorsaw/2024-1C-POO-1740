import javax.swing.JPanel;
import java.awt.Graphics;
public class Escenario extends JPanel
{
    Fondo f;
    //Yate y;
    Yate arreglo[]=new Yate[4];
    public Escenario()
    {
        f=new Fondo("imagenes/fondo2.png",0,0);//Inicializando el Fondo
        //y=new Yate("imagenes/yate_der.png",10,400);//Inicializando el Fondo
        inicializarYates();
        setVisible(true);
    }
    public void inicializarYates()
    {
        int xx=10;
        for(int i=0;i<arreglo.length;i++)
        {
            xx+=(i*60);
            arreglo[i]=new Yate("imagenes/yate_der.png",xx,400);
        }
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        
        g.drawString("Elaborado por Ing Isaias Salinas",300,300);
        f.dibuja(g);//Dibujo el Fondo
        //y.dibuja(g);//Dibujo el Fondo
        dibujarYates(g);
    }
    public void dibujarYates(Graphics g)
    {
        int xx=10;
        for(int i=0;i<arreglo.length;i++)
        {
            arreglo[i].dibuja(g);
        }
    }
}