package exercicios;

import base.Stack;

public class Ex0 {
  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>(10);
    s.push(5);
    s.push(8);

    System.out.println(s.toString());
    System.out.println(s.peek());
    System.out.println(s.size());

    s.pop();

    System.out.println(s.toString());
    System.out.println(s.size());
  }
}
