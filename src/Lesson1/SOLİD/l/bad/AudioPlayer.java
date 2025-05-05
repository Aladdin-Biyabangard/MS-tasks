package Lesson1.SOLİD.l.bad;

public class AudioPlayer extends MediaPlayer {

    @Override
    public void playAudio() {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        MediaPlayer player = new AudioPlayer();
        player.playAudio();
        player.playVideo();
    }

}