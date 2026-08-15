package CoreJava.Oops;

//Think of an ATM machine.
// You interact with it to withdraw money,
// check your balance, etc.,
// without needing to know how it processes
// transactions internally.
abstract class ATM {
    ATM(int x)
    {
        System.out.println("In Abstract Class" + x);
    }
    abstract void withdrawMoney();
    abstract void checkBalance();
}

class MyATM extends ATM {
    MyATM(int x)
    {
        super(x);//this is required because of common initialization or state that's why Abstract class has constructor
        System.out.println(x);
    }
    @Override
    void withdrawMoney() {
        System.out.println("Money withdrawn.");
    }

    @Override
    void checkBalance() {
        System.out.println("Balance checked.");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        ATM atm = new MyATM(10);
        atm.withdrawMoney(); // Outputs: Money withdrawn.
        atm.checkBalance(); // Outputs: Balance checked.
    }
}
