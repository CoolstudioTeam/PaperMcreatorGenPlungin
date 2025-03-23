package com.yourpluginname;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Register the command creators
        getCommand("commandcreate").setExecutor(new CommandCreator());
        getCommand("enchantmentcreate").setExecutor(new EnchantmentCommand());
        getCommand("itemcreate").setExecutor(new ItemCreateCommand());

        // Register event listeners
        getServer().getPluginManager().registerEvents(new CommandExecutor(), this);
        getServer().getPluginManager().registerEvents(new EnchantmentUI(), this);
        getServer().getPluginManager().registerEvents(new ItemCreatorUI(), this);

        getLogger().info("MCreator Plugin Enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("MCreator Plugin Disabled.");
    }
}
