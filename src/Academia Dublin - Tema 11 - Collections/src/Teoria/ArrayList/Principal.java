package Teoria.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class Principal {
    public static void main(String[] args) {
        //ARRAYLIST
        /*
        ArrayList a = new ArrayList();
        //nº elementos
        System.out.println(a.size());
        //añadir
        a.add("A");
        a.add("B");
        a.add("C");
        //mostrar
        System.out.println(a);
        //leer
        System.out.println(a.get(1));
        //insertar (y desplazar)
        a.add(1, "D");
        //sustituir
        a.set(2,"w");
        System.out.println(a);
        //eliminar por posición
        a.remove(2);
        System.out.println(a);
        //eliminar por objeto (equals)
        a.remove("D");
        System.out.println(a);
        //contiene
        System.out.println(a.contains("A"));
         */

        /*
        //iteradores
        ArrayList a = new ArrayList ();
        Iterator it = a.iterator(); //no se puede instanciar, se obtiene a partir de un arraylist existente
        //y se configura en funcion de la cantidad de elementos que tenga
        a.add("A");
        a.add("B");
        a.add("C");
        //si modifico la cantidad de elementos del arraylist, tengo que volver a obtener su iterador
        it = a.iterator();
        System.out.println(a);
        System.out.println(it.hasNext()); //me devuelve verdadero si el elemento al cual apunta el it existe
        System.out.println(it.next()); //me devuelve el elemento al cual apunta y avanza al siguiente
        System.out.println(it.next());
        it.remove(); //borra el elemento de la posicion anterior
        System.out.println(a);
         */

        /*
        //RECORRER ARRAYLIST
        ArrayList a = new ArrayList();
        a.add("A");
        a.add("B");
        a.add("C");
        //FOR
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i)); //a[i]
        }
        //ITERAR
        Iterator it = a.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            //it.remove() //OPCIONAL
        }
        //FOR EACH
        for(Object x : a){ //para cada elemento x del array a, lo muestro
            System.out.println(x);
        }
         */

        /*
        //ARRAYLIST GENERAL (OBJECT)
        ArrayList a = new ArrayList();
        //Arraylist <Object> a = ....
        a.add("A");
        a.add(new Alumno("Pepe"));
        a.add(true);
        a.add(new Persona("Luis"));
        if (a.get(3) instanceof Persona) {
            Persona p = (Persona) a.get(3);
        }
        Iterator it = a.iterator();
        //Iterator <Object> it..
        Object x = it.next();
        if (x instanceof Persona) {
            //casting
        }
        //ejemploGeneral (a);
    }//FIN MAIN

    //Hacer un método que reciba un arraylist general y muestre los nombres de todas las personas usando for,
    //iterador y for each
    public static void ejemploGeneral(ArrayList a){
        //FOR
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) instanceof Persona){
                System.out.println(((Persona)a.get(i)).nombre);
            }
        }
        //ITERADOR
        Iterator it = a.iterator();
        while(it.hasNext()){
            Object x = it.next();
            if(x instanceof Persona){
                System.out.println(((Persona)x).nombre);
            }
        }
        //FOR EACH
        for(Object x : a){
            if(x instanceof Persona){
                System.out.println(((Persona)x).nombre);
            }
        }

         */

        //ARRAYLIST GENERICOS
       /* ArrayList<Persona> a = new ArrayList<>();
                            //= new ArrayList ();
                            //= new ArrayList <Persona> ();
        //a.add("A"); no es Persona
        //a.add(new Alumno("Pepe"));
        //a.add(true);
        Persona p = a.get(1);
        if(a.get(0) instanceof Alumno){
            //casting
        }
        Iterator <Persona> it = a.iterator();
        Persona x = it.next();
        ejemploGenerico(a);
    }
    public static void ejemploGenerico(ArrayList<Persona>a){
        //FOR
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i).nombre);
        }
        //ITERADOR
        Iterator<Persona> it = a.iterator();
        while(it.hasNext()){
            Persona x = it.next();
            System.out.println(x.nombre);
        }
        //FOR EACH
        for(Persona x:a){
            System.out.println(x.nombre);
        }
        //ORDENAR

        //Collections.sort(a); //compareTo

        //AL -> VECTOR

        //Object [] v = a.toArray();

        //VECTOR -> AL

        //ArrayList a = new ArrayList(Arrays.asList(v));

    }

        */
        Persona p = new Persona("Pepe");
        //ArrayList <Persona> a = new ArrayList<Alumno>(); //en memoria solamente se pueden almacenar alumnos
        //y la variable puede almacenar variables de tipo Persona
    }//FIN MAIN
        public static void metodo (ArrayList<? extends Object> a) {
            //sirve para trabajar con cualquier arraylist generico que extienda a object sin tener que crear
            //un metodo para cada uno
        }
        public static void metodo2 (ArrayList<? extends Persona> a){
            //IGUAL QUE ANTES PERO AHORA CON ATRIBUTOS DE PERSONA
        }
        public static void metodo3 (ArrayList<E> a){
        }
}
