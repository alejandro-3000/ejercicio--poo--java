

  public class moto extends clasebasevehiculo {
    private boolean tienesidecar;
    


    public moto(String marca, int velocidadmaxima, boolean tienesidecar) {
        super(marca, velocidadmaxima);
        this.tienesidecar = tienesidecar;
    }

    public void conducir(){

        System.out.println ("La moto de marca " + getMarca() + " esta avanzando " + getVelocidadmaxima() + "km/h sobre dos ruedas ");
    }

     
}



    


