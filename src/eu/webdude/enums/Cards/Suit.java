package eu.webdude.enums.Cards;

public enum Suit {
	CLUBS(0), HEARTS(13), DIAMONDS(26), SPADES(39);

	private int power;

	Suit(int power){
		this.power = power;
	}

	int getPower() {
		return power;
	}
}

