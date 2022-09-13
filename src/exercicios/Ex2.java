package exercicios;

import base.Stack;

/**
 * Escreva um programa que utilize uma pilha para verificar se expressões aritméticas estão
 * com a parentização correta. O programa deve verificar expressões para ver se cada “abre parênteses”
 * tem um “fecha parênteses” correspondente. Ex.:
 * Correto: (( )) - (( )( )) - ( )( )
 * Incorreto: )( - (( )( - ))((
 */

public class Ex2 {
  public static void main(String[] args) {
    String input1 = "(( )) - (( )( )) - ( )( )";
    System.out.println(isValidExpression(input1));

    String input2 = ")( - (( )( - ))((";
    System.out.println(isValidExpression(input2));
  }

  public static boolean isValidExpression(String input) {
    Stack<String> stack = new Stack<>();

    for (String s : input.split("")) {
      String lastOpen = stack.peek();
//      System.out.println(lastOpen + " " + s);
      if (s.equals("("))
        stack.push(s);
      else if (s.equals(")") && lastOpen != null && lastOpen.equals("("))
        stack.pop();
    }

    return stack.size() <= 0;
  }
}
