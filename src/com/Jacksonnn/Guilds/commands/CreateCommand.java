package com.Jacksonnn.Guilds.commands;

import com.Jacksonnn.Guilds.configuration.ConfigManager;
import org.bukkit.command.CommandSender;

import java.util.List;

public class CreateCommand extends GuildsCommand {
    public CreateCommand() {
        super("create", "/guilds create <name> [<Owner>]", ConfigManager.languageConfig.get().getString("Commands.Create.Description"), new String[] { "new", "start" });
    }

    public void execute(CommandSender sender, List<String> args) {

    }
}
