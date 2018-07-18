package com.Jacksonnn.Guilds.commands;

import com.Jacksonnn.Guilds.configuration.ConfigManager;
import org.bukkit.command.CommandSender;

import java.util.List;

public class InviteCommand extends GuildsCommand {
    public InviteCommand() {
        super("invite", "/guilds invite <player>", ConfigManager.languageConfig.get().getString("Commands.Invite.Description"), new String[] { "i" });
    }

    public void execute(CommandSender sender, List<String> args) {

    }
}
