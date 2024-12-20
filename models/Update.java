package models;
import java.io.File;
import java.util.*;

public class Update extends Note {
    public Update(){
        super("");
		
		while(!validInput){
			try {
				System.out.println("\nEnter ID of note to update");
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
					System.out.print("\nEnter your new note: ");
					String newnote = scan.nextLine();
					((ArrayList<String>) note_collection).set(id, newnote);
					System.out.println("Your note was updated ^_^");

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
