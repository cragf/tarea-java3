package com.tarea;

public class Perro extends Mamifero{

    public Perro(String nombre, String raza, String fechaNacimiento, double peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
    }

    @Override
    public void comunicarse(){
        System.out.println("Guau guau...");
    }

}
