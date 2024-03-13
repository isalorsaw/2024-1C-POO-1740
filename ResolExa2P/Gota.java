import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
public class Gota extends Coordenada
{
    ImageIcon icono;
    Image imagen;
    public Gota(int x, int y, String ruta)
    {
        super(x,y);
        this.icono=new ImageIcon(getClass().getResource(ruta));
        this.imagen=icono.getImage();
    }
    public void dibuja(Graphics g)
    {
        g.drawImage(imagen,x,y,null);
    }
    public void caida()
    {
        y++;
        
        if(y>150)y=10;
    }
}