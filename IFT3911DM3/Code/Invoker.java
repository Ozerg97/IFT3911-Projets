public class Invoker {

	private ICommand cmd;

	public void execute() {
		cmd.execute();
	}

	/**
	 * 
	 * @param cmd
	 */
	public void setCommand(ICommand cmd) {
		this.cmd = cmd;

	}

}