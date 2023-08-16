import java.util.ArrayList;
import java.util.List;
interface MusicPlayer
{
    void play();
    void pause();
    void stop();
    void addSong(String song);
    void removeSong(String song);
}
class MyMusicPlayer implements MusicPlayer {
    private List playlist;
    private boolean isPlaying;

    private MyMusicPlayer() {
        this.playlist = new ArrayList<>();
        this.isPlaying = false;
    }

    public void play() {
        if (!playlist.isEmpty()) {
            System.out.println("Now Playing: " + playlist.get(0));
        } else {
            System.out.println("Playlist is empty");
        }
    }

    public void pause() {
        if (isPlaying) {
            System.out.println("Song paused: " + playlist.get(0));
            isPlaying = false;
        } else {
            System.out.println("No song playing " + playlist.get(0));
        }
    }

    public void stop() {
        if (isPlaying) {
            System.out.println("Song stopped: " + playlist.get(0));
            isPlaying = false;
        } else {
            System.out.println("No song playing " + playlist.get(0));
        }

    }

    public void removeSong(String song) {
        if (playlist.contains(song)) {
            playlist.remove(song);
            System.out.println("Song removed: " + song);
        } else {
            System.out.println("Playlist does not contain the given song");
        }
    }

    public void addSong(String song) {
        playlist.add(song);
        System.out.println("Song added: " + song);
    }

    public class MusicPlayerInterface {
        public static void main(String[] args) {
            MusicPlayer player = new MyMusicPlayer();
            player.addSong("Choo Lo");
            player.addSong("MockingBird");
            player.addSong("Aftaab");
            player.addSong("Pehli Nazar");
            player.play();
            player.pause();
            player.removeSong("Aftaab");
            player.stop();
        }
    }
}




