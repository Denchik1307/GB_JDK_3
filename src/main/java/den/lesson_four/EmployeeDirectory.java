package den.lesson_four;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory implements IEmployeeDirectory {

    private final List<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public List<Employee> findByExperience(int experience) {
        List<Employee> employees = employeeList.stream()
                .filter(employee -> employee.getExperience() == experience)
                .toList();
        showEmployeeList("By experience: " + experience, employees);
        return employees;
    }

    @Override
    public List<Employee> findByName(String name) {
        List<Employee> employees = employeeList.stream()
                .filter(employeeName -> employeeName.getName().equals(name))
                .toList();
        showEmployeeList("By name: " + name, employees);
        return employees;
    }

    @Override
    public Employee findByPhone(String phone) {
        Employee tmp = employeeList.stream()
                .filter(employee -> employee.getPhone().equals(phone))
                .findFirst()
                .orElse(new Employee(0,"none","none","none",0));
        showEmployee("By phone: " + phone, tmp);
        return tmp;
    }

    @Override
    public List<Employee> findBySurname(String surname) {
        List<Employee> employers = employeeList.stream()
                .filter(employee -> employee.getSurname().equals(surname))
                .toList();
        showEmployeeList("By surname: " + surname, employers);
        return employers;
    }

    @Override
    public Employee findById(long id) {
        Employee tmp = employeeList.stream()
                .filter(employee -> employee.getID() == id)
                .findFirst()
                .orElse(new Employee(0,"none","none","none",0));
        showEmployee("By ID: " + id, tmp);
        return tmp;
    }

    private void showEmployee(String marker, Employee employee) {
        System.out.println(marker);
        System.out.println(employee);
        System.out.println();
    }

    private void showEmployeeList(String marker, List<Employee> list) {
        System.out.println(marker);
        list.forEach(System.out::println);
        System.out.println();
    }
}
