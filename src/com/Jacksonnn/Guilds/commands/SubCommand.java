package com.Jacksonnn.Guilds.commands;

import org.bukkit.command.CommandSender;

import java.util.List;

/**
 * Interface representation of a command executor.
 */
public interface SubCommand {
	/**
	 * Gets the name of the command.
	 * 
	 * @return The command's name
	 */
	public String getName();

	/**
	 * Gets the aliases for the command.
	 * 
	 * @return All aliases for the command
	 */
	public String[] getAliases();

	/**
	 * Gets the proper use of the command, in the format '/b
	 * @return the proper use of the command
	 */
	public String getProperUse();

	/**
	 * Gets the description of the command.
	 * 
	 * @return the description
	 */
	public String getDescription();

	/**
	 * Executes the command.
	 * 
	 * @param sender The CommandSender who issued the command
	 * @param args the command's arguments
	 */
	public void execute(CommandSender sender, List<String> args);
}
