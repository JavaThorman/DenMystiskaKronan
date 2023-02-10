public class Main {
    public static void main(String[] args) {



        int pastriesPrice = 25; // Priset på bullar
        int kalleMoney = 10; // Kalles pengar
        int pelleMoney = 10; // Pelles pengar
        int tjalleMoney = 10; // Tjalles pengar
        int redCrossDonation = 2; // Donation till Röda Korset

// Skriver ut informationen till Console
        System.out.println("Bullarna kostar " + pastriesPrice);
        System.out.println("Kalle har " + kalleMoney);
        System.out.println("Pelle har " + pelleMoney);
        System.out.println("Tjalle har " + tjalleMoney);
        System.out.println();

// Beräkning av summan för köpet
        System.out.println("De betalar " + (kalleMoney + pelleMoney + tjalleMoney));
        int moneyLeftAfterPurchase = (kalleMoney + pelleMoney + tjalleMoney) - pastriesPrice;
        kalleMoney -= 10;
        pelleMoney -= 10;
        tjalleMoney -= 10;
        System.out.println("Kalle har nu " + kalleMoney);
        System.out.println("Pelle har nu " + pelleMoney);
        System.out.println("Tjalle har nu " + tjalleMoney);
        System.out.println("Och får tillbaka " + moneyLeftAfterPurchase);
        System.out.println();

// Delar pengarna så att alla får en krona
        System.out.println("De delar så att de får en krona var");
        kalleMoney++;
        pelleMoney++;
        tjalleMoney++;
        //moneyLeftAfterPurchase agerar som en counter för vad som finns kvar.
        //Och denna måste få värdet x-3, där x i detta fallet är 5 - då vi ger ut en krona var till varje person.
        moneyLeftAfterPurchase -= 3;
        redCrossDonation += moneyLeftAfterPurchase;
        System.out.println("Kalle har nu " + kalleMoney);
        System.out.println("Pelle har nu " + pelleMoney);
        System.out.println("Tjalle har nu " + tjalleMoney);
        System.out.println("Och donerar " + moneyLeftAfterPurchase + " till Röda korset");
        moneyLeftAfterPurchase = 0;
        System.out.println();

// Summerar utläggen
        System.out.println("Summa summarum:\n");
        int expenses = (10 - 1) * 3;
        System.out.print("De donerade 2 kronor ");
        System.out.print("och betalade 10 - 1 kronor var, alltså 9*3 = " + expenses + " kronor\n");
        System.out.println("Detta resulterar i att det totala blev "+ expenses +" kronor. \nDär av 3 kronor över.");
        expenses += 2;
        System.out.println("Summan blir då: " + pastriesPrice +" + 2 Kronor donation.");

        System.out.println("Alla gick senare hem med sin krona och köpte en aktie med dom som efter 17 år\nhade ökat i värde med hela 2500kr.");

// Kontrollerar att utläggen stämmer
        if (expenses != 30) {
            System.out.println("Error 404: Krona not found");
        }

    }

}