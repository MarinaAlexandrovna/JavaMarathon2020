package day12.task3;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(new MusicBand("BackstreetBoys", 1993));
        musicBands.add(new MusicBand("30 Seconds to Mars", 1998));
        musicBands.add(new MusicBand("Massive Attack ", 1988));
        musicBands.add(new MusicBand("ColdPlay", 1996));
        musicBands.add(new MusicBand("The Black Eyed Peas ", 1995));
        musicBands.add(new MusicBand("Franz Ferdinand", 2002));
        musicBands.add(new MusicBand("Depeche Mode", 1980));
        musicBands.add(new MusicBand("Little Big", 2013));
        musicBands.add(new MusicBand("Die Antwoord", 2008));
        musicBands.add(new MusicBand("Мальбэк", 2016));


        System.out.println(musicBands);
        Collections.shuffle(musicBands);
        System.out.println();
        System.out.println(musicBands);
        System.out.println();
        System.out.println("Группы из списка, которые были основанны в 2000х: ");
        groupsAfter2000(musicBands);

    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> musicBands) {
        for (MusicBand m : musicBands) {
            if (m.getYear() >= 2000) {
                System.out.println(m);
            }
        }
        return musicBands;
    }
}