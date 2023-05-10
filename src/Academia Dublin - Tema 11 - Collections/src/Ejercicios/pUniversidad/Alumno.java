package Ejercicios.pUniversidad;

import java.util.ArrayList;

public class Alumno extends Persona{
    Curso c;
    ArrayList<Asignatura> a ;
    public Alumno(String dni){
        super(dni);
    }
    public Alumno(String dni, String nombre, Curso c){
        super(dni, nombre);
        this.c = c;
        a = new ArrayList<>();
    }
    public boolean matricular(Asignatura as){
        if(a.contains(as)) return false;
        else               return a.add(as);
    }
    public boolean matricular(String nombre){
        return matricular(new Asignatura(nombre));
    }
    //los metodos evaluar y modificar matricula de la clase universidad también podrían estar hechos aquí
    public double media(){
        double s = 0;
        int c = 0;
        for(Asignatura x : a){
            if(x.evaluada){
                s += x.nota;
                c++;
            }
        }
        return s/c;
    }
}
