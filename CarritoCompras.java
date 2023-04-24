
package paquete;

import java.util.List;
import java.util.ArrayList;

public class CarritoCompras{
    ArrayList <ItemCarrito> item;
    
    public CarritoCompras() {
		this.item = new ArrayList<ItemCarrito>();
	}
    
    public void agregarItem(ItemCarrito i){
    
       this.item.add(i);
    }
    
    public float precio_t(){
        float res=0;
        for(ItemCarrito i : item){
        res=res+i.getCosto();
        }
        return res;
    }
    

}
