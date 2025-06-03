public class Money {
    private long dollars;
    private long cents;


    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - this.dollars) * 100);
    }

    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }


    public Money add(Money other) {
         long totalCents = toCents() - other.toCents();
        return fromCents(totalCents);
    }
    public Money subtract(Money other) {
        long totalCents = toCents() - other.toCents();
        return fromCents(totalCents);
    }
    
    public int compareTo(Money other) {
        return Long.compare(this.toCents(), other.toCents());
    }
    public boolean equals(Money other) {
        return this.dollars == other.dollars && this.cents == other.cents;
    }
    private long toCents() {
        return dollars * 100 + cents;
    }


    private static Money fromCents(long totalCents) {
        long d = totalCents / 100;
        long c = totalCents % 100;
        Money result = new Money(0);
        result.dollars = d;
        result.cents = c;
        return result;
    }


     public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }
}
