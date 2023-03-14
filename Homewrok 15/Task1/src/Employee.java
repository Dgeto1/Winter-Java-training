public class Employee{
    private String nameEmployee;
    private Manager manager;

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Employee(String nameEmployee, Manager manager) {
        this.nameEmployee = nameEmployee;
        this.manager = manager;
    }
}
