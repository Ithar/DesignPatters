package malik.behavioral.command.pattern;


public class LeftCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Trun Left");
	}

}
