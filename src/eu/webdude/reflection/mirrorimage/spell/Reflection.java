package eu.webdude.reflection.mirrorimage.spell;

import eu.webdude.reflection.mirrorimage.Wizard;

public class Reflection extends Spell {

	public Reflection(Wizard caster) {
		super(caster);
	}

	@Override
	public void cast() {
		super.cast();
		getCaster().getImages().forEach(x -> new Reflection(x).cast());
		getCaster().createImage();
		getCaster().createImage();
	}

	@Override
	protected String getName() {
		return "Reflection";
	}
}
