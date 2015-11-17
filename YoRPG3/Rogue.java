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
	class_type = 4;  //adjust class_type accordingly		
	//can adjust stats here	
    }
    
    //extended methods
    public int steal(Character chr) {  //special rogue method
        int dmg; //damage
        dmg = (int)(str*atk) - chr.getDefense();
        chr.lowerHP(dmg);
        this.hp += (dmg/2);   //I wanted to steal an item, but those don't exist yet, so I'll steal hp instead
	return dmg;
	}
	
}
