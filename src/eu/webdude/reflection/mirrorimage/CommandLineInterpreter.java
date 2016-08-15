package eu.webdude.reflection.mirrorimage;

import eu.webdude.reflection.mirrorimage.spell.SpellFactory;
import eu.webdude.reflection.mirrorimage.spell.SpellFactoryImpl;

import java.util.Scanner;

public class CommandLineInterpreter {

	private static final String END = "END";

	private static final String BY_SPACES = "\\s+";

	private static SpellFactory spellFactory;

	private static Wizard originalWizard;

	public static void main(String[] args) {
		// FileInputStream is = new FileInputStream(new File("testdata.txt"));
		Scanner scanner = new Scanner(System.in);
		String[] wizardInput = scanner.nextLine().split(BY_SPACES);
		originalWizard = new WizardImpl(wizardInput[0], Long.parseLong(wizardInput[1]));
		spellFactory = new SpellFactoryImpl();

		String currentLineOfInput = scanner.nextLine();

		while (!currentLineOfInput.equals(END)) {
			processInput(new Command(currentLineOfInput));
			currentLineOfInput = scanner.nextLine();
		}
	}

	private static void processInput(Command currentLineOfInput) {
		Wizard executingWizard = originalWizard.find(currentLineOfInput.getTargetId());
		spellFactory.getSpell(currentLineOfInput.getCommandName(), executingWizard).cast();
	}
}

