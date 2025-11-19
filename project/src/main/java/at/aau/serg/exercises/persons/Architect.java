package at.aau.serg.exercises.persons;

public class Architect extends Person {
    private ArchitectField field;

    public Architect() {
        super();
    }

    public Architect(String firstname, String lastname, Integer age,
                     String preferredLanguage, IDE ide, boolean database,
                     ArchitectField field) {
        super(firstname, lastname, age, preferredLanguage, ide, database);
        this.setArchitectField(field);
    }

    @Override
    public Profession getProfession() {
        return Profession.Architect;
    }

    @Override
    public String getJobBeschreibung() {
        return "Designs the architecture of the project.";
    }

    // typed accessor for the architect-specific field
    public ArchitectField getArchitectField() {
        return field;
    }

    public void setArchitectField(ArchitectField field) {
        this.field = Objects.requireNonNull(field, "field must not be null");
    }
}