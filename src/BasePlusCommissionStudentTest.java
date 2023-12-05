public class BasePlusCommissionStudentTest{
    public static void main(String[] args) {
        BasePlusCommissionStudent student =
        new BasePlusCommissionStudent(
            "Indiana", "Jones", "696-69-6996", 10000, .06, 300
        );

        System.out.println(
            "Student information obtained by get methods:"
        );
        System.out.printf("%n%s %s%n", "First name is",
        student.getFirstName()
        );
        System.out.printf("%s %s%n", "Last name is",
        student.getLastName()
        );
        System.out.printf("%s %s%n", "Social security number is",
        student.getSocialSecurityNumber()
        );
        System.out.printf("%s %.2f%n", "Gross sales is",
        student.getGrossSales()
        );
        System.out.printf("%s %.2f%n", "Commission rate is",
        student.getCommissionRate()
        );
        System.out.printf("%s %.2f%n", "Base salary is",
        student.getBaseSalary()
        );

        student.setBaseSalary(19800);

        System.out.printf("%n%s:%n%n%s%n",
        "Updated student information obtained by toString", student
        );
    }
}
