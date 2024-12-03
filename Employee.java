class Employee {
    private String eName;
    private Department department;

    public Employee(String eName, Department department) {
        this.eName = eName;
        this.department = department;
    }

    public String geteName() {
        return eName;
    }

    public Department getDepartment() {
        return department;
    }

    public String toString() {
        if (department.getBoss() == this) {
            return eName + " - начальник отдела " + department.getDName();
        } else {
            return eName + " работает в отделе " + department.getDName() + ", начальник которого " + department.getBoss().geteName();
        }
    }
}
