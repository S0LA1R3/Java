import java.util.Scanner;

public class CardGame
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

        int[][] frequency2 = DeckOfCards.cardsFrequency(hand2);
        result2 = DeckOfCards.handAnalysis(frequency2)[0];
        System.out.printf("%nThe result is: %s%n", result2);

        System.out.printf("%nDo you want to change some card? ");
        String answer = input.nextLine();

        if (answer.toUpperCase().equals("Y")) {
            System.out.print("How many cards do you want to change? ");
            int cardAnswer = input.nextInt();
            switch (cardAnswer) {
                case 1 -> {
                    System.out.print("Which is the card who you want to change? ");
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
                    for(int i = 0; i < 2; i++){
                        System.out.printf("Which is the %d° card who you want to change? ", i + 1);
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
                case 3 -> {
                    for(int i = 0; i < 3; i++){
                        System.out.printf("Which is the %d° card who you want to change? ", i + 1);
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
                case 4 -> {
                    for(int i = 0; i < 4; i++){
                        System.out.printf("Which is the %d° card who you want to change? ", i + 1);
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
                case 5 -> {
                    hand2[0] = myDeckOfCards.dealCard();
                    hand2[1] = myDeckOfCards.dealCard();
                    hand2[2] = myDeckOfCards.dealCard();
                    hand2[3] = myDeckOfCards.dealCard();
                    hand2[4] = myDeckOfCards.dealCard();
                }
            }
            System.out.printf("%nYour hand:%n");
            for (Card card : hand2)
                System.out.printf("%-21s", card);

            frequency2 = DeckOfCards.cardsFrequency(hand2);
            result2 = DeckOfCards.handAnalysis(frequency2)[0];
            System.out.printf("%nThe result is: %s%n%n", result2);
        }

        System.out.printf("%nComputer's hand: %n");
        for (Card card : hand)
            System.out.printf("%-21s", card);

        frequency = DeckOfCards.cardsFrequency(hand);
        result = DeckOfCards.handAnalysis(frequency)[0];

        System.out.printf("%nThe Computer result is: %s%n%n", result);

        String bestHand = DeckOfCards.playersHandAnalysis(hand, hand2);
        System.out.println(bestHand);
    }
}