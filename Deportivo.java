import java.util.Scanner;

public class Deportivo extends Vehiculo {

    //Campos especificos de la subclase.

    private int cilindrada;



    //Constructor de la subclase: incluimos como parametros al menos los del constructor de la superclase

    public Deportivo (String matricula, String marca, String modelo, String color, float tarifaAlquiler, boolean estaDisponible) 
    {

        super(matricula, marca, modelo, color, tarifaAlquiler, estaDisponible);

        cilindrada = 0;
           } //Cierre del constructor

           

    //Metodos especificos de la subclase

    public void setcilindrada (int cilindrada) { 
      this.cilindrada = cilindrada;   
    }//Fin de metodo setcilindrada

    public int getcilindrada () { 
      return cilindrada;   
     }//Fin de metodo getcilindrada


     
       // Imprimir el registro

    public void mostrarRegistro(String matricula, String marca, String modelo, String color, float tarifaAlquiler, boolean estaDisponible, int cilindrada){

        System.out.println ("");
        System.out.println ("****** Vehiculo instanciado desde la clase Deportivo **********");
        System.out.println ("*********************************************************************************************************************************************************************************************************");
        System.out.println ("| Matricula: "+matricula+ " | Marca: "+marca+ " | Modelo: "+modelo+" | Color: "+color+" | Tarifa de alquiler: "+tarifaAlquiler+ " | Disponibilidad: "+estaDisponible+" | Cilindrada: "+ cilindrada+"  |");
        System.out.println ("*********************************************************************************************************************************************************************************************************");

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
            //float montoParcial = 50000*cantidadDias;

            System.out.println ("Total a pagar: "+montoParcial+ "Bs");
        
        }
        else{
            System.out.println ("");
            System.out.println ("ATENCION: El vehiculo no esta disponible");
            System.out.println ("");
        }
        }



} //Cierre de la clase
