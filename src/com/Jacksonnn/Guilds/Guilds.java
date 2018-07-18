package com.Jacksonnn.Guilds;

import java.util.logging.Logger;

import com.Jacksonnn.Guilds.commands.Commands;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.Jacksonnn.Guilds.configuration.ConfigManager;
import com.Jacksonnn.Guilds.storage.DBConnection;

import net.md_5.bungee.api.ChatColor;

public class Guilds extends JavaPlugin {
	public static Guilds plugin;
	public static Logger log;
	
	@Override
	public void onEnable() {
		plugin = this;
		Guilds.log = this.getLogger();
		new ConfigManager();
		new Commands(this);
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
		Bukkit.getServer().getLogger().info(ChatColor.DARK_GREEN + "[Guilds] Guilds has sucessfully been enabled!");
	}
	
	@Override
	public void onDisable() {
		if (DBConnection.isOpen != false) {
			DBConnection.sql.close();
		}
		Bukkit.getServer().getLogger().info(ChatColor.DARK_GREEN + "[Guilds] Guilds has sucessfully been disabled!");
	}
}
