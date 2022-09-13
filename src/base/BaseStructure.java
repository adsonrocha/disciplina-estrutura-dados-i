package base;

public class BaseStructure<T> {

  protected T[] items;
  protected int count;

  public BaseStructure(int size) {
    this.items = (T[]) new Object[size];
    this.count = 0;
  }

  public BaseStructure() {
    this(10);
  }

  public boolean isEmpty() {
    return this.count == 0;
  }

  protected boolean add(T item) {
    this.enlarge();
    if (this.count < this.items.length) {
      this.items[this.count] = item;
      this.count++;
      return true;
    }
    return false;
  }

  protected boolean add(int position, T item) {
    if (position < 0 || position > count) {
      throw new IllegalArgumentException("invalid position");
    }
    this.enlarge();

    //move items
    for (int i = this.count - 1; i >= position; i--) {
      this.items[i + 1] = this.items[i];
    }
    this.items[position] = item;
    this.count++;

    return true;
  }

  protected void remove(int position) {
    if (!(position >= 0 && position < count)) {
      throw new IllegalArgumentException("invalid position");
    }
    for (int i = position; i < count - 1; i++) {
      items[i] = items[i + 1];
    }
    count--;
  }

  private void enlarge() {
    if (this.count == this.items.length) {
      T[] newItems = (T[]) new Object[this.items.length * 2];
      for (int i = 0; i < this.items.length; i++) {
        newItems[i] = this.items[i];
      }
      this.items = newItems;
    }
  }

  public int size() {
    return this.count;
  }

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append("[");

    for (int i = 0; i < this.count - 1; i++)
      s.append(this.items[i]).append(", ");

    if (this.count > 0)
      s.append(this.items[this.count - 1]);

    s.append("]");

    return s.toString();
  }
}
