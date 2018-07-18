package com.Jacksonnn.Guilds.commands;

import com.Jacksonnn.Guilds.configuration.ConfigManager;
import org.bukkit.command.CommandSender;

import java.util.List;

public class AddCommand extends GuildsCommand {

    public AddCommand() {
        super("add", "/guilds add <guild>", ConfigManager.languageConfig.get().getString("Commands.Add.Description"), new String[] { "a" });
    }

    public void execute(CommandSender sender, List<String> args) {

    }
}
