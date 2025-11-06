import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        //cоздать 3 актеров и 2 режиссеров
        Actor actor1 = new Actor("Сергей", "Бурунов", Gender.MALE, 174);
        Actor actor2 = new Actor("Джиын", "Ли", Gender.FEMALE, 162);
        Actor actor3 = new Actor("Роберт", "Паттисон", Gender.MALE, 185);

        Director director1 = new Director("Цзяньцзюнь", "Син", Gender.MALE, 180);
        Director director2 = new Director("Елизавета", "Бондарь", Gender.FEMALE, 171);

        //3 спектакля: обычный, оперный, балет
        Show show = new Show("Гамильтон", 160, director1, new ArrayList<>());
        Opera opera = new Opera("Руслан и Людмила", 190, director2, new ArrayList<>(),
                "Автор музыки", "Либретто оперы", 20);
        Ballet ballet = new Ballet("Лебединое озеро", 170, director2, new ArrayList<>(),
                "Автор музыки", "Либретто балета", "Хореограф");

        //распределить актеров по спектаклям
        show.addActor(actor1);
        show.addActor(actor2);
        show.addActor(actor3);
        opera.addActor(actor1);
        opera.addActor(actor2);
        ballet.addActor(actor3);
        ballet.addActor(actor1);

        //для каждого вывести список актеров
        show.printActors();
        opera.printActors();
        ballet.printActors();

        //заменить для одного спектакля актера и вывести еще раз
        ballet.changeActor(actor2, "Бурунов");
        ballet.printActors();

        //замена несуществующего актера
        opera.changeActor(actor3, "Петров");
        opera.printActors();

        //для оперы и балета = вывести либретто
        opera.printLibretto();
        ballet.printLibretto();
    }
}
