package com.Jacksonnn.Guilds.commands;

import com.Jacksonnn.Guilds.Guilds;
import com.Jacksonnn.Guilds.configuration.ConfigManager;
import org.bukkit.command.CommandSender;

import java.util.List;

public class AttackCommand extends GuildsCommand {

    public AttackCommand() {
        super("attack", "/guilds attack <guild>", ConfigManager.languageConfig.get().getString("Commands.Attack.Description"), new String[] { "attack", "war" });
    }

    public void execute(CommandSender sender, List<String> args) {

    }
}
