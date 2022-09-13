package exercicios;

import base.Stack;

import java.util.ArrayList;
import java.util.List;

/**
 * Escreva um algoritmo, usando uma Pilha, que inverte as letras de cada palavra de um texto,
 * preservando a ordem das palavras. Por exemplo, dado o texto:
 * ESTE EXERCICIO E MUITO FACIL.
 * A saída deve ser:
 * ETSE OICICREXE E OTIUM LICAF
 */

public class Ex1 {
  public static void main(String[] args) {
    String input = "ESTE EXERCICIO E MUITO FACIL";
    String[] words = input.split(" ");

    List<Stack<String>> stacks = new ArrayList<>();

    for (String word : words) {
      String[] letters = word.split("");
//      System.out.println(Arrays.toString(letters));

      Stack<String> s = new Stack<>();
      for (String letter : letters) {
        s.push(letter);
      }
      stacks.add(s);
    }

    for (Stack<String> s : stacks) {
//      System.out.println(s.toString() + ": " + s.size());
      int size = s.size();
      for (int i = 0; i < size; i++) {
        System.out.print(s.pop());
      }
      System.out.print(" ");
    }
  }
}
