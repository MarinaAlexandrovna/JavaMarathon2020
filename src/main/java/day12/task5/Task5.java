package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> membersOne = new ArrayList<>();
        membersOne.add(new MusicArtist("Chris Martin",43));
        membersOne.add(new MusicArtist("Chris Martin",43));
        membersOne.add(new MusicArtist("Guy Berryman",42));
        membersOne.add(new MusicArtist("William Elan Champion",42));

        MusicBand musicBandOne = new MusicBand("Coldplay",membersOne);

        List<MusicArtist> membersTwo = new ArrayList<>();
        membersTwo.add(new MusicArtist("Nick Carter",40));
        membersTwo.add(new MusicArtist("Brian Littrell",45));
        membersTwo.add(new MusicArtist("AJ Mclean",43));
        membersTwo.add(new MusicArtist("Kevin Richardson",49));
        membersTwo.add(new MusicArtist("Howie D",47));

        MusicBand musicBandTwo = new MusicBand("Backstreet boys",membersTwo);

        System.out.println(membersOne);
        System.out.println(membersTwo);
        System.out.println();

        MusicBand.transferMembers(musicBandOne,musicBandTwo);

        System.out.println(membersOne);
        System.out.println(membersTwo);
    }
}
