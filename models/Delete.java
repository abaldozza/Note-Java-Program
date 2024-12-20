package models;
import java.io.File;
import java.util.*;

public class Delete extends Note {
    public Delete(){
        super("");
				
        	
		while(!validInput){
			try {
				System.out.println("\nEnter ID of note to delete");
				System.out.print("Enter x to cancel: ");
				input = scan.nextLine();
				if(input.equals("x")){
					System.out.println("\nCancelled.");
				}
				
				else if (Integer.parseInt(input) >= note_collection.size()){
					element_not_found();
				}
				
				else{
					int id = Integer.parseInt(input);
					((ArrayList<String>) note_collection).remove(id);
					System.out.println("Your note was removed ^_^");
					File file = new File("notes.txt");
					if(file.exists()){
						file.delete();
					}
				}
				validInput = true;
				
			} catch(NumberFormatException e) {
				invalid_input();
			}
		}
    }
}
