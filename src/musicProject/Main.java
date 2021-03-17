package musicProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Create an ArrayList and store five of your favorite music tracks in it.
        ArrayList<MusicTrack> myPlaylist = new ArrayList<MusicTrack>(5);
        myPlaylist.add(new MusicTrack("Lil Baby", "The Bigger Picture"));
        myPlaylist.add(new MusicTrack("Drake", "Laugh Now, Cry Later"));
        myPlaylist.add(new MusicTrack("David Bowie", "Modern Love"));
        myPlaylist.add(new MusicTrack("Polo G", "Martin & Gina"));
        myPlaylist.add(new MusicTrack("Polo G", "GNF (OKOKOK)"));

        //Create a second ArrayList and store six music tracks you think your friends will like.
        ArrayList<MusicTrack> friendPlaylist = new ArrayList<MusicTrack>(6);
        friendPlaylist.add(new MusicTrack("Bad Artist", "Trash Music"));
        friendPlaylist.add(new MusicTrack("PewDiePie", "Coco"));
        friendPlaylist.add(new MusicTrack("Justin Bieber", "Yummy"));
        friendPlaylist.add(new MusicTrack("6ix9ine", "Gooba"));
        friendPlaylist.add(new MusicTrack("Katy Perry", "Smile"));
        friendPlaylist.add(new MusicTrack("Tory Lanez's", "Money Over Fallouts"));

        //You decide against the second track in the friend list; delete it from the list.
        friendPlaylist.remove(1);

        //Create a third ArrayList to hold a party playlist.  To it, add all the tracks in the other two ArrayLists.
        ArrayList<MusicTrack> partyPlaylist = new ArrayList<MusicTrack>(10);
        partyPlaylist.addAll(myPlaylist);
        partyPlaylist.addAll(friendPlaylist);

        //Randomize  the  playlist. For each of the elements  in  the  ArrayList,  generate  a  random  number between 0 and 100 and store it in the track order.
        Random rand = new Random();
        for (int i = 0; i < partyPlaylist.size(); i++) {
            int randomNumber = rand.nextInt(101);
            partyPlaylist.get(i).setTrackNumber(randomNumber);
        }

        //Sort the playlist by track order.
        Collections.sort(partyPlaylist);

        //Write the playlist into a file called PlayList.txt.
        try {
            File outFile = new File("PartyPlaylist.txt");
            PrintStream output = new PrintStream(outFile);

            output.println("--------------");
            output.println("Party Playlist");
            output.println("--------------");
            for (MusicTrack track: partyPlaylist) {
                output.println(track);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
