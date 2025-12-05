package show.musical;

import show.Show;
import workers.Actor;
import workers.Director;
import workers.Person;

import java.util.ArrayList;

public class MusicalShow extends Show {
    Person musicAuthor;
    ArrayList<String> librettoText;

    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor,
                       ArrayList<String> librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }


    public void printLibrettoText() {
        System.out.println(title + ", либретто:");
        for (String line : librettoText) {
            System.out.println(line);
        }
        System.out.println();
    }
}
