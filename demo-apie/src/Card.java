public class Card {
  private Color color;

  public Card(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  public static void main(String[] args) {
    Card c1 = new Card(Color.YELLOW);
    Card c2 = new Card(Color.YELLOW);
    Card c3 = new Card(Color.RED);

    System.out.println(c1.getColor());
    System.out.println(c1.getColor().name());

    System.out.println(c1.getColor() == c2.getColor());
  }
}
