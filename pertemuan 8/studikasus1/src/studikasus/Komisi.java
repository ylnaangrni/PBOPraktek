package studikasus;

public class Komisi extends PekerjaLepas {
    private double totalSales;
    private double                                          commissionRate;

    public Komisi(String name, String address, String phone, String socSecNumber, double hourlyPayRate, double commissionRate) {
        super(name, address, phone, socSecNumber, hourlyPayRate);
        this.commissionRate = commissionRate;
        this.totalSales = 0;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double payment = super.pay() + (commissionRate * totalSales);
        totalSales = 0;
        return payment;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Sales: $" + totalSales;
    }
}
