package com.nhodev.myapplication;

import com.nhodev.myapplication.models.Artist;
import com.nhodev.myapplication.models.Genre;

import java.util.Arrays;
import java.util.List;

public class GenreDataFactory {

    public static List<Genre> makeGenres() {
        return Arrays.asList(makeRockGenre(),
                makeJazzGenre(),
                makeClassicGenre(),
                makeSalsaGenre(),
                makeBluegrassGenre());
    }

    public static List<SingleCheckGenre> makeSingleCheckGenres() {
        return Arrays.asList(makeSingleCheckRockGenre(),
                makeSingleCheckJazzGenre(),
                makeSingleCheckClassicGenre(),
                makeSingleCheckSalsaGenre(),
                makeSingleCheckBluegrassGenre());
    }

    public static Genre makeRockGenre() {
        return new Genre("Rock", makeRockArtists());
    }

    public static SingleCheckGenre makeSingleCheckRockGenre() {
        return new SingleCheckGenre("Rock", makeRockArtists(), R.drawable.ic_electric_guitar);
    }

    public static List<Artist> makeRockArtists() {
        Artist queen = new Artist("Queen", "id01", R.drawable.ic_banjo, false);
        Artist styx = new Artist("Styx", "id02", R.drawable.ic_electric_guitar, false);
        Artist reoSpeedwagon = new Artist("REO Speedwagon", "id03", R.drawable.ic_maracas, false);
        Artist boston = new Artist("Boston", "id04", R.drawable.ic_maracas, false);

        return Arrays.asList(queen, styx, reoSpeedwagon, boston);
    }

    public static Genre makeJazzGenre() {
        return new Genre("Jazz", makeJazzArtists());
    }

    public static SingleCheckGenre makeSingleCheckJazzGenre() {
        return new SingleCheckGenre("Jazz", makeJazzArtists(), R.drawable.ic_saxaphone);
    }

    public static List<Artist> makeJazzArtists() {
        Artist queen = new Artist("Queen", "id01", R.drawable.ic_banjo, false);
        Artist styx = new Artist("Styx", "id02", R.drawable.ic_electric_guitar, false);
        Artist reoSpeedwagon = new Artist("REO Speedwagon", "id03", R.drawable.ic_maracas, false);
        Artist boston = new Artist("Boston", "id04", R.drawable.ic_maracas, false);

        return Arrays.asList(queen, styx, reoSpeedwagon, boston);
    }

    public static Genre makeClassicGenre() {
        return new Genre("Classic", makeClassicArtists());
    }

    public static SingleCheckGenre makeSingleCheckClassicGenre() {
        return new SingleCheckGenre("Classic", makeClassicArtists(), R.drawable.ic_violin);
    }

    public static List<Artist> makeClassicArtists() {
        Artist queen = new Artist("Queen", "id01", R.drawable.ic_banjo, false);
        Artist styx = new Artist("Styx", "id02", R.drawable.ic_electric_guitar, false);
        Artist reoSpeedwagon = new Artist("REO Speedwagon", "id03", R.drawable.ic_maracas, false);
        Artist boston = new Artist("Boston", "id04", R.drawable.ic_maracas, false);

        return Arrays.asList(queen, styx, reoSpeedwagon, boston);
    }

    public static Genre makeSalsaGenre() {
        return new Genre("Salsa", makeSalsaArtists());
    }

    public static SingleCheckGenre makeSingleCheckSalsaGenre() {
        return new SingleCheckGenre("Salsa", makeSalsaArtists(), R.drawable.ic_maracas);
    }

    public static List<Artist> makeSalsaArtists() {
        Artist queen = new Artist("Queen", "id01", R.drawable.ic_banjo, false);
        Artist styx = new Artist("Styx", "id02", R.drawable.ic_electric_guitar, false);
        Artist reoSpeedwagon = new Artist("REO Speedwagon", "id03", R.drawable.ic_maracas, false);
        Artist boston = new Artist("Boston", "id04", R.drawable.ic_maracas, false);

        return Arrays.asList(queen, styx, reoSpeedwagon, boston);
    }

    public static Genre makeBluegrassGenre() {
        return new Genre("Bluegrass", makeBluegrassArtists());
    }

    public static SingleCheckGenre makeSingleCheckBluegrassGenre() {
        return new SingleCheckGenre("Bluegrass", makeBluegrassArtists(), R.drawable.ic_banjo);
    }

    public static List<Artist> makeBluegrassArtists() {
        Artist queen = new Artist("Queen", "id01", R.drawable.ic_banjo, false);
        Artist styx = new Artist("Styx", "id02", R.drawable.ic_electric_guitar, false);
        Artist reoSpeedwagon = new Artist("REO Speedwagon", "id03", R.drawable.ic_maracas, false);
        Artist boston = new Artist("Boston", "id04", R.drawable.ic_maracas, false);

        return Arrays.asList(queen, styx, reoSpeedwagon, boston);
    }

}

