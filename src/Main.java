public class Main {
    public static void main(String[] args) {
        int oneMile = 20; // amount of Rubles for 1 mile
        int ticketPrice = 2100; // ticket price
        int bonusMiles = ticketPrice / oneMile; //amount of miles per ticket

        System.out.println(("Koличество начисленных миль: ")+ (bonusMiles));
    }
}