import java.util.Scanner;

public class Turismo extends Vehiculo {

    //Campos especificos de la subclase.

    private int numeroDePuertas;

    private boolean tipoDeMarchaAutomatica;

   

    //Constructor de la subclase: incluimos como parametros al menos los del constructor de la superclase

    public Turismo (String matricula, String marca, String modelo, String color, float tarifaAlquiler, boolean estaDisponible) 
    {

        super(matricula, marca, modelo, color, tarifaAlquiler, estaDisponible);

        numeroDePuertas = 0;
        tipoDeMarchaAutomatica = false;
     
    } //Cierre del constructor



    //Metodos especificos de la subclase

    public void setnumeroDePuertas (int numeroDePuertas) { 
      this.numeroDePuertas = numeroDePuertas;   
    }//Fin de metodo setnumeroDePuertas

    public int getnumeroDePuertas () { 
      return numeroDePuertas;   
     }//Fin de metodo getnumeroDePuertas

    public void settipoDeMarchaAutomatica (boolean tipoDeMarchaAutomatica) { 
        this.tipoDeMarchaAutomatica = tipoDeMarchaAutomatica;   
      }//Fin de metodo settipoDeMarchaAutomatica
  
    public boolean gettipoDeMarchaAutomatica () { 
        return tipoDeMarchaAutomatica;   
       }//Fin de metodo gettipoDeMarchaAutomatica

       

       // Imprimir el registro

    public void mostrarRegistro(String matricula, String marca, String modelo, String color, float tarifaAlquiler, boolean estaDisponible, int numeroDePuertas, boolean tipoDeMarchaAutomatica){

        System.out.println ("");
        System.out.println ("****** Vehiculo instanciado desde la clase Turismo **********");
        System.out.println ("**********************************************************************************************************************************************************************************************************************************************");
        System.out.println ("| Matricula: "+matricula+ " | Marca: "+marca+ " | Modelo: "+modelo+" | Color: "+color+" | Tarifa de alquiler: "+tarifaAlquiler+ " | Disponibilidad: "+estaDisponible+" | Nro. de puertas: "+ numeroDePuertas+" | Marcha automatica: "+tipoDeMarchaAutomatica+"  |");
        System.out.println ("**********************************************************************************************************************************************************************************************************************************************");

    }

    // Procesar e imprimir el calculo del monto del alquiler; siempre y cuando
    // el vehiculo este disponible

    public void calcularMontoAlquiler(boolean estaDisponible, float tarifaAlquiler) {

        if (estaDisponible == true){

            Scanner teclado = new Scanner(System.in);

            System.out.println ("Cantidad de dias ");
            int cantidadDias = teclado.nextInt();
            
            float montoParcial = tarifaAlquiler*cantidadDias;
            // Tambien puede ser asi el calculo:
            //float montoParcial = 100000*cantidadDias;
    
            System.out.println ("El recorrido sera foraneo? 1 Si   0 No");
    
            int foraneo = teclado.nextInt();
    
            if (foraneo == 1) {
                
                float incremento = montoParcial*0.15f;
                float montoTotal = montoParcial + incremento;
                System.out.println ("Total a pagar: "+montoTotal+ "Bs");
            }
            else{
                System.out.println ("Total a pagar: "+montoParcial+ "Bs");
    
            }
    
 
        }
        else{
            System.out.println ("");
            System.out.println ("ATENCION: El vehiculo no esta disponible");
            System.out.println ("");
        }
        }//Fin de metodo calcularMontoAlquiler





} //Cierre de la clase
