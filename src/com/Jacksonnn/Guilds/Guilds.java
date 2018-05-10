package com.Jacksonnn.Guilds;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

import com.Jacksonnn.Guilds.storage.DBConnection;

public class Guilds extends JavaPlugin {
	public static Guilds plugin;
	public static Logger log;
	
	@Override
	public void onEnable() {
		DBConnection.host = getConfig().getString("Storage.MySQL.host");
		DBConnection.port = getConfig().getInt("Storage.MySQL.port");
		DBConnection.pass = getConfig().getString("Storage.MySQL.pass");
		DBConnection.db = getConfig().getString("Storage.MySQL.db");
		DBConnection.user = getConfig().getString("Storage.MySQL.user");
		DBConnection.init();
		if (DBConnection.isOpen() == false) {
			// Message is logged by DBConnection
			return;
		}

	}
	
	@Override
	public void onDisable() {
		
	}
	
	public void registerCommands() {
		this.getCommand("guilds").setExecutor(new Commands());
		this.getCommand("g").setExecutor(new Commands());
		this.getCommand("guild").setExecutor(new Commands());
	}
}
