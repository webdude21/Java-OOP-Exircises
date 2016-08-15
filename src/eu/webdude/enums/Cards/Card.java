package eu.webdude.enums.Cards;

public interface Card extends Comparable<Card> {

	Rank getRank();

	Suit getSuit();

	int getPower();
}
