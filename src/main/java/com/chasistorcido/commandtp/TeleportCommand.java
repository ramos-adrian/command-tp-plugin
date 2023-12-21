package com.chasistorcido.commandtp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Location;

public class TeleportCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Este comando solo puede ser usado por un jugador.");
            return false;
        }

        Player player = (Player) sender;

        if (args.length != 3) {
            player.sendMessage("Uso correcto: /tp <x> <y> <z>");
            return false;
        }

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        Location location = new Location(player.getWorld(), x, y, z);
        player.teleport(location);
        player.sendMessage("¡Teletransporte completado!");

        return true;
    }
}
