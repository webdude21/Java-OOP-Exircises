package eu.webdude.enums.Cards;

public class PlayingCard implements Card {

	private final Suit suit;
	private final Rank rank;

	PlayingCard(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	@Override
	public Rank getRank() {
		return rank;
	}

	@Override
	public Suit getSuit() {
		return suit;
	}

	@Override
	public int getPower() {
		return suit.getPower() + rank.getPower();
	}

	@Override
	public int compareTo(Card o) {
		return o.getPower() - this.getPower();
	}
}
