public class Snap {
    private Deck deck;
    private int snaps;
    private int supersnaps;

    public Snap() {
        deck = new Deck();
        snaps = 0;
        supersnaps = 0;
    }

    public void play() {
        Card prevCard = null;
        Card currentCard;

        while ((currentCard = deck.deal()) != null) {
            if (prevCard != null) {
                System.out.println("Card 1 is: " + prevCard);
                System.out.println("Card 2 is: " + currentCard);

                if (prevCard.isSameRank(currentCard)) {
                    System.out.println("SNAP!!!");
                    snaps++;

                    if (prevCard.isSameColor(currentCard)) {
                        System.out.println("SUPERSNAP!!!");
                        supersnaps++;
                    }
                }
            }

            prevCard = currentCard;
        }

        System.out.println("\nNumber of Snaps: " + snaps);
        System.out.println("Number of Supersnaps: " + supersnaps);
    }

    public static void main(String[] args) {
        Snap snapGame = new Snap();
        snapGame.play();
    }
}
