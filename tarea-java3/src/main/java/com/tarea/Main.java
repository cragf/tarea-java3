package com.tarea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        Scanner sca2 = new Scanner(System.in);

        System.out.println("Ingrese los datos del perro:");
        System.out.print("Nombre: ");
        String nombrep = sca.nextLine();
        System.out.print("Raza: ");
        String razap = sca.nextLine();
        System.out.print("Fecha de nacimiento: ");
        String fechaNacimientop = sca.nextLine();
        System.out.print("Peso: ");
        double pesop = sca.nextDouble();

        Perro perro1 = new Perro(nombrep, razap, fechaNacimientop, pesop);

        perro1.comunicarse();


        System.out.println("Ingrese los datos del gato:");
        System.out.print("Nombre: ");
        String nombreg = sca2.nextLine();
        System.out.print("Raza: ");
        String razag = sca2.nextLine();
        System.out.print("Fecha de nacimiento: ");
        String fechaNacimientog = sca2.nextLine();
        System.out.print("Peso: ");
        double pesog = sca2.nextDouble();

        Gato gato1 = new Gato(nombreg, razag, fechaNacimientog, pesog);

        gato1.comunicarse();

        sca2.close();
        sca.close();
    }
}