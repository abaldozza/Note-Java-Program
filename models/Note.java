package models;
import java.util.*;   
import java.time.format.DateTimeFormatter;
import java.time.*;

class Note {
    private String note;

    Note(String note){
		this.note = note;
	}

    public String toString(){
        return note;
    }
    
    Scanner scan = new Scanner(System.in);
    boolean validInput = false;
    String input;
    int index = 0;
    
    static ArrayList<String> note_collection = new ArrayList<String>();
    
    LocalDate date = LocalDate.now(); 
    LocalTime time = LocalTime.now(); 
    DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
    DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("HH:mm:ss"); 
                                
    String formattedDate = date.format(dateformat); 
    String formattedTime = time.format(timeformat);
    
    protected void element_not_found(){
        System.out.println("\nSorry, but that note doesn't exist.");
    }

    protected void invalid_input(){
        System.out.println("\nInvalid input");
    }
  
}
