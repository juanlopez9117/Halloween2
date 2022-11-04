package org.example.clasesHalloween;

public class Fiesta {
    //ATRIBUTOS
    private String fecha;

    private double costosAalimentos;

    private double costosBebidas;

    private double costoLugar;

    private double costoEquipos;
    private final double VALORENTRADA=50000;




    // CONSTRUCTOR

    public Fiesta() {

    }

    public Fiesta(String fecha, double costosAalimentos, double costosBebidas, double costoLugar, double costoEquipos) {
        this.fecha = fecha;
        this.costosAalimentos = costosAalimentos;
        this.costosBebidas = costosBebidas;
        this.costoLugar = costoLugar;
        this.costoEquipos = costoEquipos;
    }

    //METODOS

    //METODOS DE ENCAPSULADO
    //PARA ACCEDER O MOSTRAR NUESTROS ATIBUTOS PRIVADOS

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    

    public double getCostosAalimentos() {
        return costosAalimentos;
    }

    public void setCostosAalimentos(double costosAalimentos) {

        if (costosAalimentos>0){
            this.costosAalimentos=costosAalimentos;
        }else {
            this.costosAalimentos=0;
            System.out.println("no se aceptan valores negativos");
        }
    }

    public double getCostosBebidas() {
        return costosBebidas;
    }

    public void setCostosBebidas(double costosBebidas) {

        if (costosBebidas>0){
            this.costosBebidas=costosBebidas;
        }else {
            this.costosBebidas=0;
            System.out.println("no se aceptan valores negativos");
        }

    }

    public double getCostoLugar() {
        return costoLugar;
    }

    public void setCostoLugar(double costoLugar) {

        if (costoLugar>0){
            this.costoLugar=costoLugar;
        }else {
            this.costoLugar=0;
            System.out.println("no se aceptan valores negativos");
        }

    }

    public double getCostoEquipos() {
        return costoEquipos;
    }

    public void setCostoEquipos(double costoEquipos) {

        if (costoEquipos>0){
            this.costoEquipos=costoEquipos;
        }else {
            this.costoEquipos=0;
            System.out.println("no se aceptan valores negativos");
        }
    }







    //METODOS ORDINARIOS



    public double calcularCostos (){
        return (this.costosAalimentos+this.costoEquipos+this.costoLugar+this.costosBebidas);
    }

}
