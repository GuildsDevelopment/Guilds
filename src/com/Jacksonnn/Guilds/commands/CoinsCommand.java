package com.Jacksonnn.Guilds.commands;

import com.Jacksonnn.Guilds.configuration.ConfigManager;
import org.bukkit.command.CommandSender;

import java.util.List;

public class CoinsCommand extends GuildsCommand {
    public CoinsCommand() {
        super("coins", "/guilds coins <add | remove | deposit | withdrawl>", ConfigManager.languageConfig.get().getString("Commands.Coins.Description"), new String[] { "money", "bank" });
    }

    public void execute(CommandSender sender, List<String> args) {

    }
}
