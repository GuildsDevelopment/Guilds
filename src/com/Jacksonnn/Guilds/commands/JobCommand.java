package com.Jacksonnn.Guilds.commands;

import com.Jacksonnn.Guilds.configuration.ConfigManager;
import org.bukkit.command.CommandSender;

import java.util.List;

public class JobCommand extends GuildsCommand {
    public JobCommand() {
        super("job", "/guilds job", ConfigManager.languageConfig.get().getString("Commands.Job.Description"), new String[] { "j", "work" });
    }

    public void execute(CommandSender sender, List<String> args) {

    }
}
