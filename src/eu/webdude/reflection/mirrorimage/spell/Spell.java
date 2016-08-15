package eu.webdude.reflection.mirrorimage.spell;

import eu.webdude.reflection.mirrorimage.Wizard;

public abstract class Spell {

	private final Wizard caster;

	Spell(Wizard caster) {
		this.caster = caster;
	}

	public void cast() {
		System.out.println(getInfo());
	}

	Wizard getCaster() {
		return caster;
	}

	protected abstract String getName();

	protected String getInfo() {
		return String.format("%s %d casts %s", getCaster().getName(), getCaster().getId(), getName());
	}
}
