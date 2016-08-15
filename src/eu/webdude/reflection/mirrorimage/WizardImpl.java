package eu.webdude.reflection.mirrorimage;

import java.util.HashSet;
import java.util.Set;

public class WizardImpl implements Wizard {

	private static long currentId = 0;

	private final String name;

	private final long id;

	private final Set<Wizard> images = new HashSet<>();

	private long magicalPower;

	public WizardImpl(String name, long magicalPower) {
		this.id = getNextId();
		this.name = name;
		this.magicalPower = magicalPower;
	}

	private static long getNextId() {
		return currentId++;
	}

	@Override
	public long getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public long getPower() {
		return magicalPower;
	}

	@Override
	public Iterable<Wizard> getImages() {
		return images;
	}

	@Override
	public Wizard find(long id) {
		if (this.id == id) {
			return this;
		}

		for (Wizard wizard : images) {
			Wizard foundWizard = wizard.find(id);
			if (foundWizard != null) {
				return foundWizard;
			}
		}

		return null;
	}

	public void createImage() {
		if (this.isAllowedToCreateImages()) {
			images.add(new WizardImpl(name, magicalPower / 2));
		}
	}

	private boolean isAllowedToCreateImages() {
		return images.size() < 2;
	}
}
