/*
Ingrese 3 Numeros y Mostrar la Suma de ellos.
Utilizando la libreria del JOptionPane   
*/
import javax.swing.JOptionPane;
public class Ejercicio1
{//Inicio
    public static void main(String args[])
    {//Inicio main
        
        //Entrada de informacion
        String entrada=JOptionPane.showInputDialog("Ingrese el Primer Numero");
        int n1=Integer.parseInt(entrada);
        
        //Entrada de informacion
        entrada=JOptionPane.showInputDialog("Ingrese el Primer Numero");
        int n2=Integer.parseInt(entrada);
        
        int suma=n1+n2;
        
        //Salida
        //JOptionPane.showMessageDialog(null,"La Suma Es: "+suma);
        JOptionPane.showMessageDialog(null,"La Suma Es: "+suma,
        "Aqui va el Titulo",2);
        //0=Error
        //1=Informacion
        //2=Alerta
    }//Fin Main
    
    //Metodo = void (Retornar vacio)
    public static void mensaje(String msg)
    {
        
    }
    
    //Funciones = Retorna un valor (int,double,float,char,string)
    public static int suma(int n1, int n2)
    {
        return 0;
    }
}//Fin