package com.chasistorcido.commandtp;

import org.bukkit.plugin.java.JavaPlugin;

public class CommandTP extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("tp").setExecutor(new TeleportCommand());
        getLogger().info("Plugin cargado con éxito.");
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin descargado con éxito.");
    }
}
