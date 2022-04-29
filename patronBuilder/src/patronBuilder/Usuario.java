package patronBuilder;

import java.util.ArrayList;
import java.util.TreeSet;

public class Usuario {
	  
    private String email;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;
    private TreeSet<String> intereses;
  
    // es privado para evitar que otra personas o clases puedan acceder y crear un usuario por la 
    // cara, como es privado no puede existir uno de mismo nombre pùblico. No existe un 
    // cosntructor por defecto para esta clase.
    // (new usuario | prohibido)
    private Usuario() {
    }
  
    Usuario(UsuarioBuilder builder) {
        if (builder.getEmail() == null) {
            throw new IllegalArgumentException("email es requerido");
        }
        this.email = builder.getEmail();
        this.nombre = builder.getNombre();
        this.apellidos = builder.getApellidos();
        this.telefono = builder.getTelefono();
        this.direccion = builder.getDireccion();
        this.intereses = builder.getIntereses();
    }

	@Override
	public String toString() {
		return "Usuario [email=" + email + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", intereses=" + intereses + "]";
	}
    
}