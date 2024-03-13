import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyListener;//Libreria para evento de teclado
import java.awt.event.KeyEvent;//Libreria para utilizar variable de evento del teclado

//Librerias para Mover Automatico
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Escenario extends JPanel implements KeyListener,ActionListener
{
    Fondo f;
    Gota got[]=new Gota[30];
    Lancha l;
    Timer t;
    int seg;
    int timer=5;
    public Escenario()
    {
        seg=0;
        f=new Fondo(0,0,"fondo.png");
        l=new Lancha(10,450,"lancha.png");
        inicializarGotas();
        //y=new Yate("imagenes/lancha.png",10,450);
        //System.out.println(f.toString());
        
        //Inicializar el Timer
        t=new Timer(timer,null);
        t.start();
        t.addActionListener(this);
        
        
        addKeyListener(this);//Agregar en en JPanel el evento del teclado
        setFocusable(true);//Linea para priorizar el Panel
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==t)
        {
            //System.out.println(seg+"");
            seg++;
            caidaGotas();
            
    
            l.mover('l');
            repaint();
        }
        /*else if(e.getSource()==t2)
        {
            
        }*/
    }
    public void inicializarGotas()
    {
        for(int i=0;i<got.length;i++)
        {
            int xx=ClaseFM.generaAleatorio(10,700);
            int yy=ClaseFM.generaAleatorio(10,150);
            got[i]=new Gota(xx,yy,"gota.png");
        }
    }
    public void dibujarGotas(Graphics g)
    {
        for(int i=0;i<got.length;i++)
        {
            got[i].dibuja(g);
        }
    }
    public void caidaGotas()
    {
        for(int i=0;i<got.length;i++)
        {
            got[i].caida();
            repaint();
        }
    }
    public void keyTyped(KeyEvent evt)
    {
        eventoTeclas(evt);
    }
    public void keyPressed(KeyEvent evt)
    {
        eventoTeclas(evt);
    }
    public void keyReleased(KeyEvent evt)
    {
        eventoTeclas(evt);
    }
    //Tratar los movimientos de las teclas
    public void eventoTeclas(KeyEvent evt)
    {
        int codigo=evt.getKeyCode();//Codigo ASCII que cada tecla
        if(codigo==39)//Mov a la derecha
        {
            //y.mover('r',"imagenes/lancha_der.png");//right=derecha
            //y.mover('l');//left=izq
            //y.mover('u');//up=arriba
            //y.mover('d');//down=abajo
        }
        else if(codigo==37)l.mover('l');
        //System.out.println(l.toString());
        repaint();
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawString("Elaborado por Ing Isaias Salinas",200,200);
        f.dibuja(g);
        dibujarGotas(g);
        l.dibuja(g);
        //y.dibuja(g);
    }
}