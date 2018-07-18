package com.Jacksonnn.Guilds.commands;

import com.Jacksonnn.Guilds.configuration.ConfigManager;
import org.bukkit.command.CommandSender;

import java.util.List;

public class HelpCommand extends GuildsCommand {

    public HelpCommand() {
        super("help", "/guilds help <page>", ConfigManager.languageConfig.get().getString("Commands.Help.Description"), new String[] { "?", "h" });
    }

    public void execute(CommandSender sender, List<String> args) {

    }
}
