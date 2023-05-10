package Ejercicios.pUniversidad;

public abstract class Persona {
    String dni;
    String nombre;
    public Persona (String dni){
        this.dni = dni;
    }
    public Persona (String dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object obj) {
        return equals(obj);
    }
    public String toString(){
        return dni + " " + nombre;
    }

}
