package eu.webdude.reflection.mirrorimage;

public interface Wizard extends WizardLocator {
	long getId();

	String getName();

	long getPower();

	Iterable<Wizard> getImages();

	void createImage();
}
