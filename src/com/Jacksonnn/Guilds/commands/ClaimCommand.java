package com.Jacksonnn.Guilds.commands;

import com.Jacksonnn.Guilds.configuration.ConfigManager;
import org.bukkit.command.CommandSender;

import java.util.List;

public class ClaimCommand extends GuildsCommand {
    public ClaimCommand() {
        super("claim", "/guilds claim", ConfigManager.languageConfig.get().getString("Commands.Claim.Description"), new String[] { "claim", "take" });
    }

    public void execute(CommandSender sender, List<String> args) {

    }
}
