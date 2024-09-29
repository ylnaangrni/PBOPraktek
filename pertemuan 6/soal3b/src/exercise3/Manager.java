package exercise3;

class Manager extends Employee {
    private String secretaryName;

    public Manager(String n, double s, int day, int month, int year) {
        super(n, s, day, month, year);
        secretaryName = "";
    }

    @Override
    public void raiseSalary(double byPercent) {
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }

    public String getSecretaryName() {
        return secretaryName;
    }
}

