import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }


    public void printActorsList() {
        System.out.println(title + ", список актеров:");
        for (Actor actor : listOfActors) {
            actor.printActorInfo();
        }
        System.out.println();
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Этот актер уже в списке");
        } else {
            listOfActors.add(actor);
        }
    }

    public void changeActor(Actor newActor, String surname) {
        boolean isActorListed = false;
        Actor actorBeingRemoved = null;
        for (Actor actor : listOfActors) {
            if (actor.surname.equals(surname)) {
                isActorListed = true;
                actorBeingRemoved = actor;
                break;
            }
        }
        if (isActorListed) {
            listOfActors.remove(actorBeingRemoved);
            listOfActors.add(newActor);
        } else {
            System.out.println("В списке нет актера с такой фамилией.");
            System.out.println();
        }
    }
}

