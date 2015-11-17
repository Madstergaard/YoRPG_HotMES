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
	//adjust class_type accordingly	
	//can adjust stats here
    }

    public void normalize() {
	def += 2;
	atk -= .2;
    }

    public void specialize() {
	def -= 2;
	atk += .2;
    }
    
    //extended methods
    public void flashPotion(Character chr) {  //special alchemist method, any better name or ideas?
		
	str = (int)(str*1.5); //does no damage, improves stats permanently (or until normalize() is called
	def = (int)(def*1.5);	
    }

    public String about(){
	return "Alchemist - whether this man yield sorcerery or science no man doth know";
    }
}
