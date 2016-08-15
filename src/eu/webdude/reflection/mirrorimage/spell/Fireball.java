package eu.webdude.reflection.mirrorimage.spell;

import eu.webdude.reflection.mirrorimage.Wizard;

public class Fireball extends Spell {
	public Fireball(Wizard caster) {
		super(caster);
	}

	@Override
	public void cast() {
		super.cast();
		getCaster().getImages().forEach(x -> new Fireball(x).cast());
	}

	@Override
	protected String getName() {
		return "Fireball";
	}

	@Override
	protected String getInfo() {
		return super.getInfo() + String.format(" for %d damage", getCaster().getPower());
	}
}
