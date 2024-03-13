import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
public class Lancha extends Coordenada
{
    ImageIcon icono;
    Image imagen;
    public Lancha(int x, int y, String ruta)
    {
        super(x,y);
        this.icono=new ImageIcon(getClass().getResource(ruta));
        this.imagen=icono.getImage();
    }
    public void dibuja(Graphics g)
    {
        g.drawImage(imagen,x,y,null);
    }
    public void mover(char dir)
    {
        if(dir=='l')x--;
        
        //Posicionar a la derecha
        if(x<0)x=700;
    }
    public String toString()
    {
        return super.toString();
    }
}