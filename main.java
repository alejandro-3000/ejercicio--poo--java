import java.util.Scanner;

public class main{

public static void main (String[] args ) {

Scanner scanner= new Scanner(System.in);
      
   moto mimoto= new moto("yamaha", 130, false);
   bus mibus=new bus ("mercedes", 100, 40);

   System.out.println("prueba de la moto");

   mimoto.conducir(); 
   
     System.out.println("ingrese cuanto desea aumentar la velocidad de la moto:");
     int aumentomoto= scanner.nextInt();
     mimoto.aumentarvelocidad(aumentomoto);

    System.out.println("prueba del bus");
    mibus.conducir();
        System.out.println("ingrese cuanto desea aumentar la velocidad del bus:");
        int aumentobus= scanner.nextInt();
        mibus.aumentarvelocidad(aumentobus);
    scanner.close();

}




}