
package ec.edu.intsuperior.vista;
import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;

public class Aplicacion {
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();

        System.out.println("INGRESE LA PRIMERA CEDULA");
        p1.setCi(leer.next());
        System.out.println("INGRESE SU NOMBRE");
        p1.setNombre(leer.next());
        System.out.println("INGRESE SU APELLIDO");
        p1.setApellido(leer.next());
        System.out.println("INGRESE SU DIRECCION");
        p1.setDireccion(leer.next());
        p1.setGenero(Persona.TipoGenero.MASCULINO);
        
        System.out.println(p1.toString());
        
        System.out.println("INGRESE LA SEGUNDA CEDULA");
        p2.setCi(leer.next());
        System.out.println("INGRESE SU NOMBRE");
        p2.setNombre(leer.next());
        System.out.println("INGRESE SU APELLIDO");
        p2.setApellido(leer.next());
        System.out.println("INGRESE SU DIRECCION");
        p2.setDireccion(leer.next());
        p2.setGenero(Persona.TipoGenero.FEMENINO);
        
        System.out.println(p2.toString());
        
        
        
    }
}
