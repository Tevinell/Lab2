public class Employee {
    private String name;
    private Department depart;

    public Employee(String name, Department depart) {
        this.name = name;
        this.depart = depart;
    }

    public String getName() {
        return name;
    }

    public Department getDepart() {
        return depart;
    }

    public String toString() {
        if (depart.getBoss() == this) {
            return name + " - начальник отдела " + depart.getName();
        } else {
            return name + " работает в отделе " + depart.getName() + ", начальник которого " + depart.getBoss().getName();
        }
    }
}
