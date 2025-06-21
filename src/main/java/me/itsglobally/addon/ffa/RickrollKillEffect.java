package me.itsglobally.addon.ffa;

import me.bedtwL.ffa.api.PlayerKillEffect;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

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
        Random select = new Random();
        ArrayList<String> nbsList = new ArrayList<>(Arrays.asList(
                "1.nbs",
                "2.nbs",
                "3.nbs"
        ));
        int index = select.nextInt(nbsList.size());
        String nbs = nbsList.get(index);
        String path = Bukkit.getPluginManager().getPlugin("PureFFA").getDataFolder().getAbsolutePath() + "/Addons/Rickroll/" + nbs;
        PlayMusic.playSong(killer, location, path);
    }
}
