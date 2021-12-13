public class Song implements IComponent {

    public String songName;
    public String artist;
    public float speed = 1; // Default playback speed

    public Song(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
    }

    public void play() {
        // play
    }

    public void setPlaybackSpeed(float speed) {
        this.speed = speed;
    }

    public String getName() {
        return songName;
    }

    public String getArtist() {
        return artist;
    }
}
