package com.Jacksonnn.Guilds.commands;

import com.Jacksonnn.Guilds.configuration.ConfigManager;
import org.bukkit.command.CommandSender;

import java.util.List;

public class AdminCommand extends GuildsCommand {

    public AdminCommand() {
        super("admin", "/guilds admin", ConfigManager.languageConfig.get().getString("Commands.Admin.Description"), new String[] { "admin", "staff" });
    }

    public void execute(CommandSender sender, List<String> args) {

    }
}
