public class ShuffleManager {

  public Card[] shuffle(Card[] cards) {
    if (cards.length == 0)
      return cards;
    // random (1-50), skip 0 and 51
    int index = new Random().nextInt(50) + 1; // (0 - 49) + 1 -> 1 - 50
    for () {

    }
  }

  public static void main(String[] args) {
    int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7};
    // random -> 4
    // number of cards = 2
    // [5, 6, 1, 2, 3, 4, 7]
  }
}
