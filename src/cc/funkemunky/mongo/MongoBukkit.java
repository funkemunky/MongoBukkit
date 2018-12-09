package cc.funkemunky.mongo;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class MongoBukkit extends JavaPlugin {

    public void onEnable() {
        Bukkit.getLogger().log(Level.INFO, "Loaded MongoDB libraries into the Bukkit plugin-cache.");
    }
}
