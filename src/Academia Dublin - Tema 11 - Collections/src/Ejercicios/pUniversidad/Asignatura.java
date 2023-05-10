package Ejercicios.pUniversidad;

import java.util.Objects;

public class Asignatura {
    String nombre;
    double nota;
    boolean evaluada;
    public Asignatura (String nombre){
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asignatura that = (Asignatura) o;
        return Double.compare(that.nota, nota) == 0 && evaluada == that.evaluada && Objects.equals(nombre, that.nombre);
    }

    public String toString (){
        return nombre + " " + nota + " " + evaluada;
    }
}
