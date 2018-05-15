package com.Jacksonnn.Guilds;

public class Methods {
	private static Guilds plugin;
	
	String version = "BETA 1.0";
	
	public static void stopPlugin() {
		plugin.getServer().getPluginManager().disablePlugin(plugin);
	}
	
	
}
