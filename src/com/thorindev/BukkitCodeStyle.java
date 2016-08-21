package com.thorindev;

import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.thorindev.commands.*;
import com.thorindev.listeners.*;

public class BukkitCodeStyle extends JavaPlugin {
	
	PluginManager pm = getServer().getPluginManager();
	
	public Permission pluginCommandNameSubname = new Permission("pluginname.permissionnode.subnode");
	
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
		getCommand("helloworld").setExecutor(new CommandHelloWorld(this));
	}
	
	private void registerEvents() {
		pm.registerEvents(new ListenerOnJoin(this), this);
	}
	
	private void registerPermissions() {
		pm.addPermission(pluginCommandNameSubname);
	}
	
	private void registerConfig() {
		
	}
}