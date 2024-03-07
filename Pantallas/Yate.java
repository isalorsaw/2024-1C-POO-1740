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
    public void setImagen(String ruta)
    {
        this.icono=new ImageIcon(getClass().getResource(ruta));
        this.imagen=icono.getImage();
    }
    public void dibuja(Graphics g)
    {
        g.drawImage(imagen,getX(),getY(),null);
    }
    public void mover(char dir)
    {
        if(dir=='r')//mov a la derecha = right
        {
            //int xx=getX();
            //setX(xx++);
            //int xx=this.getX()+1;
            //setX(xx);
            x++;
        }
        else if(dir=='l')//mov a la izq =left
        {
            x--;
        }
        else if(dir=='u')//mov para arriba =up
        {
            
        }
        else if(dir=='d')//mov para abajo =down
        {
            
        }
    }
    public void mover(char dir, String ruta)
    {
        if(dir=='r')x++;
        else if(dir=='l')x--;
        else if(dir=='u')//mov para arriba =up
        {
            
        }
        else if(dir=='d')//mov para abajo =down
        {
            
        }
        setImagen(ruta);
    }
}
