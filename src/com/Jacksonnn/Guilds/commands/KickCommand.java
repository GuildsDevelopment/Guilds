package com.Jacksonnn.Guilds.commands;

import com.Jacksonnn.Guilds.configuration.ConfigManager;
import org.bukkit.command.CommandSender;

import java.util.List;

public class KickCommand extends GuildsCommand {
    public KickCommand() {
        super("kick", "/guilds kick <player>", ConfigManager.languageConfig.get().getString("Commands.Kick.Description"), new String[] { "k" });
    }

    public void execute(CommandSender sender, List<String> args) {

    }
}
