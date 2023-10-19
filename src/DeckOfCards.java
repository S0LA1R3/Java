import java.security.SecureRandom;

public class DeckOfCards
{
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final SecureRandom random = new SecureRandom();

    public DeckOfCards()
    {
        String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
                "Queen", "King" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        for (int count = 0; count < deck.length; count++)
        {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }

    public void Shuffle()
    {
        currentCard = 0;

        for (int first = 0; first < deck.length; first++)
        {
            int second = random.nextInt(NUMBER_OF_CARDS);

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Card[] drawHand()
    {
        Card[] hand = new Card[5];
        for (int count = 0; count < 5; count++)
        {
            hand[count] = dealCard();
        }
        return hand;
    }

    public Card dealCard()
    {
        if (currentCard < deck.length)
        {
            return deck[currentCard++];
        }
        else
        {
            return null;
        }
    }

    public static int[][] cardsFrequency(Card[] hand)
    {
        int[][] frequency = new int[4][13];
        for (Card card : hand)
        {
            switch (card.getSuit())
            {
                case "Hearts" -> {
                    switch (card.getFace()) {
                        case "Ace" -> ++frequency[0][0];
                        case "Deuce" -> ++frequency[0][1];
                        case "Three" -> ++frequency[0][2];
                        case "Four" -> ++frequency[0][3];
                        case "Five" -> ++frequency[0][4];
                        case "Six" -> ++frequency[0][5];
                        case "Seven" -> ++frequency[0][6];
                        case "Eight" -> ++frequency[0][7];
                        case "Nine" -> ++frequency[0][8];
                        case "Ten" -> ++frequency[0][9];
                        case "Jack" -> ++frequency[0][10];
                        case "Queen" -> ++frequency[0][11];
                        case "King" -> ++frequency[0][12];
                    }
                }
                case "Diamonds" -> {
                    switch (card.getFace()) {
                        case "Ace" -> ++frequency[1][0];
                        case "Deuce" -> ++frequency[1][1];
                        case "Three" -> ++frequency[1][2];
                        case "Four" -> ++frequency[1][3];
                        case "Five" -> ++frequency[1][4];
                        case "Six" -> ++frequency[1][5];
                        case "Seven" -> ++frequency[1][6];
                        case "Eight" -> ++frequency[1][7];
                        case "Nine" -> ++frequency[1][8];
                        case "Ten" -> ++frequency[1][9];
                        case "Jack" -> ++frequency[1][10];
                        case "Queen" -> ++frequency[1][11];
                        case "King" -> ++frequency[1][12];
                    }
                }
                case "Clubs" -> {
                    switch (card.getFace()) {
                        case "Ace" -> ++frequency[2][0];
                        case "Deuce" -> ++frequency[2][1];
                        case "Three" -> ++frequency[2][2];
                        case "Four" -> ++frequency[2][3];
                        case "Five" -> ++frequency[2][4];
                        case "Six" -> ++frequency[2][5];
                        case "Seven" -> ++frequency[2][6];
                        case "Eight" -> ++frequency[2][7];
                        case "Nine" -> ++frequency[2][8];
                        case "Ten" -> ++frequency[2][9];
                        case "Jack" -> ++frequency[2][10];
                        case "Queen" -> ++frequency[2][11];
                        case "King" -> ++frequency[2][12];
                    }
                }
                case "Spades" -> {
                    switch (card.getFace()) {
                        case "Ace" -> ++frequency[3][0];
                        case "Deuce" -> ++frequency[3][1];
                        case "Three" -> ++frequency[3][2];
                        case "Four" -> ++frequency[3][3];
                        case "Five" -> ++frequency[3][4];
                        case "Six" -> ++frequency[3][5];
                        case "Seven" -> ++frequency[3][6];
                        case "Eight" -> ++frequency[3][7];
                        case "Nine" -> ++frequency[3][8];
                        case "Ten" -> ++frequency[3][9];
                        case "Jack" -> ++frequency[3][10];
                        case "Queen" -> ++frequency[3][11];
                        case "King" -> ++frequency[3][12];
                    }
                }
            }
        }
        return frequency;
    }

    public static int[] handFaceFrequency(int[][] frequency) {
        int[] faceFrequency = new int[13];
        for (int i = 0; i < frequency[0].length; ++i) {
            for (int[] suit : frequency) {
                if (suit[i] == 1)
                    ++faceFrequency[i];
            }
        }
        return faceFrequency;
    }

    public static String[] handAnalysis(int[][] cardsFrequency)
    {
        String[] result = new String[2];

        boolean couple = false, doubleCouple = false, crack = false, block = false, flush = false, straight = false,
        fullHouse = false;

        int coupleFrequency = 0;
        int[] faceFrequency = handFaceFrequency(cardsFrequency);

        for (int count = 0; count < faceFrequency.length; ++count) {
            int count1 = count + 1;
            int count2 = count + 2;
            int count3 = count + 3;
            int count4 = count + 4;

            if (count4 >= faceFrequency.length)
                count4 -= 13;
            if (count3 >= faceFrequency.length)
                count3 -= 13;
            if (count2 >= faceFrequency.length)
                count2 -= 13;
            if (count1 >= faceFrequency.length)
                count1 -= 13;

            if (faceFrequency[count] == 1 && faceFrequency[count1] == 1 && faceFrequency[count2] == 1 && faceFrequency[count3] == 1 && faceFrequency[count4] == 1)
                straight = true;
        }

        for (int face : faceFrequency) {
            if (face == 2)
                coupleFrequency++;
            else if (face == 3) {
                crack = true;
            }
            else if (face == 4) {
                block = true;
            }
        }

        if (coupleFrequency == 2)
            doubleCouple = true;
        else if (coupleFrequency == 1)
            couple = true;

        if (couple && crack)
            fullHouse = true;

        for (int[] suits : cardsFrequency)
            if (suits.length == 5)
                flush = true;

        if (couple && !doubleCouple && !fullHouse) {
            result[0] = "Couple";
            result[1] = "1";
        }
        else if (doubleCouple) {
            result[0] = "Double Couple";
            result[1] = "2";
        }
        else if (crack && !fullHouse) {
            result[0] = "Crack";
            result[1] = "3";
        }
        else if (block) {
            result[0] = "Block";
            result[1] = "4";
        }
        else if (flush) {
            result[0] = "Flush";
            result[1] = "5";
        }
        else if (straight) {
            result[0] = "Straight";
            result[1] = "6";
        }
        else if (fullHouse) {
            result[0] = "Full House";
            result[1] = "7";
        }
        else {
            result[0] = "NoNe";
            result[1] = "0";
        }

        return result;
    }

    public static String playersHandAnalysis(Card[] hand1, Card[] hand2) {
        int[][] frequency1 = cardsFrequency(hand1);
        int[][] frequency2 = cardsFrequency(hand2);
        int handResult1 = Integer.parseInt(handAnalysis(frequency1)[1]);
        int handResult2 = Integer.parseInt(handAnalysis(frequency2)[1]);

        if (handResult1 == handResult2)
            return "It's a tie";
        else if (handResult1 > handResult2)
            return "The Computer's hand wins!";
        else
            return "The player's hand wins!";
    }

    public Card[] reworkHand(Card[] hand) {
        int co = 0;
        int con = 0;
        Card[] newHand = new Card[5];

        if (!handAnalysis(cardsFrequency(hand))[0].equals("Straight") && !handAnalysis(cardsFrequency(hand))[0].equals("Full House"))
            for (Card card: hand) {
                newHand[con] = card;
                for (int i = 0 ; i < hand.length ; i++) {
                    if (card.getFace().equals(hand[i].getFace())) {
                        if (card.getSuit().equals(hand[i].getSuit())) {
                            continue;
                        }
                        co++;
                    }
                }
                if (co == 0)
                    newHand[con] = dealCard();
                co = 0;
                con++;
            }
            return newHand;
    }
}
