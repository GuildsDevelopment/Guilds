package com.Jacksonnn.Guilds.commands;

import com.Jacksonnn.Guilds.configuration.ConfigManager;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public abstract class GuildsCommand implements SubCommand {

    private final String name;
    private final String properUse;
    private final String description;
    private final String[] aliases;
    private final String noPermissionMessage;

    public static Map<String, GuildsCommand> instances = new HashMap<>();

    public GuildsCommand(String name, String properUse, String description, String[] aliases) {
        this.name = name;
        this.properUse = properUse;
        this.description = description;
        this.aliases = aliases;

        this.noPermissionMessage = ChatColor.RED + ConfigManager.languageConfig.get().getString("Commands.NoPermission");


        instances.put(name, this);
    }

    public String getName() {
        return name;
    }

    public String getProperUse() {
        return properUse;
    }

    public String getDescription() {
        return description;
    }

    public String[] getAliases() {
        return aliases;
    }

    public void help(CommandSender sender, boolean description) {
        sender.sendMessage(ChatColor.GOLD + "Proper Usage: " + ChatColor.DARK_AQUA + properUse);
        if (description) {
            sender.sendMessage(ChatColor.YELLOW + this.description);
        }
    }

    public boolean hasPermission(CommandSender sender) {
        if (sender.hasPermission("guilds.command." + name)) {
            return true;
        } else {
            return false;
        }
    }
}
