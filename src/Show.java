import java.util.ArrayList;

public class Show {
    protected final String title;
    protected final int duration;
    protected final Director director;
    protected final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printActors() {
        System.out.println("Список актёров спектакля \"" + title + "\": ");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    private boolean isCasted(Actor actor) {
        for (Actor actor2 : listOfActors) {
            if (actor.equals(actor2))
                return true;
        }
        return false;
    }

    public void addActor(Actor actor) {
        if (!isCasted(actor))
            listOfActors.add(actor);
        else
            System.out.println("Этот актёр уже есть в спектакле!");
    }

    public void changeActor(Actor actor, String oldSurname) {
        if (isCasted(actor)) {
            System.out.println("Этот актёр уже играет в этом спектакле.");
            return;
        }
        Actor oldActor = null;
        for (Actor actor2 : listOfActors) {
            if (actor2.getSurname().equals(oldSurname))
                oldActor = actor2;
        }
        if (oldActor != null) {
            listOfActors.remove(oldActor);
            listOfActors.add(actor);
        } else {
            System.out.println("Извините, этого актёра нет в этом спектакле.");
        }
    }

}