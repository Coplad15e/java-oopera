import show.Show;
import show.musical.type.Ballet;
import show.musical.type.Opera;
import workers.Actor;
import workers.Director;
import workers.Gender;
import workers.Person;

import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Дмитрий", "Ионов", Gender.MALE, 185);
        Actor actor2 = new Actor("Жанна", "Карпова", Gender.FEMALE, 178);
        Actor actor3 = new Actor("Кирилл", "Котов", Gender.MALE, 175);

        Director director1 = new Director("Валерия", "Дмитриенко", Gender.FEMALE, 67);
        Director director2 = new Director("Сергей", "Лесников", Gender.MALE, 14);

        Person musicAuthor = new Person("Алексей", "Вавилов", Gender.MALE);
        Person choreographer = new Person("Светлана", "Васильева", Gender.FEMALE);

        ArrayList<Actor> showClockworkOrangeActorList = new ArrayList<>();
        Show showClockworkOrange = new Show("Заводной апельсин", 160, director1,
                showClockworkOrangeActorList);

        ArrayList<Actor> balletSwanLakeActorList = new ArrayList<>();
        ArrayList<String> balletSwanLakeLibretto = new ArrayList<>();
        balletSwanLakeLibretto.add("Действие первое");
        balletSwanLakeLibretto.add("Действие происходит в Германии. Декорации первого действия изображают роскошный");
        balletSwanLakeLibretto.add("парк, в глубине которого виднеется замок. Через ручей перекинут красивый мостик.");
        balletSwanLakeLibretto.add("На сцене молодой владетельный принц Зигфрид, празднующий свое совершеннолетие.");
        balletSwanLakeLibretto.add("Друзья принца сидят за столиками и попивают вино. Пришедшие поздравить принца");
        balletSwanLakeLibretto.add("крестьяне и, конечно, крестьянки по желанию старого подвыпившего-таки Вольфганга,");
        balletSwanLakeLibretto.add("наставника молодого принца, танцуют. Принц угощает танцующих мужчин вином,");
        balletSwanLakeLibretto.add("а Вольфганг ухаживает за крестьянками,одаривает их лентами и букетами. и тд.");
        Ballet balletSwanLake = new Ballet("Лебединое озеро",190, director2, balletSwanLakeActorList,
                musicAuthor, balletSwanLakeLibretto, choreographer);

        ArrayList<Actor> operaQueenOfSpadesActorList = new ArrayList<>();
        ArrayList<String> operaQueenOfSpadesLibretto = new ArrayList<>();
        operaQueenOfSpadesLibretto.add("КАРТИНА ПЕРВАЯ");
        operaQueenOfSpadesLibretto.add("Весна. Летний сад. Площадка. На скамейках сидят и ходят по саду нянюшки,");
        operaQueenOfSpadesLibretto.add("гувернантки и кормилицы. Дети играют в горелки, другие прыгают через");
        operaQueenOfSpadesLibretto.add("веревки, бросают мячи.");
        operaQueenOfSpadesLibretto.add(" ");
        operaQueenOfSpadesLibretto.add("Девочки:");
        operaQueenOfSpadesLibretto.add("Гори, гори ясно,");
        operaQueenOfSpadesLibretto.add("Чтобы не погасло,");
        operaQueenOfSpadesLibretto.add("Раз, два, три!");
        operaQueenOfSpadesLibretto.add("и тд.");
        Opera operaQueenOfSpades = new Opera("Пиковая дама",150, director1, operaQueenOfSpadesActorList,
                musicAuthor, operaQueenOfSpadesLibretto, 16);

        showClockworkOrange.addActor(actor1);
        showClockworkOrange.addActor(actor2);

        balletSwanLake.addActor(actor1);
        balletSwanLake.addActor(actor3);

        operaQueenOfSpades.addActor(actor2);
        operaQueenOfSpades.addActor(actor3);

        showClockworkOrange.printActorsList();
        balletSwanLake.printActorsList();
        operaQueenOfSpades.printActorsList();

        operaQueenOfSpades.changeActor(actor1, "Котов");
        operaQueenOfSpades.printActorsList();

        balletSwanLake.changeActor(actor2, "Вощенко");

        balletSwanLake.printLibrettoText();
        operaQueenOfSpades.printLibrettoText();



    }
}
