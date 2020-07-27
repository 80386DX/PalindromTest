package palindrom;
import java.util.Scanner;

public class Palindrom {

   public static void main(String[] args) {
    
       String rec, kontra = "";
       Scanner skenjer = new Scanner(System.in);
       
       
       System.out.println("Unesite rec: ");
       rec = skenjer.nextLine().toLowerCase();
     
      for(int i = rec.length()-1; i>= 0 ; i--)
          kontra = kontra + rec.charAt(i);
       
            if(rec == null || rec.isEmpty()){
                return;
            }
            if(kontra.equals(rec)){
        System.out.println("Jeste palindrom");
            }
            else{
        System.out.println("Nije palindrom");
            }
    }
    
}
