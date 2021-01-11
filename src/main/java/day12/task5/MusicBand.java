package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private List<MusicArtist> members;

    public MusicBand(String name, List<MusicArtist> members) {
        this.name = name;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand musicBandOne, MusicBand musicBandTwo) {
        for (MusicArtist members : musicBandOne.getMembers()) {
            musicBandTwo.getMembers().add(members);
        }
        musicBandOne.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(this.members);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", members=" + members +
                '}';
    }
}



