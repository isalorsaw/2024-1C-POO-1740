import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyListener;//Libreria para esucchar los eventos de teclado
import java.awt.event.KeyEvent;//Libreria para utilizar los eventos de teclado
public class Escenario extends JPanel implements KeyListener //Implementando los eventos del teclado
{
    Fondo f;
    //Yate y;
    Yate arreglo[]=new Yate[4];
    Yate lancha;
    public Escenario()
    {
        f=new Fondo("imagenes/fondo2.png",0,0);//Inicializando el Fondo
        lancha=new Yate("imagenes/lancha.png",300,400);//Inicializando el Fondo
        inicializarYates();
        
        addKeyListener(this);//Incorporando en el Panel que se utilizaran los eventos del teclado
        setFocusable(true);//Vuelve el Panel como prioridad
        
        
        setVisible(true);
    }
    public void keyPressed(KeyEvent evt)//Metodo para detectar al presionar una tecla
    {
        eventoTeclas(evt);
    }
    public void keyReleased(KeyEvent evt)//Metodo para detectar al soltar una tecla
    {
        eventoTeclas(evt);
    }
    public void keyTyped(KeyEvent evt)//Similar al keyPressed
    {
        eventoTeclas(evt);
    }
    public void eventoTeclas(KeyEvent evt)
    {
        int codigo=evt.getKeyCode();
        System.out.println(codigo);
        
        if(codigo==39)//Mover para la derecha
        lancha.mover('r');//right=derecha
        
        repaint();
        
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
        lancha.dibuja(g);
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