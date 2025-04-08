///usr/bin/env jbang "$0" "$@" ; exit $?

import java.util.ArrayList;
import static java.lang.System.*;

public class VideoGame {

    private String name;
    private int releaseYear;
    private String editor;
    private String developper;

    public VideoGame(String name, int releaseYear, String editor, String developper){
        this.name = name;
        this.releaseYear = releaseYear;
        this.editor = editor;
        this.developper = developper;
    }

    public static void main(String... args) {
        ArrayList<VideoGame> games = new ArrayList<>();
        games.add(new VideoGame("Alex Kidd", 1988, "SEGA", "SEGA"));
        games.add(new VideoGame("Sonic", 1990, "SEGA", "SEGA"));
        games.add(new VideoGame("Mario RPG", 1996, "Nintendo", "Nintendo"));
        games.add(new VideoGame("Final Fantasy 6", 1994, "Square", "Square"));
    }
}
