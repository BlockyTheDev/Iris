package com.volmit.iris.command;

import com.volmit.iris.Iris;
import com.volmit.iris.util.Command;
import com.volmit.iris.util.MortarCommand;
import com.volmit.iris.util.MortarSender;

public class CommandIrisWhat extends MortarCommand
{
	@Command
	private CommandIrisWhatBlock block;

	@Command
	private CommandIrisWhatHand hand;

	public CommandIrisWhat()
	{
		super("what", "w", "?");
		setDescription("Get timings for this world");
		requiresPermission(Iris.perm.studio);
		setCategory("Wut");
		setDescription("Figure out what stuff is");
	}

	@Override
	public boolean handle(MortarSender sender, String[] args)
	{
		printHelp(sender);
		return true;
	}

	@Override
	protected String getArgsUsage()
	{
		return "";
	}
}
