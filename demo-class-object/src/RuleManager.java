public class RuleManager {

  // input -> Output
  public static boolean isPair(Card c1, Card c2) {
    return c1.getRank() == c2.getRank();
  }

  public static boolean isThreeOfKind(Card c1, Card c2, Card c3) {
    return c1.getRank() == c2.getRank() && c2.getRank() == c3.getRank();
  }

  // given 5 cards
  // 87887
  public static boolean isFullHouse(Card[] cards) {
    // array (counting)
return true;
  }

  // 6,7,8,9,10
  // A,K,Q,J,10
  public static boolean isStraight(Card[] cards) {
    return false;
  }
  // array

  public static boolean isFlush(Card[] cards) {
    if (cards.length != 5)
      return false;
    return cards[0].getSuit() == cards[1].getSuit()
        && cards[0].getSuit() == cards[2].getSuit()
        && cards[0].getSuit() == cards[3].getSuit()
        && cards[0].getSuit() == cards[4].getSuit();
  }

  public static void main(String[] args) {
    Card c1 = new Card(Card.TWO, Card.DIAMOND);
    Card c2 = new Card(Card.THREE, Card.DIAMOND);
    Card c3 = new Card(Card.FOUR, Card.DIAMOND);
    Card c4 = new Card(Card.JACK, Card.DIAMOND);
    Card c5 = new Card(Card.KING, Card.DIAMOND);
    System.out.println(RuleManager.isFlush(new Card[] {c1,c2,c3,c4,c5}));
  }
}
