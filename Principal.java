
package paquete;


public class Principal {
  public static void main(String[]arg){
  
  Libros libro_1 = new Libros("El Principito","Antoine de Saint-Exupéry","6 de Abril de 1943","Emecé",34,(float)150.50,'d');
  Libros libro_2 = new Libros("El Principito","Antoine de Saint-Exupéry","6 de Abril de 1943","Emecé",32,(float)300.90,'F');
  
  
  Revista revista_1 = new Revista("Caras","24 de noviembre de 1992","Desconocido",25,(float)120.50,'D');
  Revista revista_2 = new Revista("Caras","24 de noviembre de 1992","Desconocido",24,(float)450.00,'f');
  
  
  System.out.println(libro_1.toString()+"\nPrecio Total: "+libro_1.precio_total()+"\n*************************************\n");
  System.out.println(libro_2.toString()+"\nPrecio Total: "+libro_2.precio_total()+"\n*************************************\n");
   
  System.out.println(revista_1.toString()+"\nPrecio Total: "+revista_1.precio_total()+"\n*************************************\n");
  System.out.println(revista_2.toString()+"\nPrecio Total: "+revista_2.precio_total()+"\n*************************************\n");
      
  
  }  
}
