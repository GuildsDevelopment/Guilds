package com.Jacksonnn.Guilds.commands;

import com.Jacksonnn.Guilds.configuration.ConfigManager;
import org.bukkit.command.CommandSender;

import java.util.List;

public class RemoveCommand extends GuildsCommand {
    public RemoveCommand() {
        super("remove", "/guilds remove <guild>", ConfigManager.languageConfig.get().getString("Commands.Remove.Description"), new String[] { "r" });
    }

    public void execute(CommandSender sender, List<String> args) {

    }
}
