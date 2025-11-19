import java.util.Objects;

package at.aau.serg.exercises.persons;

public abstract class Person {
    private String firstname;
    private String lastname;
    private Integer age;
    private String preferredLanguage;
    private IDE ide;
    private boolean database;
    private String field;
    private String preferredTestingFramework;

    public Person(String firstname, String lastname, Integer age,
                  String preferredLanguage, IDE ide, boolean database) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.preferredLanguage = preferredLanguage;
        this.setIde(ide);
        this.database = database;
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

    public abstract Profession getProfession();

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public IDE getIde() {
        return ide;
    }

    public void setIde(IDE ide) {
        this.ide = Objects.requireNonNull(ide, "ide must not be null");
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

    // subclasses should override
    public String getJobBeschreibung() {
        return "";
    }
}
