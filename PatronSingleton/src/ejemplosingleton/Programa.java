package ejemplosingleton;

public class Programa {
	public static void main(String[] args) {
		// El patrón singleton ingenuo evita más de una instancia de una clase,
		// aquí todos son el mismo director
		Director dire = Director.getInstance("Joaquín");
		Director dire2 = Director.getInstance("Manolo");
		System.out.println(dire);
		System.out.println(dire2);
		System.out.println(dire2.equals(dire));
	}
}
