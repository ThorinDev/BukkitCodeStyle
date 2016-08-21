package com.thorindev;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitCodeStyle extends JavaPlugin {
	
	PluginManager pm = getServer().getPluginManager();
	
	@Override
	public void onEnable() {
		registerCommands();
		registerEvents();
		registerPermissions();
		registerConfig();
	}
	
	@Override
	public void onDisable() {
		
	}
	
	private void registerCommands() {
		
	}
	
	private void registerEvents() {
		
	}
	
	private void registerPermissions() {
		
	}
	
	private void registerConfig() {
		
	}
}