public class Main {

    public static Employee[] employees = {
            new Employee("Nikita Kuznetsov Петрович", 1, 80000),
            new Employee("Sergey Ivanov Семенович", 2, 60000),
            new Employee("Marina Semenova Валерьевна", 3, 115000),
            new Employee("Anna Nikolaeva Ивановна", 4, 180000),
            new Employee("Elena Solovyeva Дмитриевна", 5, 120000),
            new Employee("Nikolay Petrov Сергеевич", 1, 110000),
            new Employee("Dmitriy Danilov Вячеславович", 2, 250000),
            new Employee("Maxim Kotov Николаевич", 3, 190000),
            new Employee("Viktor Malorodov Иванович", 4, 170000),
            new Employee("Timur Merekeshev Алексеевич", 5, 130000),
    };

    public static void main(String[] args) {
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary(){
        Employee employeeWithMinSalary = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee findEmployeeWithMaxSalary(){
        Employee employeeWithMaxSalary = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    public static float calculateAverageSalary() {
        return calculateTotalSalary() / employees.length;
    }
}