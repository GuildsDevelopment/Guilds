package com.Jacksonnn.Guilds.commands;

import com.Jacksonnn.Guilds.Guilds;
import org.bukkit.command.PluginCommand;

public class Commands {
    private Guilds plugin;

    public Commands(Guilds plugin) {
        this.plugin = plugin;
        registerCommands();
    }

    public void registerCommands() {
        PluginCommand Guilds = plugin.getCommand("guilds");
        new AddCommand();
        new AdminCommand();
        new AttackCommand();
        new ChatCommand();
        new ClaimCommand();
        new CoinsCommand();
        new CreateCommand();
        new DeleteCommand();
        new HelpCommand();
        new InfoCommand();
        new InviteCommand();
        new JobCommand();
        new KickCommand();
        new RemoveCommand();
        new TrustCommand();
        new UnclaimCommand();
    }
}
