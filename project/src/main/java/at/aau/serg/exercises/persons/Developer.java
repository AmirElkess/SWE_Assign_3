package at.aau.serg.exercises.persons;

public class Developer extends Person {
    public Developer() {
        super();
    }

    public Developer(String firstname, String lastname, Integer age,
                     String preferredLanguage, IDE ide, boolean database) {
        super(firstname, lastname, age, preferredLanguage, ide, database);
    }

    @Override
    public Profession getProfession() {
        return Profession.Developer;
    }

    @Override
    public String getJobBeschreibung() {
        return "Develops code.";
    }
}