/*
Team HotMES
APCS pd9
HW30 - Ye Olde Role Playing Game, Expanded
2015-11-12
*/

//alchemist subclass

public class Alchemist extends Character {

    //add any extended attributes here
    
    //constructor
    public Alchemist(String newName){
	super();
        name = newName;
        class_type = 6;  //adjust class_type accordingly	
	//can adjust stats here
    }
    
    //extended methods
    public void flashPotion(Character chr) {  //special alchemist method, any better name or ideas?
		
	str = (int)(str*1.5); //does no damage, improves stats permanently (or until normalize() is called
	def = (int)(def*1.5);	
    }
}
