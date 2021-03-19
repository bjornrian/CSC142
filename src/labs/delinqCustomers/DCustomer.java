package labs.delinqCustomers;

public class DCustomer implements Comparable<DCustomer>{
    private String id;
    private String name;
    private Double balance;

    public DCustomer(String id, String name, Double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }

    public int compareTo(DCustomer otherCust) {
        return Double.compare(otherCust.balance, this.balance);
    }
}
