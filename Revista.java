
package paquete;


public class Revista extends Libreria{
    private String nombre;
    private String f_publicacion;
    private String editor;
    private int codigo;
    private float precio;
    private boolean d_f;
    private char d;
    
    public Revista(String t,String f,String e,int c,float p,char d){
    this.nombre=t;
    this.f_publicacion=f;
    this.editor=e;
    this.codigo=c;
    this.precio=p;
    this.d=d;
    this.d_f=esDoesF();
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getF_publicacion() {
        return f_publicacion;
    }

    public void setF_publicacion(String f_publicacion) {
        this.f_publicacion = f_publicacion;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
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
    public float precio_total(){
        if(this.d_f==false){
        return (((22*this.precio)/100)+this.precio);
        }else{
        return(((12*this.precio)/100)+this.precio);
        }
    }
    
     @Override
    public boolean esDoesF(){
       
         if(this.d=='D' || this.d=='d'){
         return true;
         }else{
         return false;
         }
       
     }
    
     public String toString(){
    return "REVISTA\n*************************************\n"+
            "Titulo: "+nombre+"\nFecha de publicacion: "+f_publicacion+
            "\nEditor: "+editor+"\nCodigo: "+codigo;
            }
}
