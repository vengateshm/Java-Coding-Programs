package annotationSample;

@XMLSerializable(tag = "acct_details")
public class BankAccount {
    private int id;
    @XMLElement
    private String name;
    @XMLElement(tag = "bal")
    private double balance;

    public BankAccount() {
    }

    public BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
