///usr/bin/env jbang "$0" "$@" ; exit $?

import java.util.ArrayList;
import static java.lang.System.*;

public class VideoGameConsole {

    private String name;
    private int releaseYear;
    private String companyName;

    public VideoGameConsole(String name, int releaseYear, String companyName) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.companyName = companyName;
    }

    public static void main(String... args) {
        ArrayList<VideoGameConsole> consoles = new ArrayList<>();
        consoles.add(new VideoGameConsole("My first 16 bit Console", 1987, "SEGA"));
        consoles.add(new VideoGameConsole("Another 16 bit console", 1991, "Nintendo"));
        consoles.add(new VideoGameConsole("Awesome 3D console", 1996, "Sony"));
        consoles.add(new VideoGameConsole("3D console with weird joystick", 1997, "Nintendo"));
    }
}
