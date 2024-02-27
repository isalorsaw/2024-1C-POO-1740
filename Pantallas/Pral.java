import javax.swing.JFrame;
public class Pral extends JFrame
{
    Escenario e;
    public Pral()
    {
        super("Titulo del Juego");//Titulo del FRame
        e=new Escenario();
        add(e);        
        setSize(500,300);//Tamano del Frame
        setVisible(true);//Ver el Frame;
        setLocationRelativeTo(null);//Centrar el Frame a la pantalla
        
    }
    public static void main(String args[])
    {
        new Pral();
    }
}