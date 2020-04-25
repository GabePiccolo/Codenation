package br.com.codenation.desafioexe;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DesafioApplication {

	@Desafio("Fibonacci")
	public static List<Integer> fibonacci() {

		List<Integer> fibonnaci = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
				.limit(15)
				.map(t -> t[0]).collect(Collectors.toList());

		return fibonnaci;
	}

	@Desafio("isFibonacci")
	public static Boolean isFibonacci(Integer a) {

		List<Integer> fibonnaci = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
				.limit(15)
				.map(t -> t[0]).collect(Collectors.toList());

		boolean contains = fibonnaci.contains(a);

		return contains;
	}

}
