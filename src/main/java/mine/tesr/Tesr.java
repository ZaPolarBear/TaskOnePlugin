package mine.tesr;

import mine.tesr.SheepEvents.LeftClick;
import mine.tesr.SheepEvents.RightClick;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Tesr extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new RightClick(), this);
        Bukkit.getPluginManager().registerEvents(new LeftClick(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
