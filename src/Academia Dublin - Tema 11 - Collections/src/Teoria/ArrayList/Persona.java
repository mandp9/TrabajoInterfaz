package Teoria.ArrayList;

public class Persona implements Comparable <Persona>{
    String nombre;
    public Persona (){

    }
    public Persona (String nombre){
        this.nombre=nombre;
    }
    public String toString(){
        return "Soy persona " + nombre;
    }

    @Override
    public int compareTo(Persona p) {
        if(p==null) return 0;
        return this.nombre.compareTo(p.nombre);
    }
}
