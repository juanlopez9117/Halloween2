package org.example;

import org.example.clasesHalloween.Fiesta;
import org.example.clasesHalloween.Invitado;
import org.example.clasesHalloween.Lugar;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner entradaPorTeclado=new Scanner(System.in);
        Invitado objetoInvitado = new Invitado();
        Lugar objetoLugar = new Lugar();
        Fiesta objetoFiesta = new Fiesta();

        System.out.println("FIESTA");

        System.out.println("Gastos de Alimentos");
        objetoFiesta.setCostosAalimentos(entradaPorTeclado.nextDouble());
        System.out.println("El costo de alimentos fue: "+objetoFiesta.getCostosAalimentos());

        System.out.println("gastos de Bebidas: ");
        objetoFiesta.setCostosBebidas(entradaPorTeclado.nextDouble());
        System.out.println("el costo de bebidas fue: " +objetoFiesta.getCostosBebidas());

        System.out.println("gastos de equipos: ");
        objetoFiesta.setCostoEquipos(entradaPorTeclado.nextDouble());
        System.out.println("el costo en equipos fue: ");

        System.out.println("gastos del lugar: ");
        objetoFiesta.setCostoLugar(entradaPorTeclado.nextDouble());
        System.out.println("los gastos del lugar fueron: ");;

    }
}