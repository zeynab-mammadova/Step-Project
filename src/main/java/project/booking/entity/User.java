package project.booking.entity;

import java.util.Objects;

public class User {
    public final String name;
    public final String surname;
    public final Integer id;

    public User(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id=id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return name.toUpperCase()+" "+surname.toUpperCase();
    }

}