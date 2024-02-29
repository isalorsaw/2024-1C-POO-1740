public class Coordenada
{
    //Atributos
    private int x;
    private int y;
    //Constructor Vacio
    public Coordenada()
    {
        x=y=0;
    }
    public Coordenada(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public void setX(int x)
    {
        this.x=x;
    }
    public void setY(int y)
    {
        this.y=y;
    }
    public String toString()
    {
        return x+" "+y;
    }
}