package patronBuilder;

import java.util.TreeSet;

public class Main {
	  
	  public static void main(String[] args) {
		TreeSet<String> intereses = new TreeSet<String>();
		
		intereses.add("motor");
		intereses.add("tech");
		
	    Usuario usuario = new UsuarioBuilder()
	        .email("nombre.apellido@gmail.com")
	        .nombre("Nombre", "Apellido")
	        .telefono("555123456")
	        .direccion("c\\ Rue el Percebe 13")
	        .intereses(intereses)
	        .interes("Informática")
	        .build(); 
	    
	    Usuario usu = new UsuarioBuilder()
	    		.email("hola@esviernes.com")
	    		.nombre("Juan","Gonzalez")
	    		.direccion("calle Perena, 25")
	    		.build();
	    
	    System.out.println(usu);
	  }
	}
