

/*3.Faça um programa que envia interrupções para
 as threads dos exercı́cios anteriores.
  As threads devem fazer o tratamento dessas
   interrupções e realizar uma finalização limpa.

 author: pedroperozin
 */



public class Exercicio3 extends Thread {

  @Override
  public void run(){
    Thread t1 = new Thread();
    t1.start();
    System.out.println("Interrupt");
  }
    public static void main(String[] args) throws InterruptedException {
      
      
      while(true){
        if(Thread.interrupted()){
          throw new InterruptedException();
        }
      }
      
    }
}


