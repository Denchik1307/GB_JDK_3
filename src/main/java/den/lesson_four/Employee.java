package den.lesson_four;

public class Employee {
    private final int ID;
    private final String phone;
    private final String name;
    private final String surname;
    private final int experience;

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
        return "ID: " + ID +
                ", phone: " + phone +
                ", name: " + name +
                ", surname: " + surname +
                ", experience: " + experience;
    }
}
