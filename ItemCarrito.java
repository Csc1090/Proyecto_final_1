
package paquete;


public class ItemCarrito {
    private Libros libro;
    private Revista revista;
    private float costo;
    
    public ItemCarrito(Libros l,float c){
    this.libro=l;
    this.costo= c;
    }
    
    public ItemCarrito(Revista r,float c){
    this.revista=r;
    this.costo=c;
    }

    public float getCosto() {
        return costo;
    }
    
    
    
}
