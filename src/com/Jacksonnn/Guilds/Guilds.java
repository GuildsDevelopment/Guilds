package com.Jacksonnn.Guilds;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class Guilds extends JavaPlugin {
	public static Guilds plugin;
	public static Logger log;
	
	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public void registerCommands() {
		this.getCommand("guilds").setExecutor(new Commands());
	}
}
