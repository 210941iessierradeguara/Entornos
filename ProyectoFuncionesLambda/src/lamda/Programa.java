package lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Juan");
		lista.add("Javier");
		lista.add("Manuela");
		lista.add("Mariano");
		lista.add("Jose");
		
		var mapa = new HashMap<String, String>();
		mapa.put("España", "Madrid");
		mapa.put("Francia", "Paris");
		mapa.put("Mexico", "Mexico DC");
		
		// manera tradicional.
		for (String s: lista) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.print("------------------------------------------------- \n");
		System.out.println();
		
		//función lambda (Lambda = consumer)
		//recorre la lista y utiliza la funcion entre parentesis para cada elemento. 
		//más de una linea requiere llaves
		lista.forEach( (s) -> System.out.println(s) );
		if (mapa.get("Polonia") == null) {
			mapa.put("Polonia", "Varsovia");
		}
		mapa.computeIfAbsent("Polonia", s -> "Varsovia");
		
		System.out.println();
		//cuando solo necesitamos un parametro no necesitamos los parentesis 
		//sin embargo si hay más son obligatorios.
		mapa.forEach( (pais, capital) -> {
			System.out.println("La capital de "+pais+" es "+capital);
			System.out.println("·");
		});
		
		HashMap<String, Integer> contador = new HashMap<String, Integer>();
		List<String> palabras = Arrays.asList("hola que tal".split(" "));
		palabras.forEach(palabra -> {
			contador.putIfAbsent(palabra, 0);
			contador.computeIfPresent(palabra, (p, i) -> i+1);
		});
	}

}
