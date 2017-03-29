package net.mizle.xyz;

import java.math.BigDecimal;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Main extends JavaPlugin{

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
        if(cmd.getName().equalsIgnoreCase("xyz")){
            if ((sender instanceof Player)) { //if sender is a player
                Player p = Bukkit.getPlayer(sender.getName());
                double x = p.getLocation().getX();
                double y = p.getLocation().getY();
                double z = p.getLocation().getZ();
                BigDecimal x_bd = new BigDecimal((String.valueOf(x)));
                BigDecimal y_bd = new BigDecimal((String.valueOf(y)));
                BigDecimal z_bd = new BigDecimal((String.valueOf(z)));
                BigDecimal x_down = x_bd.setScale(1, BigDecimal.ROUND_DOWN);
                BigDecimal y_down = y_bd.setScale(1, BigDecimal.ROUND_DOWN);
                BigDecimal z_down = z_bd.setScale(1, BigDecimal.ROUND_DOWN);
                p.chat("X:" + x_down + " Y:" + y_down + " Z:" + z_down);
                return true;
            }
        }
        return false;
    }

    @Override
    public void onEnable() {
    }

    @Override
    public void onDisable(){
    }
}
