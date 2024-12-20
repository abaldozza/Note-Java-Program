package models;
import java.io.File;
public class Create extends Note{
   		
    public Create(){
        super("");
        System.out.print("\nEnter your note: ");
        String note = scan.nextLine();
                            
        note_collection.add(note);
        System.out.println("Your note was created ^_^");
        
        File file = new File("notes.txt");
        if(file.exists()){
            file.delete();
        }
    }
    
}
