package pGestor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class gestorProductos {
    private ArrayList<Producto> a = new ArrayList<>();
    public void mostrar(){
        if(a.isEmpty()) System.out.println("Vacío");
        else System.out.println(a);
    }
    public boolean agregar (Producto p){
        if(p == null) throw new IllegalArgumentException("nulo");
        if(a.contains(p)) return false;
        else              return a.add(p);
    }
    public boolean agregar (Producto p, int pos){
        if(p == null) throw new IllegalArgumentException("nulo");
        try{
            if(a.contains(p)) return false;
            else {
                a.add(pos, p);
                return true;
            }
        }catch(IndexOutOfBoundsException ex){
            return a.add(p);
        }


    }
    public void aplicarIVA(){
        for(Producto x : a){
            x.aplicarIVA();
        }
    }
    public void aumentarPrecio (String seccion){
        Iterator<Producto> it = a.iterator();
        while(it.hasNext()){
            Producto p = it.next();
            if(p.seccion.equalsIgnoreCase(seccion)){
                p.precio *= 1.1;
            }
        }
    }
    public Producto maxProducto() {
        try {
            Producto max = a.get(0);
            for (int i = 1; i < a.size(); i++) {
                if(a.get(i).precio>max.precio){
                    max = a.get(i);
                }
            }
            return max;
        } catch (IndexOutOfBoundsException ex) {
            return null;
        }
    }
    //recibe un array list con los elementos que a lo mejor sustituyo
    public void sustituir (ArrayList<Producto>v){
        if(v==null){
            throw new IllegalArgumentException("nulo");
        }
        for(Producto x : a){
            try{
                a.set(a.indexOf(x), x);
            }catch(IndexOutOfBoundsException ex){
                System.out.println("Codigo no encontrado: " + x);
            }
        }
    }
    public int nProductos(){
        return a.size();
    }
    public void ordenar(boolean creciente){
        if(creciente){
            Collections.sort(a);
        }else{
            Collections.sort(a, Collections.reverseOrder());
        }
    }
}
