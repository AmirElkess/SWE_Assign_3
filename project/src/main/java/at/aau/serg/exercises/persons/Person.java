package at.aau.serg.exercises.persons;

public class Person {
    private String firstname;
    private String lastname;
    private Integer age;
    private string profession;
    private String preferredProgrammingLanguage;
    private String ide;
    private boolean database;
    private String field;
    private String preferredTestingFramework;

    public Person(String firstname, String lastname, Integer age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public void setProfession(String profession) {
        this.profession = Profession.fromString(profession);
    }

    public String getPreferredProgrammingLanguage() {
        return preferredProgrammingLanguage;
    }

    public void setPreferredProgrammingLanguage(String preferredProgrammingLanguage) {
        this.preferredProgrammingLanguage = preferredProgrammingLanguage;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public boolean isDatabase() {
        return database;
    }

    public void setDatabase(boolean database) {
        this.database = database;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getPreferredTestingFramework() {
        return preferredTestingFramework;
    }

    public void setPreferredTestingFramework(String preferredTestingFramework) {
        this.preferredTestingFramework = preferredTestingFramework;
    }

    public String getJobBeschreibung() {
        return profession != null ? profession.getDescription() : "";
    }

    public String getJobBeschreibung() {
        switch (profession) {
            case "Developer":
                return "Develops code.";
            case "Architect":
                return "Designs the architecture of the project.";
            case "Tester":
                return "Tests code.";
            default:
                return "";
        }
    }
}
