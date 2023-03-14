public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager("Svilen");
        Employee e1 = new Employee("Ivan", m1);

        Manager m2 = new Manager("Refo");
        Employee e2 = new Employee("Daniela", m2);

        Manager m3 = new Manager("Refo");
        Employee e3 = new Employee("Ivan", m3);

        Manager m4 = new Manager("Svilen");
        Employee e4 = new Employee("Ivan", m4);

        Employee e5 = new Employee("Ivan", m1);

        System.out.println(compare(e1, e2));
        System.out.println(compare(e1, e3));
        System.out.println(compare(e1, e4));
        System.out.println(compare(e1, e5));

    }

    public static boolean compare(Employee e1, Employee e2) {
        if (e1 == null && e2 == null) {
            return true;
        }
        if (e1 == null || e2 == null) {
            return false;
        }

        if (e1.getNameEmployee() == e2.getNameEmployee() && e1.getManager().getName() == e2.getManager().getName()) {
            return true;
        }
        return false;
    }
}