package ExpresionesLambdas;

import java.util.ArrayList;
import java.util.Comparator;

public class App {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Ana");
		names.add("Mariposa");
		names.add("El árbol florecido");
		names.add("Un");
		names.add("Papiroflexia");
		names.add("Flores");
		names.add("Dos tortugas viejas");
		names.add("Amistad");
		names.add("Frío");

		names.stream()
		   .sorted(Comparator.comparing(String::length).reversed())
		   .forEach(System.out::println);


	}

}
