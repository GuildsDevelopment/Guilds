package com.Jacksonnn.Guilds;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Guilds extends JavaPlugin {
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
