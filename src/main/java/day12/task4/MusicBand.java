package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private List<String> members;

    public MusicBand(String name, List<String> members) {
        this.name = name;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public static void transferMembers(MusicBand musicBandOne, MusicBand musicBandTwo) {
        for (String m : musicBandOne.getMembers()) {
            musicBandTwo.getMembers().add(m);
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



