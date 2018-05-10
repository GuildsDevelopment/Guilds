package com.Jacksonnn.Guilds.storage;

import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import com.Jacksonnn.Guilds.Guilds;
import com.Jacksonnn.Guilds.Methods;

/*
 * What needs to be stored:
 * 		Guild:
 * 			Name
 * 			Members
 * 			Chunks Claimed
 * 			Leader
 * 			Amount of Money (Coins)
 * 			Moderators of Guild ("Apprentices")
 * 			Trusted Guilds (Guilds that are allied with the current one)
 * 			
 * 		Players:
 * 			Balance
 * 			Guilds joined previously
 * 			Current Guild
 * 			Rank in Guild
 * 			Date they joined the server
 * 			Last online
 */

public class DBConnection {

	public static Database sql;

	public static String host;
	public static int port;
	public static String db;
	public static String user;
	public static String pass;
	public static boolean isOpen = false;

	public static void init() {
		if (Guilds.plugin.getConfig().getString("Storage.engine").equalsIgnoreCase("mysql")) {
			sql = new MySQL(Guilds.log, "Establishing MySQL Connection...", host, port, user, pass, db);
			if (((MySQL) sql).open() == null) {
				Guilds.log.severe("Disabling due to database error");
				Methods.stopPlugin();
				return;
			}

			isOpen = true;
			Guilds.log.info("Database connection established.");

			if (!sql.tableExists("guilds_guilds")) {
				Guilds.log.info("Creating guilds_guilds table");
				String query = "CREATE TABLE `guilds_guilds` (" + "`id` INTEGER NOT NULL," + "`leader` varchar(255) NOT NULL," + "`name` varchar(255)," + "`members` varchar(255)," + "`chunks_claimed` varchar(255)," + "`coins` varchar(255)," + "`apprentices` varchar(255)," + "`trusted` varchar(255)," + " PRIMARY KEY (id));";
				sql.modifyQuery(query, false);
			}

			if (!sql.tableExists("guilds_players")) {
				Guilds.log.info("Creating guilds_players table");
				String query = "CREATE TABLE `guilds_players` (" + "`uuid` varchar(36) NOT NULL," + "`name` varchar(255) NOT NULL," + "`balance` varchar(255)," + "`previous` varchar(255)," + "`current` varchar(255)," + "`rank` varchar(255)," + "`joined` varchar(255)," + "``last_login varchar(255)," + " PRIMARY KEY (uuid, name));";
				sql.modifyQuery(query, false);
			}
		} else {
			sql = new SQLite(Guilds.log, "Establishing SQLite Connection.", "Guilds.db", Guilds.plugin.getDataFolder().getAbsolutePath());
			if (((SQLite) sql).open() == null) {
				Guilds.log.severe("Disabling due to database error");
				Methods.stopPlugin();
				return;
			}

			isOpen = true;
			Guilds.log.info("Database connection established.");

			if (!sql.tableExists("guilds_guilds")) {
				Guilds.log.info("Creating guilds_guilds table");
				String query = "CREATE TABLE `guilds_guilds` (" + "`id` INTEGER NOT NULL," + "`leader` varchar(255) NOT NULL," + "`name` varchar(255)," + "`members` varchar(255)," + "`chunks_claimed` varchar(255)," + "`coins` varchar(255)," + "`apprentices` varchar(255)," + "`trusted` varchar(255)," + " PRIMARY KEY (id));";
				sql.modifyQuery(query, false);
			}

			if (!sql.tableExists("guilds_players")) {
				Guilds.log.info("Creating guilds_players table");
				String query = "CREATE TABLE `guilds_players` (" + "`uuid` varchar(36) NOT NULL," + "`name` varchar(255) NOT NULL," + "`balance` varchar(255)," + "`previous` varchar(255)," + "`current` varchar(255)," + "`rank` varchar(255)," + "`joined` varchar(255)," + "``last_login varchar(255)," + " PRIMARY KEY (uuid, name));";
				sql.modifyQuery(query, false);
			}
		}
	}

	public static boolean isOpen() {
		return isOpen;
	}
}