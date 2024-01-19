/*
Ingrese 3 notas y mostrar el promedio de ellas.
Si el promedio es mayor o igual a 70 mostrar la palabra Aprobado
sino Reprobado.
*/
import javax.swing.JOptionPane;
public class Ejercicio2
{//Inicio de class
    public static void main(String args[])
    {//Inicio del main
        
        int nota1=0;
        int nota2=0;
        int nota3=0;
        double promedio=0;
        
         //Entrada de primera nota
        String entrada=JOptionPane.showInputDialog("Ingrese la Primera Nota");
        nota1=Integer.parseInt(entrada);
        
        //Entrada de segunda nota
        entrada=JOptionPane.showInputDialog("Ingrese la Segunda Nota");
        nota2=Integer.parseInt(entrada);
        
        //Entrada de segunda nota
        entrada=JOptionPane.showInputDialog("Ingrese la Tercera Nota");
        nota3=Integer.parseInt(entrada);
        
        promedio=(nota1+nota2+nota3)/3;
        
        JOptionPane.showMessageDialog(null,"El promedio es: "+promedio);
        
        if(promedio>=70)
        {
            JOptionPane.showMessageDialog(null,"Aprobado");
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"Reprobado");
        }
        
    }//Fin del main
}//Fin de class