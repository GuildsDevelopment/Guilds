package com.Jacksonnn.Guilds;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class GeneralMethods {

    public String prefixNormal = ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Guilds" + ChatColor.DARK_GRAY + "] " + ChatColor.YELLOW;
    public String prefixError = ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Guilds" + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_RED + "Error! " + ChatColor.RED;
    public String prefixSuccess = ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Guilds" + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_GREEN + "Success! " + ChatColor.GREEN;

    public void sendMessage(CommandSender sender, String prefix ,String message) {
        if (prefix.equalsIgnoreCase("normal")) {

        } else if (prefix.equalsIgnoreCase("error")) {

        } else if (prefix.equalsIgnoreCase("success")) {

        } else {

        }
    }

}
