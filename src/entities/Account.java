package entities;

public class Account {
    private int numberAccount;
    public String name;
    public double value;

    public Account(int numberAccount, String name) {
        this.numberAccount = numberAccount;
        this.name = name;
    }

    public Account(int numberAccount, String name, double value) {
        this.numberAccount = numberAccount;
        this.name = name;
        this.value = value;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String toString() {
        return "Account " + numberAccount + ", " + "Holder: " + name + ", " + "Balance " + value;
    }


    public void addValueAccount(double value){
        this.value += value;
    }

    public void removeValueAccount(double value){
       double inicialValue = this.value;

       inicialValue -= value;
       inicialValue -= 5;
       
       this.value = inicialValue;
    }
}
