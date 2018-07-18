package com.Jacksonnn.Guilds.commands;

import com.Jacksonnn.Guilds.configuration.ConfigManager;
import org.bukkit.command.CommandSender;

import java.util.List;

public class DeleteCommand extends GuildsCommand {
    public DeleteCommand() {
        super("delete", "/guilds delete <name>", ConfigManager.languageConfig.get().getString("Commands.Delete.Description"), new String[] { "d" });
    }

    public void execute(CommandSender sender, List<String> args) {

    }
}
