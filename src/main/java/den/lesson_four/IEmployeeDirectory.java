package den.lesson_four;

import java.util.List;

public interface IEmployeeDirectory {
    void addEmployee(Employee employee);

    List<Employee> findByExperience(int experience);

    Employee findByPhone(String phone);

    List<Employee> findByName(String name);

    List<Employee> findBySurname(String surname);

    Employee findById(long id);

}
