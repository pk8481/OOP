abstract class MediaPlayer {
    abstract void play();

    void showMessage() {
        System.out.println("Media Player");
    }
}

class AudioPlayer extends MediaPlayer {
    void play() {
        System.out.println("Playing Audio");
    }
}

class VideoPlayer extends MediaPlayer {
    void play() {
        System.out.println("Playing Video");
    }
}

class Main {
    public static void main(String[] args) {
        MediaPlayer m;

        m = new AudioPlayer();
        m.showMessage();
        m.play();

        m = new VideoPlayer();
        m.showMessage();
        m.play();
    }
}
