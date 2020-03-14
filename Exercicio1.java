import java.util.Random;

/*1. Faça um programa que inicie três threads e,
 cada thread, espere um tempo aleatório para terminar.
 author: pedroperozin
 */

public class Exercicio1 extends Thread {
    @Override
    public void run() {
        int time = new Random().nextInt(3000) + 4000;

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
        }
    }
     
    public static void main(final String[] args) {
        int i = 0;
        for(i = 0; i < 3; i++){
            new Exercicio1().start();
            System.out.println("Oi thread " + Thread.currentThread().getId());                
        }
    }


}