package base;

public class Stack<T> extends BaseStructure<T> {

  public Stack() {
    super();
  }

  public Stack(int size) {
    super(size);
  }

  public void push(T elemento) {
    super.add(elemento);
  }

  public T peek() {
    if (this.isEmpty())
      return null;

    return this.items[count - 1];
  }

  public T pop() {
    if (this.isEmpty())
      return null;

    return this.items[--count];
  }
}

