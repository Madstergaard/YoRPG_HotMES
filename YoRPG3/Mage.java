/*
Team HotMES
APCS pd9
HW30 - Ye Olde Role Playing Game, Expanded
2015-11-12
*/

//mage subclass

public class Mage extends Character {

    //add any extended attributes here
    //int mp; maybe?
	
	//constructor
    public Mage(String newName){
	super();
	name = newName;	
	//adjust class_type accordingly
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
    public int fireblast(Character chr) {  //special mage method
	int dmg; //damage
	dmg = 100;  //always do exactly 100 damage
	chr.lowerHP(dmg);
	return dmg;
    }

    public String about(){
	return "Mage - from this mans staff turns snakes and sprouts water";
    }
}
