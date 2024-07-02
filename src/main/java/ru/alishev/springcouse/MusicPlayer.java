package ru.alishev.springcouse;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
