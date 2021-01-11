package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List <String> membersOne = new ArrayList<>();
        membersOne.add("Chris Martin");
        membersOne.add("Jonny Buckland");
        membersOne.add("Guy Berryman");
        membersOne.add("William Elan Champion");

        MusicBand musicBandOne = new MusicBand("Coldplay",membersOne );

        List<String> membersTwo = new ArrayList<>();
        membersTwo.add("Nick Carter");
        membersTwo.add("Brian Littrel");
        membersTwo.add("AJ Mcqueen");
        membersTwo.add("Kevin Richardson");
        membersTwo.add("Howie D");

        MusicBand musicBandTwo = new MusicBand("Backstreet Boys", membersTwo);

        musicBandOne.printMembers();
        musicBandTwo.printMembers();

        MusicBand.transferMembers(musicBandOne,musicBandTwo);

        musicBandOne.printMembers();
        musicBandTwo.printMembers();







    }
}
