package pGestor;

public class ProductoNecesario extends Producto{
    public void aplicarIVA(){
        if(!conIVA){
            precio *= 1.04;
            conIVA = true;
        }
    }
}
