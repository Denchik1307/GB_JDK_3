package den.lesson_four;

import java.util.List;

public class Employee {
    private int ID;
    private String phone;
    private String name;
    private String surname;
    private int experience;

    public Employee(int ID, String phone, String name, String surname, int experience) {
        this.ID = ID;
        this.phone = phone;
        this.name = name;
        this.surname = surname;
        this.experience = experience;
    }

    public long getID() {
        return ID;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return  "ID: " + ID +
                ", phone: " + phone +
                ", name: " + name +
                ", surname: " + surname +
                ", experience: " + experience;
    }
}
