package mine.tesr.SheepEvents;

import org.bukkit.DyeColor;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Sheep;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

public class LeftClick implements Listener {
    Sheep sheep;
    public int rand(int min, int max) { return min + (int)(Math.random() * ((max - min) + 1)); }

    @EventHandler
    public void onClick(EntityDamageByEntityEvent e){
        if(e.getEntityType() == EntityType.SHEEP && e.getDamager().getType() == EntityType.PLAYER){
            e.setCancelled(true);
            sheep = (Sheep) e.getEntity();
            DyeColor randColor = DyeColor.values()[ rand(0, DyeColor.values().length-1) ];
            sheep.setColor(randColor);
        }

    }
}
