public class polymorphism {

    void pay(int amount) {
        System.out.println("Payment completed");
    }
}

class CreditCardPayment extends polymorphism {

    void pay(int amount) {
        System.out.println("Paid using Credit Card");
    }
}

class UPIPayment extends polymorphism {

    void pay(int amount) {
        System.out.println("Paid using UPI");
    }
}

class Main {
    public static void main(String[] args) {

        polymorphism p;

        p = new CreditCardPayment();
        p.pay(500);

        p = new UPIPayment();
        p.pay(300);
    }
}
 
