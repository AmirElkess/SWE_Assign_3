package at.aau.serg.exercises.persons;

public class Tester extends Person {
    public Tester() {
        super();
    }

    public Tester(String firstname, String lastname, Integer age,
                  String preferredLanguage, IDE ide, boolean database) {
        super(firstname, lastname, age, preferredLanguage, ide, database);
    }

    @Override
    public Profession getProfession() {
        return Profession.Tester;
    }

    @Override
    public String getJobBeschreibung() {
        return "Tests code.";
    }
}