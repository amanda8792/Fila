import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.Collection;

class Main {
  public static void main(String[] args) {
    
    Queue<String> fila = new LinkedList<>();

    fila.add("Juliana");
    fila.add("Pedro");
    fila.add("Carlos");
    fila.add("Larissa");
    fila.add("João");

    System.out.println("Fila:  "+ fila);

    //Navegando na fila e imprimindo seus elementos, mas esse método (poll) apaga os elementos da fila
    System.out.println("Os elementos da lista são: ");
    for (String cliente: fila){
      System.out.println(cliente);
    }

    //Retornando o 1° elemento da fila sem removê-lo
    System.out.println("1° Elemento da fila sem removê-lo: "+ fila.peek());
    System.out.println(fila);

    //Retornando o primeiro elemento da lista, removendo-o
    System.out.println("O 1° elemento da fila, removendo-o: " + fila.poll());
    System.out.println(fila);

    //Adicionando um elemento a fila 
    fila.add("Daniel");
    System.out.println("Fila com um elemento a mais: " + fila);

    //Retornando o tamanho da lista
    System.out.println("Quantidade de elementos da fila: " + fila.size());

    //Verificando se a fila está vazia
    boolean filaVazia = fila.isEmpty();
    System.out.println("A fila está vazia? " + filaVazia);

    //Verificando se um determinado elemento está na fila
    System.out.println(fila.contains("Carlos"));

    //O código acima vai imprimir "false" se o elemento Cassio não estiver na fila

  }
}