public class Person {
    protected final String name;
    protected final String surname;
    protected final Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return name.equals(person.name) && surname.equals(person.surname) && gender.equals(person.gender);
    }

    @Override
    public int hashCode() {
        return (name.hashCode() * 31 + surname.hashCode()) * 31 + gender.hashCode();
    }
}
