package mine.tesr.SheepEvents;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

public class RightClick implements Listener {

    @EventHandler
    public void onClick(PlayerInteractEntityEvent e){
        if(e.getRightClicked().getType() == EntityType.SHEEP){
            e.getPlayer().getWorld().strikeLightning(Objects.requireNonNull(e.getRightClicked().getLocation()));
        }

    }
}
