package com.Jacksonnn.Guilds.configuration;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;

public class ConfigManager {
	public static Config defaultConfig;
	public static Config languageConfig;
	
	public ConfigManager() {
		defaultConfig = new Config(new File("config.yml"));
		languageConfig = new Config(new File("language.yml"));
		configCheck(ConfigType.DEFAULT);
		configCheck(ConfigType.LANGUAGE);
	}
	
	public static void configCheck(ConfigType type) {
		FileConfiguration config;
		if (type == ConfigType.LANGUAGE) {
			config = languageConfig.get();

			config.addDefault("Commands.Add.Description", "&6Add Description");
			config.addDefault("Commands.Admin.Description", "&6Admin Description");
			config.addDefault("Commands.Attack.Description", "&6AttackDescription");
			config.addDefault("Commands.Chat.Description", "&6Chat Description");
			config.addDefault("Commands.Claim.Description", "&6Claim Description");
			config.addDefault("Commands.Coins.Description", "&6Coins Description");
			config.addDefault("Commands.Create.Description", "&6Create Description");
			config.addDefault("Commands.Delete.Description", "&6Delete Description");
			config.addDefault("Commands.Help.Description", "&6Help Description");
			config.addDefault("Commands.Info.Description", "&6Info Description");
			config.addDefault("Commands.Invite.Description", "&6Invite Description");
			config.addDefault("Commands.Job.Description", "&6Job Description");
			config.addDefault("Commands.Kick.Description", "&6Kick Description");
			config.addDefault("Commands.Remove.Description", "&6Remove Description");
			config.addDefault("Commands.Trust.Description", "&6Trust Description");
			config.addDefault("Commands.Unclaim.Description", "&6Unclaim Description");

			config.addDefault("Commands.NoPermission", "You do not have permission to do that.");
			
			config.addDefault("General.prefix", "&8[&2Guilds&8]&f ");

			languageConfig.save();
		} else if (type == ConfigType.DEFAULT) {
			config = defaultConfig.get();
			
			config.addDefault("Storage.engine", "sqlite");

			config.addDefault("Storage.MySQL.host", "localhost");
			config.addDefault("Storage.MySQL.port", 3306);
			config.addDefault("Storage.MySQL.pass", "");
			config.addDefault("Storage.MySQL.db", "minecraft");
			config.addDefault("Storage.MySQL.user", "root");

			defaultConfig.save();
		}
	}
}
