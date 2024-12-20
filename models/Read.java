package models;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Read extends Note {
    
    public Read() {
        super("");
        
        System.out.println("\n<->->->->->->->->->->->->->->->->->->->->");
        System.out.println("Your Notes:");
        
        if(note_collection.isEmpty()){
            System.out.println("\nOh no! It looks like it's empty.");
        }

        for (Iterator<String> it = note_collection.iterator(); it.hasNext(); index++) {
            String the_note = it.next();
            System.out.println("\n["+ index +"] " + formattedDate + " at " + formattedTime + "\n" + "    " + the_note);
            
            try {
                FileWriter writer = new FileWriter("notes.txt", true);
                writer.write(the_note +"/"+ formattedDate + " " + formattedTime + "\n");
                writer.close();          
            } 
            
            catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            
        }
        System.out.println("<->->->->->->->->->->->->->->->->->->->->");
    }

}
