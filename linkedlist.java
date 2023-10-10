
import java.util.LinkedList;

public class linkedlist {
    
    public static void main(String[] args) {
        
            LinkedList<String> animals = new LinkedList<>();
            
            animals.add("Jam");
            animals.addFirst("Anal");
            animals.addLast("anals");
            animals.add(1,"lion");
            
            System.out.println("LinkedList:"+ animals);
            
            //animals.remove("Jam");
            //animals.remove("Anal");
            
              // System.out.println("LinkedList:"+ animals);
               
              boolean containsAnal = animals.contains("Anal");
              System.out.println(containsAnal);
              
              if(animals.contains("Anal")){
                  System.out.println("true");
                  
              }else{
                  System.out.println("False");
              }
               
              animals.size();
              System.out.println(animals.size());
    }
}
