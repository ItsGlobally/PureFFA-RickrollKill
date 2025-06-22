package me.itsglobally.addon.ffa;

import com.xxmicloxx.NoteBlockAPI.model.Song;
import com.xxmicloxx.NoteBlockAPI.songplayer.PositionSongPlayer;
import com.xxmicloxx.NoteBlockAPI.utils.NBSDecoder;
import me.bedtwL.ffa.api.PureAPI;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.io.File;

public class PlayMusic {
    public static void playSong(Player player, Location location, String path) {
        Song song = NBSDecoder.parse(new File(path));
        PositionSongPlayer psp = new PositionSongPlayer(song);
        psp.setTargetLocation(location);
        psp.setDistance(16);
        for (Player p:location.getWorld().getPlayers())
            psp.addPlayer(p);
        psp.setPlaying(true);

    }
}
