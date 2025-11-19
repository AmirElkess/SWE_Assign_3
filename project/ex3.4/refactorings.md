First obvious refactoring is to replace publicly fields with private ones and provide getters and setters for ensuring integrity on fields changes.

Second, Profession should be an enum rather than a string to prevent fragility when handling inputs to functions. The switch-case statement will be as follows:

```java
public String getJobBeschreibung() {
    switch (profession) {
        case Profession.Developer:
            return "Develops code.";
        case Profession.Architect:
            return "Designs the architecture of the project.";
        case Profession.Tester:
            return "Tests code.";
    }
}
```
with no default case. but we must also ensure that the class doesn't accept in constructor or setters any invalid profession.

The constructor will be:
```java
public Person(String firstname, String lastname, Integer age, Profession profession) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.age = age;
    this.profession = Objects.requireNonNull(profession, "profession must not be null");
}
```

and the setter:
```java
public void setProfession(Profession profession) {
    this.profession = java.util.Objects.requireNonNull(profession, "profession must not be null");
}
```




