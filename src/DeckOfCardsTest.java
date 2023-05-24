import java.util.Scanner;

public class DeckOfCardsTest
{
    public static void main(String[] args)
    {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        Scanner input = new Scanner(System.in);
        String result;
        String result2;


        myDeckOfCards.Shuffle();
        Card[] hand = myDeckOfCards.drawHand();
        Card[] hand2 = myDeckOfCards.drawHand();
        int[][] frequency = DeckOfCards.cardsFrequency(hand);
        result = DeckOfCards.handAnalysis(frequency)[0];

        if (!result.equals("Straight") && !result.equals("Full House"))
            hand = myDeckOfCards.reworkHand(hand);

        System.out.println("Your hand:");
        for (Card card : hand2)
            System.out.printf("%-21s", card);

        System.out.printf("%nDo you want to change some card? ");
        String answer = input.nextLine();

        if (answer.equals("Y")) {
            System.out.print("How many cards do you want to change? ");
            int cardAnswer = input.nextInt();
            switch (cardAnswer) {
                case 1 -> {
                    System.out.print("Which is the card who do you want to change? ");
                    cardAnswer = input.nextInt();
                    switch (cardAnswer) {
                        case 1 -> hand2[0] = myDeckOfCards.dealCard();
                        case 2 -> hand2[1] = myDeckOfCards.dealCard();
                        case 3 -> hand2[2] = myDeckOfCards.dealCard();
                        case 4 -> hand2[3] = myDeckOfCards.dealCard();
                        case 5 -> hand2[4] = myDeckOfCards.dealCard();
                    }
                }
                case 2 -> {
                    System.out.print("Which is the first card who do you want to change? ");
                    cardAnswer = input.nextInt();
                    switch (cardAnswer) {
                        case 1 -> hand2[0] = myDeckOfCards.dealCard();
                        case 2 -> hand2[1] = myDeckOfCards.dealCard();
                        case 3 -> hand2[2] = myDeckOfCards.dealCard();
                        case 4 -> hand2[3] = myDeckOfCards.dealCard();
                        case 5 -> hand2[4] = myDeckOfCards.dealCard();
                    }
                    System.out.print("Which is the second card who do you want to change? ");
                    cardAnswer = input.nextInt();
                    switch (cardAnswer) {
                        case 1 -> hand2[0] = myDeckOfCards.dealCard();
                        case 2 -> hand2[1] = myDeckOfCards.dealCard();
                        case 3 -> hand2[2] = myDeckOfCards.dealCard();
                        case 4 -> hand2[3] = myDeckOfCards.dealCard();
                        case 5 -> hand2[4] = myDeckOfCards.dealCard();
                    }
                }
                case 3 -> {
                    System.out.print("Which is the first card who do you want to change? ");
                    cardAnswer = input.nextInt();
                    switch (cardAnswer) {
                        case 1 -> hand2[0] = myDeckOfCards.dealCard();
                        case 2 -> hand2[1] = myDeckOfCards.dealCard();
                        case 3 -> hand2[2] = myDeckOfCards.dealCard();
                        case 4 -> hand2[3] = myDeckOfCards.dealCard();
                        case 5 -> hand2[4] = myDeckOfCards.dealCard();
                    }
                    System.out.print("Which is the second card who do you want to change? ");
                    cardAnswer = input.nextInt();
                    switch (cardAnswer) {
                        case 1 -> hand2[0] = myDeckOfCards.dealCard();
                        case 2 -> hand2[1] = myDeckOfCards.dealCard();
                        case 3 -> hand2[2] = myDeckOfCards.dealCard();
                        case 4 -> hand2[3] = myDeckOfCards.dealCard();
                        case 5 -> hand2[4] = myDeckOfCards.dealCard();
                    }
                    System.out.print("Which is the third card who do you want to change? ");
                    cardAnswer = input.nextInt();
                    switch (cardAnswer) {
                        case 1 -> hand2[0] = myDeckOfCards.dealCard();
                        case 2 -> hand2[1] = myDeckOfCards.dealCard();
                        case 3 -> hand2[2] = myDeckOfCards.dealCard();
                        case 4 -> hand2[3] = myDeckOfCards.dealCard();
                        case 5 -> hand2[4] = myDeckOfCards.dealCard();
                    }
                }
            }
        }

        System.out.printf("%nYour hand:%n");
        for (Card card : hand2)
            System.out.printf("%-21s", card);

        int[][] frequency2 = DeckOfCards.cardsFrequency(hand2);
        result2 = DeckOfCards.handAnalysis(frequency2)[0];
        System.out.printf("%nThe result is: %s%n%n", result2);

        System.out.println("Computer's hand: ");
        for (Card card : hand)
            System.out.printf("%-21s", card);

        frequency = DeckOfCards.cardsFrequency(hand);
        result = DeckOfCards.handAnalysis(frequency)[0];

        System.out.printf("%nThe Computer result is: %s%n%n", result);

        String bestHand = DeckOfCards.playersHandAnalysis(hand, hand2);
        System.out.print(bestHand);
    }
}
