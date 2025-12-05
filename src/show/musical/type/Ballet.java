package show.musical.type;

import show.musical.MusicalShow;
import workers.Actor;
import workers.Director;
import workers.Person;

import java.util.ArrayList;

public class Ballet extends MusicalShow {
    Person choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor,
                  ArrayList<String> librettoText, Person choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
