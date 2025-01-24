package p81;

import java.util.Objects;

public class Human{
    private String name;
    private Integer age;
    private Double height;

/*
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Human human = (Human) object;
        return java.util.Objects.equals(name, human.name) && java.util.Objects.equals(age, human.age) && java.util.Objects.equals(height, human.height);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), name, age, height);
    }*/


    public boolean equals(Object object) {
        if (!(object instanceof Human)) return false;
        if (!super.equals(object)) return false;
        Human human = (Human) object;
        return java.util.Objects.equals(name, human.name) && java.util.Objects.equals(age, human.age) && java.util.Objects.equals(height, human.height);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), name, age, height);
    }
}