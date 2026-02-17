import java.util.Scanner;

public class clasebasevehiculo{


  private String marca; 
  private int velocidadmaxima;
  private int velocidadactual;
   
  public clasebasevehiculo(String marca, int velocidadmaxima){
    this.marca = marca;
    this.velocidadmaxima = velocidadmaxima;
    this.velocidadactual = 0;
  }

  public String getMarca() {
    return marca;
  }

  public int getVelocidadmaxima() {
    return velocidadmaxima;
  }

  public void conducir(){
      System.out.println ("El vehiculo de marca " + marca + " esta avanzando ");
  }
  
  public void aumentarvelocidad ( int incremento){
    if (velocidadactual + incremento >= velocidadmaxima){
      System.out.println (" error no se puede superar La velocidad " + velocidadmaxima + " km/h");
      velocidadactual = velocidadmaxima;
    } else {
      velocidadactual += incremento;
      System.out.println ("velocidad aumentada. velocidad actual: " + velocidadactual + " km/h");
    }
  }



}