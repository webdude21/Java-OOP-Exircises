package eu.webdude.reflection.mirrorimage.spell;

import eu.webdude.reflection.mirrorimage.Wizard;

public interface SpellFactory {
	Spell getSpell(String spellName, Wizard wizard);
}
