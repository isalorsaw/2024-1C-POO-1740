import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
public class Yate extends Coordenada
{
    ImageIcon icono;
    Image imagen;
    public Yate(String ruta, int x, int y)
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
