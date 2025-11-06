public class Actor extends Person {

    private final int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Актёр: " + this.name + " " + this.surname + " (Рост " + this.height + " см)";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor actor = (Actor) obj;
        return super.equals(actor) && height == actor.height;
    }

    @Override
    public int hashCode() {
        return super.hashCode() * 31 + height;
    }
}
