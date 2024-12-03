class Department {
    private String Dname;
    private Employee boss;

    public Department(String Dname) {
        this.Dname = Dname;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
    }

    public String getDName() {
        return Dname;
    }

    public Employee getBoss() {
        return boss;
    }
}
