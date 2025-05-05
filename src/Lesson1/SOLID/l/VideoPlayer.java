package Lesson1.SOLID.l;

public class VideoPlayer implements VideoPlayable {
    @Override
    public void playAudio() {
        System.out.println("Audio playing");
    }

    @Override
    public void playVideo() {
        System.out.println("Video playing.");
    }

    public static void main(String[] args) {
        VideoPlayable videoPlayer = new VideoPlayer();
        AudiPlayable audiPlayer = new AudioPlayer();
        videoPlayer.playAudio();
        videoPlayer.playVideo();

        audiPlayer.playAudio();
    }
}
