public class CardTest {
    public static void main(String[] args) {

        Card card1 = new Card();
        Card card2 = new Card();

        if (card1.isBiggerThan(card2)) {
          System.out.println(card1);
          System.out.println(card2);
        } else {
            System.out.println(card2);
            System.out.println(card1);
        }

        Deck deck = new Deck();
        System.out.println(deck);

        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.deal());

        System.out.println(deck);

    }
}
