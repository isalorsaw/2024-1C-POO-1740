/*
Pedir y Validar 5 numeros decimales y mostrar
Cuantos fueron Pos, Neg y Neutro.
   */
  import javax.swing.JOptionPane;
  public class PedirDecimales
  {
      public static void main(String args[])
      {
          double numero=0;
          int pos=0;
          int neg=0;
          int neutro=0;
          
          for(int i=0;i<5;i++)
          {
              boolean seguir=true;
              do
              {
                  try
                  {
                      String entrada=JOptionPane.showInputDialog("Ingrese un Numero Decimal");
                      numero=Double.parseDouble(entrada);
                      seguir=false;
                      if(numero==0)neutro++;
                      else if(numero>0)pos++;
                      else neg++;
                  }
                  catch(Exception exp)
                  {
                      JOptionPane.showMessageDialog(null,"Numero No Valido");
                  }
              }while(seguir==true);
          }
          JOptionPane.showMessageDialog(null,"Positivos fueron: "+pos+" Negativo fueron: "+neg+
          " Ceros fueron "+neutro);
      }
  }