/*
Team HotMES
APCS pd9
HW30 - Ye Olde Role Playing Game, Expanded
2015-11-12
*/

//archer subclass

public class Archer extends Character {

    //add any extended attributes here
    
    //constructor
    public Archer(String newName){
	super();
	name = newName;
	class_type = 5;  //adjust class_type accordingly
		
	//can adjust stats here		
    }
    
    //extended methods
    public int snipe(Character chr) {  //special archer method	
	int dmg; //damage	
	dmg = (int)(str*atk) - (chr.getDefense()/3);  //Can't think of anything better...
	chr.lowerHP(dmg);
	return dmg;
	}

    public String about(){
	return "Archer - even a hundred leagues betwixt he and his foe can't falter this man's arrows";
    }
}
