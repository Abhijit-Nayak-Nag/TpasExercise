package tpas.gl.training.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MusicLib {
    private List<String> songs;

    public MusicLib() {
        songs = new ArrayList<>();
    }

    // Method to add a song to the library
    public void addSong(String song) {
        songs.add(song);
        System.out.println(song + " has been added to the library.");
    }

    // Method to remove a song from the library
    public void removeSong(String song) {
        if (songs.remove(song)) {
            System.out.println(song + " has been removed from the library.");
        } else {
            System.out.println(song + " is not found in the library.");
        }
    }

    // Method to play a random song from the library
    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("The music library is empty.");
            return;
        }
        Random random = new Random();
        String randomSong = songs.get(random.nextInt(songs.size()));
        System.out.println("Playing: " + randomSong);
    }

    // Method to list all songs in the library
    public void listSongs() {
        if (songs.isEmpty()) {
            System.out.println("The music library is empty.");
            return;
        }
        System.out.println("Songs in the library:");
        for (String song : songs) {
            System.out.println("- " + song);
        }
    }

    // Main method for user interaction
    public static void main(String[] args) {
        MusicLib myLibrary = new MusicLib();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("\nEnter a command (add, remove, play, list, exit): ");
            command = scanner.nextLine().trim().toLowerCase();

//            switch (command) {
//                case "add":
//                    System.out.println("Enter the name of the song to add: ");
//                    String songToAdd = scanner.nextLine();
//                    myLibrary.addSong(songToAdd);
//                    break;
//                case "remove":
//                    System.out.println("Enter the name of the song to remove: ");
//                    String songToRemove = scanner.nextLine();
//                    myLibrary.removeSong(songToRemove);
//                    break;
//                case "play":
//                    myLibrary.playRandomSong();
//                    break;
//                case "list":
//                    myLibrary.listSongs();
//                    break;
//                case "exit":
//                    System.out.println("Exiting the music library.");
//                    scanner.close();
//                    return;
//                default:
//                    System.out.println("Invalid command. Please try again.");
//                    break;


            if (command.equals("add")) {
                System.out.println("Enter the name of the song to add: ");
                String songToAdd = scanner.nextLine();
                myLibrary.addSong(songToAdd);
            } else if (command.equals("remove")) {
                System.out.println("Enter the name of the song to remove: ");
                String songToRemove = scanner.nextLine();
                myLibrary.removeSong(songToRemove);
            } else if (command.equals("play")) {
                myLibrary.playRandomSong();
            } else if (command.equals("list")) {
                myLibrary.listSongs();
            } else if (command.equals("exit")) {
                System.out.println("Exiting the music library.");
                scanner.close();
                break;
            } else {
                System.out.println("Invalid command. Please try again.");
            }
        }
    }
}

