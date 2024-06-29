package tpas.gl.training.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicLibrary {
    private List<String> songs;

    public MusicLibrary() {
        songs = new ArrayList<>();
    }

    // Method to add a song
    public void addSong(String song) {
        songs.add(song);
        System.out.println(song + " has been added to the library.");
    }

    // Method to remove a song
    public void removeSong(String song) {
        if (songs.remove(song)) {
            System.out.println(song + " has been removed from the library.");
        } else {
            System.out.println(song + " is not in the library.");
        }
    }

    // Method to play a random song
    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("The music library is empty.");
        } else {
            Random random = new Random();
            int index = random.nextInt(songs.size());
            System.out.println("Playing: " + songs.get(index));
        }
    }

    // Main method to test the MusicLibrary class
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();
        myLibrary.addSong("Song 1");
        myLibrary.addSong("Song 2");
        myLibrary.addSong("Song 3");

        myLibrary.playRandomSong();
        myLibrary.playRandomSong();

        myLibrary.removeSong("Song 2");
        myLibrary.playRandomSong();

        myLibrary.removeSong("Song 5"); // Attempt to remove a song not in the library
    }

}
