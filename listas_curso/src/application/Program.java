package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Marco");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());

		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------------");
		
		for ( String x : result) {
			System.out.println(x);
		}
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
		System.out.println("---------------------");
		System.out.println(name);
	}

}
