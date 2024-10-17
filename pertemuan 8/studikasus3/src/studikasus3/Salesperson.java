package studikasus3;

public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson)other).getLastName()) &&
                firstName.equals(((Salesperson)other).getFirstName()));
    }

    public int compareTo(Salesperson other) {
        // Urutkan berdasarkan totalSales secara menurun
        if (this.totalSales != other.totalSales) {
            return Integer.compare(other.totalSales, this.totalSales);

        }
        
        // Jika penjualan sama, urutkan berdasarkan lastName secara abjad terbalik
        int lastNameComparison = this.lastName.compareTo(other.lastName);
        if (lastNameComparison != 0) {
            return -lastNameComparison; // Balikkan urutan abjad
        }
        
        // Jika lastName sama, urutkan berdasarkan firstName secara abjad terbalik
        return -this.firstName.compareTo(other.firstName); // Balikkan urutan abjad
    }
    
    

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSales() {
        return totalSales;
    }
}