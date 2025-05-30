public class SuperArrayList<T> {
  private T[] values;

  // constructor
  public SuperArrayList(T[] value) {
    this.values = values;
  }

  // get
  // public T[] getVales() {
  // return this;values;
  // }
  public T get(int index) {
    if (index < 0 || index >= this.values.length)
      return null;
    return this.values[index];
  }

  public int size() {
    return this.values.length;
  }

  // set


  // add
  public void add(T value) {
    T[] newValues = (T[]) new Object[this.values.length + 1];
    for (int i = 0; i < this.values.length; i++) {
      newValues[i] = this.values[i];
    }
    newValues[newValues.length - 1] = value;
    this.values = newValues;
  }

  public static void main(String[] args) {

  }
}
