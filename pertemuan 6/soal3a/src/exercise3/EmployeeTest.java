package exercise3;

// Kelas EmployeeTest
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[2] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[0] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[1] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        System.out.println("Sebelum pengurutan:");
        for (Employee e : staff) {
            e.print();
        }

        Sortable.shell_sort(staff);

        System.out.println("\nSetelah pengurutan:");
        for (Employee e : staff) {
            e.print();
        }
    }
}

