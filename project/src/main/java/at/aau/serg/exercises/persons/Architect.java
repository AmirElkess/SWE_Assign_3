package at.aau.serg.exercises.persons;

public class Architect extends Person {
    public Architect() {
        super();
    }

    public Architect(String firstname, String lastname, Integer age,
                     String preferredLanguage, IDE ide, boolean database) {
        super(firstname, lastname, age, preferredLanguage, ide, database);
    }

    @Override
    public Profession getProfession() {
        return Profession.Architect;
    }

    @Override
    public String getJobBeschreibung() {
        return "Designs the architecture of the project.";
    }
}