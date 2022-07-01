
package ec.edu.intsuperior.modelo;


public class Persona {
   String ci;
   String Nombre;
   String Apellido;
   String Direccion;
   
   public enum TipoGenero{MASCULINO,FEMENINO}
   TipoGenero genero;
   
   public Persona(){
       
   }

    public Persona(String ci, String Nombre, String Apellido, String Direccion, TipoGenero genero) {
        this.ci = ci;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.genero = genero;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setGenero(TipoGenero genero) {
        this.genero = genero;
    }

    public String getCi() {
        return ci;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public TipoGenero getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "DATOS \n"
                + "" + "CEDULA: " + ci + "\n"
                + " Nombre y Apellido: " + Nombre + " " + Apellido + "\n"
                + " Direccion: " + Direccion + "\n"
                + " genero: " + genero + '}';
    }

    

    

    
   

   
}
