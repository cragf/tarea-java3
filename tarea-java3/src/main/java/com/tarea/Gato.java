package com.tarea;

public class Gato extends Mamifero{

    public Gato(String nombre, String raza, String fechaNacimiento, double peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
    }
    @Override
    public void comunicarse(){
        System.out.println("Miau miau...");
    }
}
