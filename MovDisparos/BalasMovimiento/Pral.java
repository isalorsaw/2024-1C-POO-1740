import javax.swing.JFrame;
import java.awt.Dimension;
public class Pral extends JFrame
{
    //Variables Globales
    Escenario e;
    Dimension dim;//Captura parametros de pantalla
    public Pral()
    {
        super("Mi Titulo");//Llamar al Constructor de Frame y enviarle el titulo
        
        e=new Escenario();
        add(e);
        
        setSize(730,600);//Tamano Alto y Ancho del Frame (pixels)
        
        //dim=super.getToolkit().getScreenSize();
        //super.setSize(dim);
        
        setLocationRelativeTo(null);//Centrar el Frame con el Monitor
        //setVisible(false);//Mostrar el Frame.
    }
    public static void main(String args[])
    {
        //Variables Locales
        Pral pantalla=new Pral();
        //pantalla.setVisible(true);
        pantalla.show();
        //pantalla.hide();
    }
}