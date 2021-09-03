package riyaya1528.paper.sleephealing;

import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class Events implements Listener {
    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent e) {
        if(e.getPlayer().getWorld().getTime() >= -0) {
            if (e.getPlayer().getHealth() < e.getPlayer().getHealthScale()) {
                e.getPlayer().setHealth(e.getPlayer().getHealthScale());
                e.getPlayer().sendActionBar("§a§l体力が回復したよ!!");
                e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ENTITY_VILLAGER_YES,1,1);
            }
        }
    }
}
