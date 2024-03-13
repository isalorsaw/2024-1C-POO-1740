import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
public class Fondo extends Coordenada
{
    ImageIcon icono;
    Image imagen;
    public Fondo(int x, int y, String ruta)
    {
        super(x,y);
        this.icono=new ImageIcon(getClass().getResource(ruta));
        this.imagen=icono.getImage();
    }
    public void dibuja(Graphics g)
    {
        g.drawImage(imagen,x,y,null);
    }
}