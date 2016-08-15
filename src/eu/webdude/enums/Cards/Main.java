package eu.webdude.enums.Cards;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		printEnum(Suit.values());
		printEnum(Rank.values());
	}

	private static void printEnum(Enum[] values) {
		Arrays.stream(values).forEach(x -> System.out.printf("Ordinal value: %d; Name value: %s%n", x.ordinal(), x.name()));
	}
}
