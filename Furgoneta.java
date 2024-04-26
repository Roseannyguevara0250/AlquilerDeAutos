import java.util.Scanner;

public class Furgoneta extends Vehiculo {

    //Campos especificos de la subclase.

    private float capacidadDeCarga;
    private float volumen;


    //Constructor de la subclase: incluimos como parametros al menos los del constructor de la superclase

    public Furgoneta (String matricula, String marca, String modelo, String color, float tarifaAlquiler, boolean estaDisponible) 
    {

        super(matricula, marca, modelo, color, tarifaAlquiler, estaDisponible);

        capacidadDeCarga = 0;
        volumen = 0;
           } //Cierre del constructor



    //Metodos especificos de la subclase

    public void setcapacidadDeCarga (float capacidadDeCarga) { 
      this.capacidadDeCarga = capacidadDeCarga;   
    }//Fin de metodo setcapacidadDeCarga

    public float getcapacidadDeCarga () { 
      return capacidadDeCarga;   
     }//Fin de metodo getcapacidadDeCarga

     public void setvolumen (float volumen) { 
        this.volumen = volumen;   
      }//Fin de metodo setvolumen
  
      public float getvolumen () { 
        return volumen;   
       }//Fin de metodo getvolumen



       
       // Imprimir el registro
       
    public void mostrarRegistro(String matricula, String marca, String modelo, String color, float tarifaAlquiler, boolean estaDisponible, float capacidadDeCarga, float volumen){

        System.out.println ("");
        System.out.println ("****** Vehiculo instanciado desde la clase Furgoneta **********");
        System.out.println ("**********************************************************************************************************************************************************************************************************************************************");
        System.out.println ("| Matricula: "+matricula+ " | Marca: "+marca+ " | Modelo: "+modelo+" | Color: "+color+" | Tarifa de alquiler: "+tarifaAlquiler+ " | Disponibilidad: "+estaDisponible+" | Capacidad de carga: "+ capacidadDeCarga+"KG | Volumen: "+volumen+" metros cubicos  |");
        System.out.println ("**********************************************************************************************************************************************************************************************************************************************");

    }

    // Procesar e imprimir el calculo del monto del alquiler; siempre y cuando
    // el vehiculo este disponible
       
    public void calcularMontoAlquiler(boolean estaDisponible, float capacidadDeCarga, float tarifaAlquiler) {

        if (estaDisponible == true){

            Scanner teclado = new Scanner(System.in);

            System.out.println ("Cantidad de dias ");
            int cantidadDias = teclado.nextInt();

            float montoParcial = tarifaAlquiler*cantidadDias;
            // Tambien puede ser asi el calculo:
            //float montoParcial = 90000*cantidadDias;

            if (capacidadDeCarga > 600)
            {
                float incremento = montoParcial*0.25f;
                float montoTotal = montoParcial + incremento;
                System.out.println ("Total a pagaaar: "+montoTotal+ "Bs");
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
