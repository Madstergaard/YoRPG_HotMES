/*
Team HotMES
APCS pd9
HW30 - Ye Olde Role Playing Game, Expanded
2015-11-12
*/

//monster subclass

public class Monster extends Character {
    //add any extended attributes here
    
    //constructor
    public Monster(String newName){
	super();
	name = newName;	
	class_type = 2;  //adjust class_type accordingly	
	//can adjust stats here	
    }
    
    //extended methods
    public void bite(Character chr) {  //special monster method
	int dmg; //damage
	dmg = (int)(str*atk) - (chr.getDefense()/2);  //bite will reduce targets def by half
	chr.lowerHP(dmg);	
	}

    public String about(){
	return 	"Monster - 'ere in its heart has light long since been begotten, if 'ere lies any heart at all";
    }
    
}
