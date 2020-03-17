import java.util.List;

/**
 * Faça uma thread que monitora um conjunto
 *  de threads e exiba quais threads
 * receberam sinais de interrupção. author: pedroperozin
 **/


public class Exercicio4 extends Thread {

  

   public static void main(String[] args) {

      Thread t1 = new Thread(Thread.currentThread().getName());
      Thread t2 = new Thread(Thread.currentThread().getName());

      t1.start();
      t2.start();


   }

}
