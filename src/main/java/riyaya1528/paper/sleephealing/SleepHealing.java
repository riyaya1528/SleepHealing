package riyaya1528.paper.sleephealing;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SleepHealing extends JavaPlugin {
    public static SleepHealing instance;

    @Override
    public void onEnable() {
        instance = this;
        RegisterEvents();
        getLogger().info("プラグインが有効になりました");
    }

    @Override
    public void onDisable() {
        getLogger().info("プラグインが無効になりました");
    }

    public static void RegisterEvents() {
        Bukkit.getServer().getPluginManager().registerEvents(new Events(),SleepHealing.instance);
    }
}
