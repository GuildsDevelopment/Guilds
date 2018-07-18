package com.Jacksonnn.Guilds.commands;

import com.Jacksonnn.Guilds.configuration.ConfigManager;
import org.bukkit.command.CommandSender;

import java.util.List;

public class TrustCommand extends GuildsCommand {
    public TrustCommand() {
        super("trust", "/guilds trust <guild>", ConfigManager.languageConfig.get().getString("Commands.Trust.Description"), new String[] { "t", "ally" });
    }

    public void execute(CommandSender sender, List<String> args) {

    }
}
