package com.kodilla.good.patterns.challenges;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieStore {

    private static final String IRONMANEN = "Iron Man";
    private static final String IRONMANENPL = "Żelazny człowiek";
    private static final String IRONMANENAll = "IM";
    private static final String AvengersEN = "Avengers";
    private static final String AvengersPL = "Mściciele";
    private static final String AvengersAll = "AV";
    private static final String FlashEN = "Flash";
    private static final String FlashPL = "Błyskawica";
    private static final String FlashAll = "FL";

    private final Map<String, List<String>> booksTitlesWithTranslations = new HashMap<String, List<String>>();

    public Map<String, List<String>> getMovies() {
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add(IRONMANENPL);
        ironManTranslations.add(IRONMANEN);

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add(AvengersPL);
        avengersTranslations.add(AvengersEN );

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add(FlashPL);
        flashTranslations.add(FlashEN);

        booksTitlesWithTranslations.put(IRONMANENAll, ironManTranslations);
        booksTitlesWithTranslations.put(AvengersAll, avengersTranslations);
        booksTitlesWithTranslations.put(FlashAll, flashTranslations);

        return new HashMap<>(booksTitlesWithTranslations);
    }
}
