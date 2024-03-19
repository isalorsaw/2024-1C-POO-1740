import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
public class Nave
{
    int salto;//Acelerador
    int x;
    int y;
    ImageIcon icono;
    Image imagen;
    public Nave(int x, int y, String ruta)
    {
        this.x=x;
        this.y=y;
        this.icono=new ImageIcon(getClass().getResource(ruta));
        this.imagen=icono.getImage();
        salto=5;//Acelerar mas 5
    }
    public void dibuja(Graphics g)
    {
        g.drawImage(imagen,x,y,null);
    }
    public void mover(char d)
    {
        if(d=='u')y-=salto;
        else if(d=='d')y+=salto;
    }
}