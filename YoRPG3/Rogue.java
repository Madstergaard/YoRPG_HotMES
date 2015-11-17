/*
Team HotMES
APCS pd9
HW30 - Ye Olde Role Playing Game, Expanded
2015-11-12
*/

//rogue subclass

public class Rogue extends Character {
    //add any extended attributes here
    
    //constructor
    public Rogue(String newName){
	super();
	name = newName;
	//adjust class_type accordingly		
	//can adjust stats here	
    }

    public void specialize() {
	def -= 2;
	atk += 2;
    }

    public void normalize() {
	def += 2;
	atk -= 2;
    }
    
    //extended methods
    public int steal(Character chr) {  //special rogue method
        int dmg; //damage
        dmg = (int)(str*atk) - chr.getDefense();
        chr.lowerHP(dmg);
        this.hp += (dmg/2);   //I wanted to steal an item, but those don't exist yet, so I'll steal hp instead
	return dmg;
	}

    public String about(){
	return "Rogue - this cunning vagrant's quick-blade knowst not honor";
    }
	
}
