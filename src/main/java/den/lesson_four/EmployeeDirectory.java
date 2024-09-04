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
        showEmployeeList("By experience:",employees);
        return employees;
    }

    @Override
    public List<Employee> findByName(String name) {
        List<Employee> employees = employeeList.stream()
                .filter(employeeName -> employeeName.getName().equals(name))
                .toList();
        showEmployeeList("By name:",employees);
        return employees;
    }

    @Override
    public Employee findByPhone(String phone) {
        Employee tmp = employeeList.stream()
                .filter(employee -> employee.getPhone().equals(phone))
                .findFirst()
                .orElse(null);
        showEmployee("By phone:\n",tmp);
        return tmp;
    }

    @Override
    public List<Employee> findBySurname(String surname) {
        List<Employee> employers = employeeList.stream()
                .filter(employee -> employee.getSurname().equals(surname))
                .toList();
        showEmployeeList("By surname:", employeeList);
        return employers;
    }

    @Override
    public Employee findById(long id) {
        Employee tmp = employeeList.stream()
                .filter(employee -> employee.getID() == id)
                .findFirst()
                .orElse(null);
        showEmployee("By ID:\n",tmp);
        return tmp;
    }

    private void showEmployee(String marker, Employee employee) {
        System.out.println(marker + employee + "\n");
    }

    private void showEmployeeList(String marker, List<Employee> list) {
        System.out.println(marker);
        list.forEach(System.out::println);
        System.out.println();
    }
}
