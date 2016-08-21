package com.thorindev.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.thorindev.BukkitCodeStyle;

public class ListenerOnJoin implements Listener {
	
	BukkitCodeStyle plugin;
	 
	public ListenerOnJoin(BukkitCodeStyle instance) {
		plugin = instance;
	}

	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = (Player) event.getPlayer();
	}
}
