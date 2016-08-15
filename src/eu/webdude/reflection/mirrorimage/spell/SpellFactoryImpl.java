package eu.webdude.reflection.mirrorimage.spell;

import eu.webdude.reflection.mirrorimage.Wizard;

public class SpellFactoryImpl implements SpellFactory {

	private static final String FIREBALL = "FIREBALL";

	private static final String REFLECTION = "REFLECTION";

	@Override
	public Spell getSpell(String spellName, Wizard wizard) {
		switch (spellName.toUpperCase()) {
			case FIREBALL:
				return new Fireball(wizard);
			case REFLECTION:
				return new Reflection(wizard);
			default:
				throw new IllegalArgumentException("No such spell");
		}
	}
}
