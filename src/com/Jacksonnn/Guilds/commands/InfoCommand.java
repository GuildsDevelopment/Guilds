package com.Jacksonnn.Guilds.commands;

import com.Jacksonnn.Guilds.configuration.ConfigManager;
import org.bukkit.command.CommandSender;

import java.util.List;

public class InfoCommand extends GuildsCommand {
    public InfoCommand() {
        super("info", "/guilds info <guild | player>", ConfigManager.languageConfig.get().getString("Commands.Info.Description"), new String[] { "i", "who" });
    }

    public void execute(CommandSender sender, List<String> args) {

    }
}
