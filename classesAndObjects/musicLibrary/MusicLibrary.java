package classesAndObjects.musicLibrary;

import java.util.*;

public class MusicLibrary {

    private String song;

    private static List<MusicLibrary> playlist = new ArrayList<>();



    public String getSong() {

        return song;

    }

    public void setSong(String song) {

        this.song = song;

    }

    @Override

    public String toString() {

        return song;

    }

    public static void display() {

        for (MusicLibrary item : playlist) {

            System.out.println(item);

        }

    }

    public void addSong(MusicLibrary item) {

        playlist.add(item);

        System.out.println("The "+ song+" has been added in the playlist");

    }

    public void removeSong(MusicLibrary item) {

        playlist.remove(item);

        System.out.println("The song " +item+" has been removed");

    }

    public static void playRandomSong() {

        if (playlist.isEmpty()) {

            System.out.println("No songs available to play.");

        } else {

            Random rand = new Random();

            int randomIndex = rand.nextInt(playlist.size());

            String randomSong = String.valueOf(playlist.get(randomIndex));

            System.out.println("Playing random song: " + randomSong);

        }

    }

    public static void main(String[] args) {

        MusicLibrary item1 = new MusicLibrary();

        MusicLibrary item2 = new MusicLibrary();

        MusicLibrary item3 = new MusicLibrary();

        MusicLibrary item4 = new MusicLibrary();

        item1.setSong("Big dawgz");

        item2.setSong("Entertainment");

        item3.setSong("Dusk till dawn");

        item4.setSong("Baby");

        item1.addSong(item1);

        item2.addSong(item2);

        item3.addSong(item3);

        item4.addSong(item4);

        System.out.println();

        display();

        System.out.println();

        item1.removeSong(item3);

        display();

        playRandomSong();

    }

}