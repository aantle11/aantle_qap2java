public class TestCreditCard {
    public static void main(String[] args) {
        Address addr = new Address("237J Harvey Hall", "Menomonie", "WI", "54751");
        Person diane = new Person("Diane", "Christie", addr);
        Money limit = new Money(1000.00);
        CreditCard card = new CreditCard(diane, limit);

        System.out.println(diane);
        System.out.println("Balance: " + card.getBalance());
        System.out.println("Credit Limit: " + card.getCreditLimit());

        System.out.println("Attempt to charge $200.00");
        card.charge(new Money(200.00));
        System.out.println("Balance: " + card.getBalance());

        System.out.println("Attempt to charge $10.02");
        card.charge(new Money(10.02));
        System.out.println("Balance: " + card.getBalance());

        System.out.println("Attempt to pay $25.00");
        card.payment(new Money(25.00));
        System.out.println("Balance: " + card.getBalance());

        System.out.println("Attempt to charge $990.00");
        card.charge(new Money(990.00));
        System.out.println("Balance: " + card.getBalance());
    }
}