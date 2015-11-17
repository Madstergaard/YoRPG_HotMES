/*
Team HotMES
APCS pd9
HW30 - Ye Olde Role Playing Game, Expanded
2015-11-12
*/

//warrior subclass

public class Warrior extends Character {
    //add any extended attributes here
    
    //constructor
    public Warrior(String newName){
        super();
	name = newName;
        //adjust class_type accordingly
        //can adjust stats here	
    }
    
    //extended methods
    public int slash(Character chr) {  //special warrior method
	int dmg; //damage
	dmg = str - chr.getDefense();  //slash will use full strength, instead of mulitplying it by atk
        chr.lowerHP(dmg);
	return dmg;
    }

    public void normalize() {
	hp = 100;
	def = 5;
	atk = .5;
    }

    public void specialize() {
	def -= 2;
	atk += .2;
    }

    public String about(){
	return 	"Warrior - the ever valiant sword-welder, whose conviction overshadows youth";
    }
}
