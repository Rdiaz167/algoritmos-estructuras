package _01_queue_with_stacks;

import java.util.ArrayDeque;
import java.util.Deque;

// * Como Stack usaremos la Interfaz Deque, que proporciona las operaciones de una cola doblemente terminada,
// * permitiéndola usar como Pila o Cola (solo las operaciones de Pila están permitidas en este ejercicio).

public class QueueWithStacks {

  Deque<Integer> firstStack = new ArrayDeque<>();
  Deque<Integer> secondStack = new ArrayDeque<>();

  public void add(Integer value) {
    firstStack.push(value);
  }

  public Integer peek() {
    dumpElementsIntoSecondStack();
    return secondStack.peek();
  }

  public Integer remove() {
    dumpElementsIntoSecondStack();
    return secondStack.pop();
  }

  private void dumpElementsIntoSecondStack() {
    if(secondStack.isEmpty()) {
      while(!firstStack.isEmpty()) {
        secondStack.push(firstStack.pop());
      }
    }
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  public int size() {
    return firstStack.size() + secondStack.size();
  }      
}
