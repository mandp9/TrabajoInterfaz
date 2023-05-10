package pGestor;

public abstract class Producto implements Comparable<Producto>{
    protected int codigo;
    protected double precio;
    protected String nombre;
    protected int stock;
    protected String seccion;
    protected boolean conIVA;

    public abstract void aplicarIVA();
    public int compareTo (Producto p){
        if(p==null) return 0;
        if(this.precio<p.precio) return -1;
        else if (this.precio>p.precio) return 1;
        else return this.nombre.compareTo(p.nombre);
    }
}
