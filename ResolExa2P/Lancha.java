import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Rectangle;
public class Lancha extends Coordenada
{
    ImageIcon icono;
    Image imagen;
    Rectangle rec;
    boolean mostrar;
    boolean frenar;
    public Lancha(int x, int y, String ruta)
    {
        super(x,y);
        this.icono=new ImageIcon(getClass().getResource(ruta));
        this.imagen=icono.getImage();
        setRectangle();
        mostrar=true;
        frenar=false;
    }
    public void setRectangle()
    {
        rec=new Rectangle(x,y,icono.getIconWidth(),icono.getIconHeight());
    }
    public void desaparecer()
    {
        mostrar=false;
    }
    public void frenar()
    {
        frenar=true;
    }
    public void explotar()
    {
        this.icono=new ImageIcon(getClass().getResource("explosion.gif"));
        this.imagen=icono.getImage();
    }
    public void dibuja(Graphics g)
    {
        if(mostrar==true)
        g.drawImage(imagen,x,y,null);
    }
    public void mover(char dir)
    {
        if(frenar==false)
        {
            if(dir=='l')x--;
            
            //Posicionar a la derecha
            if(x<0)x=700;
            
            setRectangle();
        }
    }
    public String toString()
    {
        return super.toString();
    }
    public boolean choque(Rectangle otro)//Retorna un true o false si hay un choque o no
    {
        boolean sichoca=rec.intersects(otro);
        return sichoca;
    }
}