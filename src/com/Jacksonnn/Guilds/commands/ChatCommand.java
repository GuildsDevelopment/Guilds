package com.Jacksonnn.Guilds.commands;

import com.Jacksonnn.Guilds.configuration.ConfigManager;
import org.bukkit.command.CommandSender;

import java.util.List;

public class ChatCommand extends GuildsCommand {
    public ChatCommand() {
        super("chat", "/guilds chat <chatName>", ConfigManager.languageConfig.get().getString("Commands.Chat.Description"), new String[] { "c", "chat", "talk" });
    }

    public void execute(CommandSender sender, List<String> args) {

    }
}
