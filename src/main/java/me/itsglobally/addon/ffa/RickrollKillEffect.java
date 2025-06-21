package me.itsglobally.addon.ffa;

import me.bedtwL.ffa.api.PlayerKillEffect;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class RickrollKillEffect implements PlayerKillEffect {
    @Override
    public void killEffect(Location location, Player player, Player killer) {
        playRickrollKillEffect(location, player, killer);
    }

    @Override
    public ItemStack getItemBase() {
        return new ItemStack(Material.NOTE_BLOCK);
    }

    @Override
    public String getName() {
        return "rickroll";
    }

    @Override
    public String getItemNameKey() {
        return "rickroll";
    }

    public static void playRickrollKillEffect(Location location, Player player, Player killer) {
        String path = Bukkit.getPluginManager().getPlugin("PureFFA").getDataFolder().getAbsolutePath() + "rickroll.nbs";
        PlayMusic.playSong(killer, location, path);
    }
}
