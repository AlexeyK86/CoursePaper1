public class Employee {
    public final Integer id;
    public String fullName;
    public Integer department;
    public Integer salary;

    public static Integer counter = 1;

    public Employee(String fullName, Integer department, Integer salary) {
        this.id = counter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public static Integer getCounter() {
        return counter;
    }

    public static void setCounter(Integer counter) {
        Employee.counter = counter;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}