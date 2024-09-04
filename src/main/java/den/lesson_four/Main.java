package den.lesson_four;

/*
Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавления нового сотрудника в справочник

 */
public class Main {
    public static void main(String[] args) {
        IEmployeeDirectory employeeDirectory = new EmployeeDirectory();
        Employee p1 = new Employee(1, "45869587", "Ivan", "Ezha", 5);
        Employee p2 = new Employee(2, "58965785", "Alex", "Djecson", 3);
        Employee p3 = new Employee(3, "58965785", "Svetlana", "Ruber", 3);

        employeeDirectory.addEmployee(p1);
        employeeDirectory.addEmployee(p2);
        employeeDirectory.addEmployee(p3);

        employeeDirectory.findByExperience(3);
        employeeDirectory.findByPhone("45869587");
        employeeDirectory.findByName("Ivan");
        employeeDirectory.findBySurname("Djecson");
        employeeDirectory.findById(3);
        employeeDirectory.findById(4);
    }
}
