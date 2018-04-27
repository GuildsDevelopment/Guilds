package com.Jacksonnn.Guilds;

/*
 * Commands:
 * help
 * create <name>
 * delete
 * info <name>
 * 
 * claim
 * add <name>
 * unclaim
 * 
 * invite <player>
 * kick <player>
 * 
 * chat
 * trust <player>
 * 
 * attack <name>
 * 
 * 
 * coins (deposit|withdrawal|add*|remove*)
 * 
 */

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Commands implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if (args.length == 0) {
			sender.sendMessage("Commands:");
		}
		else if (args.length == 1 && args[0].equalsIgnoreCase("help")) {
			sender.sendMessage("Commands:");
		}
		else if (args.length == 1 && args[0].equalsIgnoreCase("create")) {
			String name = args[1];
			return true;
		}
		else if (args.length == 1 && args[0].equalsIgnoreCase("delete")) {
			return true;
		}
		else if (args.length == 1 && args[0].equalsIgnoreCase("info")) {
			String name = args[1];
			return true;
		}
		else if (args.length == 1 && args[0].equalsIgnoreCase("claim")) {
			return true;
		}
		else if (args.length == 1 && args[0].equalsIgnoreCase("add")) {
			String name = args[1];
			return true;
		}
		else if (args.length == 1 && args[0].equalsIgnoreCase("unclaim")) {
			return true;
		}
		else if (args.length == 1 && args[0].equalsIgnoreCase("invite")) {
			String player = args[1];
			return true;
		}
		else if (args.length == 1 && args[0].equalsIgnoreCase("kick")) {
			String player = args[1];
			return true;
		}
		else if (args.length == 1 && args[0].equalsIgnoreCase("chat")) {
			return true;
		}
		else if (args.length == 1 && args[0].equalsIgnoreCase("trust")) {
			String player = args[1];
			return true;
		}
		else if (args.length == 1 && args[0].equalsIgnoreCase("attack")) {
			String name = args[1];
			return true;
		}
		else if (args.length == 1 && args[0].equalsIgnoreCase("coins")) {
			return true;
		}
		return false;
	}
}
