package workers;

import java.util.Objects;

public class Actor extends Person{
    int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public void printActorInfo() {
        System.out.printf("%s %s (%d см)%n", name, surname, height);

    }

    @Override
    public boolean equals(Object o) { //переменную так назвал генератор, не бей
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return height == actor.height && Objects.equals(name,actor.name) && Objects.equals(surname, actor.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(height) + Objects.hashCode(name)*31 + Objects.hashCode(surname)*37;
    }
}
