public class bus extends clasebasevehiculo {
    private int cantidadpasajeros;

    public bus(String marca, int velocidadmaxima, int cantidadpasajeros) {
        super(marca, velocidadmaxima);
        this.cantidadpasajeros = cantidadpasajeros;
    }

    public void conducir(){
        System.out.println ("El bus de marca " + getMarca() + " lleva a " + cantidadpasajeros +  " pasajeros");
    }





}