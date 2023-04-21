
package paquete;


public class Libros extends Libreria{
    private String titulo;
    private String autor;
    private String f_publicacion;
    private String editorial;
    private int codigo;
    private float precio;
    private boolean d_f;
    private char d;
    
    public Libros(String t,String a,String f,String e,int c,float p,char d){
    this.titulo=t;
    this.autor=a;
    this.f_publicacion=f;
    this.editorial=e;
    this.codigo=c;
    this.precio=p;
    this.d=d;
    this.d_f=esDoesF();
    
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getF_publicacion() {
        return f_publicacion;
    }

    public void setF_publicacion(String f_publicacion) {
        this.f_publicacion = f_publicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
    @Override
    protected float precio_total(){
        if(this.d_f==false){
        return (((18*this.precio)/100)+this.precio);
        }else{
        return(((8*this.precio)/100)+this.precio);
        }
        
    }
    
    @Override
    protected boolean esDoesF(){
      
         if(this.d=='D' || this.d=='d'){
         return true;
         }else{
         return false;
         }
       
     }
    
    public String toString(){
    return "LIBRO\n*************************************\n"+
            "Titulo: "+titulo+"\nAutor: "+autor+"\nFecha de publicacion: "+f_publicacion+
            "\nEditorial: "+editorial+"\nCodigo: "+codigo;
            }
}
