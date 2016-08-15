package eu.webdude.reflection.mirrorimage;

public class Command {

	private long targetId;

	private String commandName;

	public Command(String commandLine) {
		this.parse(commandLine);
	}

	private void parse(String commandLine) {
		String[] parsedCommand = commandLine.split("\\s+");
		targetId = Long.parseLong(parsedCommand[0]);
		commandName = parsedCommand[1];
	}

	public long getTargetId() {
		return targetId;
	}

	public String getCommandName() {
		return commandName;
	}
}
