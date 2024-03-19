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
    Nave n;
    Timer t;
    Bala b[]=new Bala[0];
    int seg;
    int timer=5;
    public Escenario()
    {
        seg=0;
        f=new Fondo(0,0,"fondo2.png");
        n=new Nave(10,450,"nave.png");
       // p=new Piedra(300,450,"piedra.png");
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
            //if(l.frenar==false)
            actionTimer();
            
            repaint();
        }
    }
    public void actionTimer()
    {
            //System.out.println(seg+"");
            seg++;
            disparoBalas();
            //l.mover('l');
            //Detectando si hay un choque
            /*boolean cho=l.choque(p.rec);
            System.out.println("Choque Piedra y Lancha "+cho);
            if(cho==true)
            {
                 l.frenar();
                 l.explotar();
            }*/
            //l.desaparecer();
    }
    public void inicializarGotas()
    {
        /*for(int i=0;i<got.length;i++)
        {
            int xx=ClaseFM.generaAleatorio(10,700);
            int yy=ClaseFM.generaAleatorio(10,150);
            got[i]=new Gota(xx,yy,"gota.png");
        }*/
    }
    public void dibujarBalas(Graphics g)
    {
        for(int i=0;i<b.length;i++)
        {
            b[i].dibuja(g);
        }
    }
    public void disparoBalas()
    {
        for(int i=0;i<b.length;i++)
        {
            b[i].mover();
        }
        repaint();
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
        //System.out.println(codigo+"");
        if(codigo==38)//aRRIBA
        {
            n.mover('u');
        }
        else if(codigo==40)
        {
            n.mover('d');
        }
        else if(codigo==32)//Mostrar una bala
        {
            agregarBala();
        }
        /*if(codigo==39)//Mov a la derecha
        {
            //y.mover('r',"imagenes/lancha_der.png");//right=derecha
            //y.mover('l');//left=izq
            //y.mover('u');//up=arriba
            //y.mover('d');//down=abajo
        }*/
        //else if(codigo==37)l.mover('l');
        //System.out.println(l.toString());
        repaint();
    }
    public void agregarBala()//Agrandando el arreglo Bala b
    {
        Bala nueva=new Bala(n.x,n.y,"bala.png");
        
        Bala tmp[]=new Bala[b.length+1];
        
        for(int i=0;i<b.length;i++)
        {
            tmp[i]=b[i];
        }
        tmp[b.length]=nueva;
        
        b=new Bala[tmp.length];
        for(int i=0;i<tmp.length;i++)
        {
            b[i]=tmp[i];
        }
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawString("Elaborado por Ing Isaias Salinas",200,200);
        f.dibuja(g);
        dibujarBalas(g);
        //f.dibuja(g);
        n.dibuja(g);
        //y.dibuja(g);
    }
}