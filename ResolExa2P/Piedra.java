/*import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Graphics;*/
import javax.swing.*;
import java.awt.*;
public class Piedra extends Coordenada
{
    ImageIcon icono;
    Image imagen;
    Rectangle rec;
    public Piedra(int x, int y, String ruta)
    {
        super(x,y);
        this.icono=new ImageIcon(getClass().getResource(ruta));
        this.imagen=icono.getImage();
        setRectangle();
    }
    public void setRectangle()
    {
        rec=new Rectangle(x,y,icono.getIconWidth(),icono.getIconHeight());
    }
    
    public void dibuja(Graphics g)
    {
        g.drawImage(imagen,x,y,null);
    }
    public boolean choque(Rectangle otro)//Retorna un true o false si hay un choque o no
    {
        boolean sichoca=rec.intersects(otro);
        return sichoca;
    }
}