package lesson02;





public class Employee {

    private String name;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;
    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = Integer.parseInt(phone);
        this.salary= salary;
        this.age = age;
    }
    public void printInfo() {
        System.out.println("Name - "+name+", Position - "+position+", email - "+email+", phone - "+phone+", salary - "+salary+ ", age - "+age);
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Max Verstappen", "Manager", "max@gmail.com", "1234567890", 50000000, 25);
        employees[1] = new Employee("Fernando Alonso", "Manager", "alonso@gmail.com", "1234567890", 5000000, 42);
        employees[2] = new Employee("George Russel", "Manager", "russel@gmail.com", "1234567890", 500000, 24);
        employees[3] = new Employee("Kimi Raikonnen", "Manager", "kimi@gmail.com", "1234567890", 50000, 45);
        employees[4] = new Employee("Charles Lecler", "Manager", "lecler@gmail.com", "1234567890", 500000, 26);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) {
                employees[i].printInfo();
            }
}
    }
}

