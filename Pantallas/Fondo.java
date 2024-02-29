import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
public class Fondo extends Coordenada
{
    ImageIcon icono;
    Image imagen;
    public Fondo(String ruta, int x, int y)
    {
        super(x,y);
        this.icono=new ImageIcon(getClass().getResource(ruta));
        this.imagen=icono.getImage();   
    }
    public void dibuja(Graphics g)
    {
        g.drawImage(imagen,getX(),getY(),null);
    }
}