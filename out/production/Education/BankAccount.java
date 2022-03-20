package out.production.Education;

public class BankAccount {


    int id = 10;
    String name = "Azatia";
    int balance = 100;

    void popolnenieScheta(int summaPoplneniya) {
        System.out.println("Balans do popolneniya: " + balance);
        System.out.println("Balans popolnyaetsya na: " + summaPoplneniya);
        balance += summaPoplneniya;
        System.out.println("Balans posle poplneniya " + balance);
        System.out.println(); // чтобы с новой строки
    }

    void  snyatieSoScheta(int summaSnyatiya) {
        System.out.println("Balans do snyatiya: " + balance);
        System.out.println("Balans umenshaetsya na: " + summaSnyatiya);
        balance-= summaSnyatiya;
        System.out.println("Balans posle snyatiya: " + balance);
        System.out.println();

    }

}

class BankAccountTest {

    public static void main(String [] args) {

        BankAccount MyAccount = new BankAccount();

        MyAccount.popolnenieScheta(30);
        MyAccount.snyatieSoScheta(20);


    }

}
