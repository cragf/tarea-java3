package com.tarea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        System.out.println("Ingrese los datos del perro: nombre, raza, fecha de nacimiento y peso");
        String nombrep = sca.nextLine();
        String razap = sca.nextLine();
        String fechaNacimientop = sca.nextLine();
        float pesop = sca.nextFloat();

        Perro perro1 = new Perro(nombrep, razap, fechaNacimientop, pesop);

        perro1.comunicarse();

        System.out.println("Ingrese los datos del gato: nombre, raza, fecha de nacimiento y peso");
        String nombreg = sca.nextLine();
        String razag = sca.nextLine();
        String fechaNacimientog = sca.nextLine();
        float pesog = sca.nextFloat();

        Gato gato1 = new Gato(nombreg, razag, fechaNacimientog, pesog);

        gato1.comunicarse();


        perro1.comunicarse();

        sca.close();
    }
}