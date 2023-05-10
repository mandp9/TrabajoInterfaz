package Ejercicios.pUniversidad;

import java.util.ArrayList;
import java.util.Iterator;

public class Universidad {
    String nombre;
    ArrayList<Persona>a = new ArrayList();
    public Universidad (String nombre){
        this.nombre = nombre;
    }
    public String toString(){
        return a.toString();
    }
    public boolean registrar (Persona p) {
        if (a.contains(p)) return false;
        else return a.add(p);
    }
    public boolean baja (Persona p){
        return a.remove(p);
    }
    public boolean matricular (Alumno al, Asignatura as){
        int pos = a.indexOf(al); //-1 si el alumno no está
        if(pos == -1) return false;
        else{
            Alumno aux = (Alumno) a.get(pos);
            return aux.matricular(as);
        }
    }
    public boolean matricular (String dni, String nombre){
        return matricular(new Alumno(dni), new Asignatura(nombre));
    }
    public void mostrarDatos(Departamento d){
        for (int i = 0; i < a.size(); i++) {
            Persona p = a.get(i);
            if(p instanceof Profesor){
                Profesor prof = (Profesor) p;
                if(prof.d == d){ //prof.d.equals(d)
                    System.out.println(prof);
                }
            }
        }
    }
    public void mostrarDatos(){
        //mostrarDatos(Departamento.MATH);
        //mostrarDatos(Departamento.PROG);
        for(Departamento x : Departamento.values()){
            mostrarDatos(x);
        }
    }
    public boolean evaluar (Alumno al, Asignatura as, double nota){
        int pos = a.indexOf(al);
        if (pos == -1) return false;
        else{
            Alumno aux = (Alumno) a.get(pos);
            int pos2 = aux.a.indexOf(as);
            if(pos==-1) return false;
            else{
                Asignatura aux2 = (Asignatura) aux.a.get(pos2);
                if(aux2.evaluada) return false;
                else{
                    aux2.evaluada = true;
                    aux2.nota = nota;
                    return true;
                }
            }
        }
    }
    public boolean modificarMatricula(Alumno al, Asignatura vieja, Asignatura nueva){
        int pos = a.indexOf(al);
        if(pos==-1) return false;
        else{
            Alumno aux = (Alumno) a.get(pos);
            int pos2 = aux.a.indexOf(vieja);
            if(pos2==-1) return false;
            else{
                if(aux.a.contains(nueva)) return false;
                else{
                    aux.a.set(pos2, nueva);
                    return true;
                }
            }
        }
    }
    public double media (Curso c){
        //ITERADORES
        Iterator<Persona> it = a.iterator();
        while(it.hasNext()){
            Persona p = it.next();
        }
    }
}
