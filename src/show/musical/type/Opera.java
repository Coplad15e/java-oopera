package show.musical.type;

import show.musical.MusicalShow;
import workers.Actor;
import workers.Director;
import workers.Person;

import java.util.ArrayList;

public class Opera extends MusicalShow {
    int choirSize;

    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor,
                 ArrayList<String> librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
