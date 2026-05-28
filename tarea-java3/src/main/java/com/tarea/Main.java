package com.tarea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in); // un solo scanner se consume antes de acabar
        Scanner sca2 = new Scanner(System.in);

        System.out.println("Ingrese los datos del perro: nombre, raza, fecha de nacimiento y peso");
        String nombrep = sca.nextLine();
        String razap = sca.nextLine();
        String fechaNacimientop = sca.nextLine();
        double pesop = sca.nextDouble();

        Perro perro1 = new Perro(nombrep, razap, fechaNacimientop, pesop);

        perro1.comunicarse();


        System.out.println("Ingrese los datos del gato: nombre, raza, fecha de nacimiento y peso");
        String nombreg = sca2.nextLine();
        String razag = sca2.nextLine();
        String fechaNacimientog = sca2.nextLine();
        double pesog = sca.nextDouble();

        Gato gato1 = new Gato(nombreg, razag, fechaNacimientog, pesog);

        gato1.comunicarse();

        sca2.close();
        sca.close();
    }
}
