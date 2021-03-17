package musicProject;

import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MusicTrack> myPlaylist = new ArrayList<MusicTrack>(5);
        myPlaylist.add(new MusicTrack("Lil Baby", "The Bigger Picture"));
        myPlaylist.add(new MusicTrack("Drake", "Laugh Now, Cry Later"));
        myPlaylist.add(new MusicTrack("David Bowie", "Modern Love"));
        myPlaylist.add(new MusicTrack("Polo G", "Martin & Gina"));
        myPlaylist.add(new MusicTrack("Polo G", "GNF (OKOKOK)"));

        ArrayList<MusicTrack> bestiePlaylist = new ArrayList<MusicTrack>(6);
        bestiePlaylist.add(new MusicTrack("Bad Artist", "Trash Music"));
        bestiePlaylist.add(new MusicTrack("PewDiePie", "Coco"));
        bestiePlaylist.add(new MusicTrack("Justin Bieber", "Yummy"));
        bestiePlaylist.add(new MusicTrack("6ix9ine", "Gooba"));
        bestiePlaylist.add(new MusicTrack("Katy Perry", "Smile"));
        bestiePlaylist.add(new MusicTrack("Tory Lanez's", "Money Over Fallouts"));
        bestiePlaylist.remove(1);

        ArrayList<MusicTrack> partyPlaylist = new ArrayList<MusicTrack>(10);
        partyPlaylist.addAll(myPlaylist);
        partyPlaylist.addAll(bestiePlaylist);
        Random rand = new Random();
        for (int i = 0; i < partyPlaylist.size(); i++) {
            int randomNumber = rand.nextInt(101);
//            partyPlaylist.
        }
    }
}
