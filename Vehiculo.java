import java.util.Scanner;

public class Vehiculo {

    // Definir atributos de la clase madre

    private String matricula;

    private String marca;

    private String modelo;

    private String color;

    private float tarifaAlquiler;

    private boolean estaDisponible;



    //Constructor

    public Vehiculo (String matricula, String marca, String modelo, String color, float tarifaAlquiler, boolean estaDisponible) 
    {

        this.matricula = matricula;

        this.marca = marca;

        this.modelo = modelo;

        this.color = color;

        this.tarifaAlquiler = tarifaAlquiler;

        this.estaDisponible = estaDisponible; 
        
    }

    //Metodos

    public void setmatricula (String matricula){
        this.matricula=matricula;
     } //Fin del metodo setmatricula
     
     
    public void setmarca (String marca){
        this.marca=marca;
     } //Fin del metodo setmarca
     
     
       
    public void setmodelo (String modelo){
        this.modelo=modelo;
     } //Fin del metodo setmodelo
  
     
    public void setcolor (String color){
        this.color=color;
     } //Fin del metodo setcolor
     
     
    public void settarifaAlquiler (float tarifaAlquiler){
        this.tarifaAlquiler=tarifaAlquiler;
     } //Fin del metodo settarifaAlquiler

    public void setestaDisponible (boolean estaDisponible){
        this.estaDisponible=estaDisponible;
     } //Fin del metodo setestaDisponible




    //Metodos Get u Obtener de todos los atributos


    public String getmatricula (){
        return matricula;
    } //Fin del metodo getmatricula


    public String getmarca (){
        return marca;
    } //Fin del metodo getmarca
 
 

    public String getmodelo (){
        return modelo;
    } //Fin del metodo getmodelo

 

    public String getcolor (){
        return color;
    } //Fin del metodo getcolor


    public float gettarifaAlquiler (){
        return tarifaAlquiler;
    } //Fin del metodo gettarifaAlquiler


    public boolean getestaDisponible (){
        return estaDisponible;
     } //Fin del metodo getestaDisponible
 



     // Imprimir el registro solicitado

    public void mostrarRegistro(String matricula, String marca, String modelo, String color, float tarifaAlquiler, boolean estaDisponible, int numeroDePuertas, boolean tipoDeMarchaAutomatica){

        System.out.println ("");
        System.out.println ("****** Vehiculo instanciado desde la clase Vehiculo **********");
        System.out.println ("********************************************************************************************************************************************************************************************************************************");
        System.out.println ("| Matricula: "+matricula+ " | Marca: "+marca+ " | Modelo: "+modelo+" | Color: "+color+" | Tarifa de alquiler: "+tarifaAlquiler+ " | Disponibilidad: "+estaDisponible+" | Nro. de puertas: "+ numeroDePuertas+" | Marcha automatica: "+tipoDeMarchaAutomatica+"  |");
        System.out.println ("********************************************************************************************************************************************************************************************************************************");

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
            //float montoParcial = 75000*cantidadDias;

            System.out.println ("Total a pagar: "+montoParcial+ "Bs");
        
        }
        else{
            System.out.println ("");
            System.out.println ("ATENCION: El vehiculo no esta disponible");
            System.out.println ("");
        }
        }



} //Cierre de la clase