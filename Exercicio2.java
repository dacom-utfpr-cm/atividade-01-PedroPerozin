import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;




/*
author: pedroperozin
Faça uma thread que realize a leitura de 
um arquivo texto com frases e exiba as 
frases a cada 10 segundos.
*/

public class Exercicio2 extends Thread {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        
            FileReader arq = new FileReader("frases.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            
            new Thread( () -> {
                try{
                    while(lerArq.ready()){
                        System.out.println(lerArq.readLine());

                        try {
                            Thread.sleep(10000);
                            if(Thread.interrupted()){
                                throw new InterruptedException();
                            }
                        } catch (InterruptedException e){
                            for(int i = 0; i < 3; i++){
                                System.out.println("Interrompida");
                            }

                        }
                    }
                } catch (IOException e){

            }

        }).start();

    
    }
}

