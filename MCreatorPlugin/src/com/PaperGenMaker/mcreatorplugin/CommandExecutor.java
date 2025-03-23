package com.yourpluginname;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.entity.Player;

public class CommandExecutor implements Listener {

    @EventHandler
    public void onPlayerCommand(PlayerCommandPreprocessEvent event) {
        String command = event.getMessage().substring(1).toLowerCase(); // Remove slash
        // Check if it's a custom command, and execute the appropriate action
        if ("giveitem".equals(command)) {
            Player player = event.getPlayer();
            player.sendMessage("Executing custom command: Give item");
            event.setCancelled(true); // Prevent the default behavior
        }
    }
}
