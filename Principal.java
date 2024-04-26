import java.util.Scanner;


public class Principal {
    public static void main(String[]args){
      
  
   //Linea en blanco
    System.out.println("");
    System.out.println("*********************************************************");
    System.out.println("| CONSECIONARIO DE ALQUILER DE AUTOS: La Chatarra Feliz |");
    System.out.println("*********************************************************");

    System.out.println("");


    // Creacion de la Instancia del objeto Turismo
    
    Turismo objTurismo = new Turismo("XYZ-123", "Ford", "Focus", "Blanco", 100000, true);

    objTurismo.setnumeroDePuertas(3);
    objTurismo.settipoDeMarchaAutomatica(true);
    objTurismo.mostrarRegistro(objTurismo.getmatricula(), objTurismo.getmarca(), objTurismo.getmodelo(), objTurismo.getcolor(), objTurismo.gettarifaAlquiler(), objTurismo.getestaDisponible(), objTurismo.getnumeroDePuertas(), objTurismo.gettipoDeMarchaAutomatica());
    objTurismo.calcularMontoAlquiler(objTurismo.getestaDisponible(), objTurismo.gettarifaAlquiler());


    // Creacion de la Instancia del objeto Deportivo

    System.out.println("");

    Deportivo objDeportivo = new Deportivo("ABC-123", "Ford", "Mustang", "Azul", 50000, true);

    objDeportivo.setcilindrada(6); 
    objDeportivo.mostrarRegistro(objDeportivo.getmatricula(), objDeportivo.getmarca(), objDeportivo.getmodelo(), objDeportivo.getcolor(), objDeportivo.gettarifaAlquiler(), objDeportivo.getestaDisponible(), objDeportivo.getcilindrada());
    objDeportivo.calcularMontoAlquiler(objDeportivo.getestaDisponible(), objDeportivo.gettarifaAlquiler());
    

    // Creacion de la Instancia del objeto Furgoneta

    System.out.println("");

    Furgoneta objFurgoneta = new Furgoneta("QWE-123", "Renault", "Kango", "Verde", 90000, true);

    objFurgoneta.setcapacidadDeCarga(671f);
    objFurgoneta.setvolumen(7.1f);
    objFurgoneta.mostrarRegistro(objFurgoneta.getmatricula(), objFurgoneta.getmarca(), objFurgoneta.getmodelo(), objFurgoneta.getcolor(), objFurgoneta.gettarifaAlquiler(), objFurgoneta.getestaDisponible(), objFurgoneta.getcapacidadDeCarga(), objFurgoneta.getvolumen());
    objFurgoneta.calcularMontoAlquiler(objFurgoneta.getestaDisponible(), objFurgoneta.getcapacidadDeCarga(), objFurgoneta.gettarifaAlquiler());


    // Creacion de la Instancia del objeto Vehiculo - Turismo. A partir de la clase abstracta Vehiculo
    // De aca en adelante la tarifa del Vehiculo sera de 75000 como en el ejemplo

    System.out.println("");
    System.out.println("************************************************************************************");    
    System.out.println("Instancia de un objeto de la clase Turismo a partir de la clase abstracta Vehiculo");
 
    // Se colocan estos nombres a los atributos con VehiTurismo para destacar que viene tanto de 
    // El objeto vehiculo como de turismo
    Vehiculo objVehiculoTurismo = new Turismo("VehiTurismoXYZ-123", "VehiTurismoFord", "VehiTurismoExplorer", "VehiTuriBlanco", 75000, true);
    
    // Se coloca el objeto turismo para imprimir salida similar a la solicitada en el enunciado
    // ademas del objeto Vehiculo-Turismo
    objTurismo.setnumeroDePuertas(4);
    objTurismo.settipoDeMarchaAutomatica(false);    
    objVehiculoTurismo.mostrarRegistro(objVehiculoTurismo.getmatricula(), objVehiculoTurismo.getmarca(), objVehiculoTurismo.getmodelo(), objVehiculoTurismo.getcolor(), objVehiculoTurismo.gettarifaAlquiler(), objVehiculoTurismo.getestaDisponible(), objTurismo.getnumeroDePuertas(), objTurismo.gettipoDeMarchaAutomatica());
    objVehiculoTurismo.calcularMontoAlquiler(objVehiculoTurismo.getestaDisponible(), objVehiculoTurismo.gettarifaAlquiler());
    
    
    // Creacion de la Instancia del objeto Vehiculo - Deportivo. A partir de la clase abstracta Vehiculo

    System.out.println("");
    System.out.println("************************************************************************************");    
    System.out.println("Instancia de un objeto de la clase Deportivo a partir de la clase abstracta Vehiculo");
    
    // Se colocan estos nombres a los atributos con VehiDeportivo para destacar que viene tanto de 
    // El objeto vehiculo como de deportivo 
    Vehiculo objVehiculoDeportivo = new Deportivo("VehiDeportivoXYZ-123", "VehiDeportivoToyota", "VehiDeportivoSupra", "VehiDeportivoNegro", 75000, true);
    
    // Se coloca el objeto deportivo para imprimir salida similar a la solicitada en el enunciado
    // ademas del objeto Vehiculo-Deportivo
    objDeportivo.setcilindrada(8);
    objVehiculoDeportivo.mostrarRegistro(objVehiculoDeportivo.getmatricula(), objVehiculoDeportivo.getmarca(), objVehiculoDeportivo.getmodelo(), objVehiculoDeportivo.getcolor(), objVehiculoDeportivo.gettarifaAlquiler(), objVehiculoDeportivo.getestaDisponible(), objTurismo.getnumeroDePuertas(), objTurismo.gettipoDeMarchaAutomatica());
    objVehiculoDeportivo.calcularMontoAlquiler(objVehiculoDeportivo.getestaDisponible(), objVehiculoDeportivo.gettarifaAlquiler());
    

    // Creacion de la Instancia del objeto Vehiculo - Furgoneta. A partir de la clase abstracta Vehiculo

    System.out.println("");
    System.out.println("************************************************************************************");    
    System.out.println("Instancia de un objeto de la clase Furgoneta a partir de la clase abstracta Vehiculo");
 
    // Se colocan estos nombres a los atributos con VehiFurgoneta para destacar que viene tanto de 
    // El objeto vehiculo como de furgoneta
    Vehiculo objVehiculoFurgoneta = new Furgoneta("VehiFurgonetaXYZ-123", "VehiFurgonetaMercedesBenz", "VehiFurgonetaVito", "VehiFurgonetaAzul", 75000, true);
    
    // Se coloca el objeto furgoneta para imprimir salida similar a la solicitada en el enunciado
    // ademas del objeto Vehiculo-Furgoneta   
    objFurgoneta.setcapacidadDeCarga(705f);
    objFurgoneta.setvolumen(8.4f);
    objVehiculoFurgoneta.mostrarRegistro(objVehiculoFurgoneta.getmatricula(), objVehiculoFurgoneta.getmarca(), objVehiculoFurgoneta.getmodelo(), objVehiculoFurgoneta.getcolor(), objVehiculoFurgoneta.gettarifaAlquiler(), objVehiculoFurgoneta.getestaDisponible(), objTurismo.getnumeroDePuertas(), objTurismo.gettipoDeMarchaAutomatica());
    objVehiculoFurgoneta.calcularMontoAlquiler(objVehiculoFurgoneta.getestaDisponible(), objVehiculoFurgoneta.gettarifaAlquiler());
    


   }
}
