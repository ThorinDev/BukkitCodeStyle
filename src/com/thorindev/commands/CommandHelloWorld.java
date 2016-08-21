package com.thorindev.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.thorindev.BukkitCodeStyle;

import net.md_5.bungee.api.ChatColor;

public class CommandHelloWorld implements CommandExecutor {

	BukkitCodeStyle plugin;
	 
	public CommandHelloWorld(BukkitCodeStyle instance) {
		plugin = instance;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.RED + "You need to be a player to use the command, " + ChatColor.GREEN + "/" + cmd.getName().toString());
			return true;
		}
		else {
			Player player = (Player) sender;
		}
		return false;
	}

}
