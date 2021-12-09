package beans;

import java.util.List;

public class MusicPlayer {
    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    private List<Music> musicList;
    private String name;
    private int volume;

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {}

    public void playMusic() {
        for (Music music: musicList) {
            System.out.println("Playing " + music.getSong());
        }
    }
}
