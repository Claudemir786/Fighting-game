import java.util.Scanner;

public class Main {
    
 public static void main(String[] args) {
     TextImage textImage = new TextImage();
     Scanner scanner = new Scanner(System.in);
     Mage mage =  new Mage("teste");
     mage.showStatus();
    System.out.println("Hello, and welcome to the most epic battle game you will ever see, enjoy and have fun");
     System.out.println("--------------------------------------------------------------------------------------");
     System.out.println("Are you ready to start the game? Press 1 for yes and 2 for no");
     int start = scanner.nextInt();
     scanner.nextLine();
     if(start == 1){
         System.out.println("How wonderful, so let's get started");
         System.out.println("one detail is that if you want to stop the game in the middle or exit just type 0 ok?");
         textImage.CaracterSelection();
     }else{
         System.out.println("what a shame you don't want to play, maybe next time");
     }
     scanner.close();

   
    
        
        
    }
}
