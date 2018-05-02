package com.Jacksonnn.Guilds.configuration;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;

public class ConfigManager {
	public static Config defaultConfig;
	public static Config language;
	
	public ConfigManager() {
		defaultConfig = new Config(new File("config.yml"));
		language = new Config(new File("language.yml"));
	}
	
	public static void configCheck(ConfigType type) {
		FileConfiguration config;
		if (type == ConfigType.LANGUAGE) {
			config = language.get();
			
			config.addDefault("General.prefix", "&8[&2Guilds&8]&f ");
			config.addDefault("Commands.NoPermission", "You do not have permission to do that.");
			
		} else if (type == ConfigType.DEFAULT) {
			config = defaultConfig.get();
			
			config.addDefault("Storage", "");
		}
	}
}
