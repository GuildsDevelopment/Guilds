package com.Jacksonnn.Guilds;

/*
 * Commands:
 * help - This will send a list of the following commands
 * create <name> [<owner>] - This creates a new guild owned by the sender. 
 * delete [<name>] - This deletes the sender's guild #Inner-Guild-Permissions needed
 * info <name> - This will show anything about a guild, for example, the name, the age, the owner, the members, the coin balance. The name placeholder can either be a guild name or a player
 * 
 * claim [<name>] - This will claim land under the sender's faction #Inner-Guild-Permissions needed
 * add <name> [<guild>] - This will give another Guild partial ownership of the land #Inner-Guild-Permissions needed
 * remove <name> [<guild>] - This will take partial ownership of land from the said guild #Inner-Guild-Permissions needed
 * unclaim [<guild>] - This will unclaim land under the sender's faction #Inner-Guild-Permissions needed
 * 
 * invite <player> [<guild>] - This sends an request to allow a player to join the Guild #Inner-Guild-Permissions needed
 * kick <player> [<guild>] - This removes a said player from the sender's guild #Inner-Guild-Permissions needed
 * 
 * chat - This toggles the channel. #Channels - Guild, Trusted, Public, War
 * trust <name> [<guild>] [<guild>] - This marks alliance with another Guild. 
 * attack <name> [<guild>] [<guild>] - This marks war with another Guild. 
 * 
 * coins (deposit|withdrawal|add*|remove*) [<player>] [<guild>] - Manages coins
 * job <join quit> - Joins or leaves a job. #You earn money from jobs on an interval f.ex I'd only earn a dollar in piggery killing a pig every 5 pigs, if the interval was set to 5
 * 
 * Admin Commands:
 * admin - Bypasses all restrictions that normal players have as far as non-command actions
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
			if (args.length == 2 && args[1].equalsIgnoreCase("deposit")) {
				
			}
			else if (args.length == 2 && args[1].equalsIgnoreCase("withdrawl")) {
				
			}
			else if (args.length == 2 && args[1].equalsIgnoreCase("add")) {
				
			}
			else if (args.length == 2 && args[1].equalsIgnoreCase("remove")) {
				
			}
			return true;
		}
		else if (args.length == 1 && args[0].equalsIgnoreCase("jobs")) {
			return true;
		}
		return false;
	}
}
