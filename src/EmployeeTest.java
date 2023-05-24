public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee trab1 = new Employee("Jonatas", "Boaze", 200),
                trab2 = new Employee("Guilherme", "Braga", 7500);

        System.out.printf("First enterprise's employee (%s %s) anual salary: $%.2f%n",
                trab1.getFirstName(), trab1.getLastName(), trab1.getAnualSalary());
        System.out.printf("Second enterprise's employee (%s %s) anual salary: $%.2f%n%n",
                trab2.getFirstName(), trab2.getLastName(), trab2.getAnualSalary());

        trab1.plusSalary(Boolean.FALSE, 100);
        trab2.plusSalary(Boolean.FALSE, 100);

        System.out.printf("New anual salary for %s %s: %.2f%n",
                trab1.getFirstName(), trab1.getLastName(), trab1.getAnualSalary());
        System.out.printf("New anual salary for %s %s: %.2f%n",
                trab2.getFirstName(), trab2.getLastName(), trab2.getAnualSalary());
    }
}
