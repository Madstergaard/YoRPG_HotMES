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
        class_type = 1;  //adjust class_type accordingly
        //can adjust stats here	
    }
    
    //extended methods
    public int slash(Character chr) {  //special warrior method
	int dmg; //damage
	dmg = str - chr.getDefense();  //slash will use full strength, instead of mulitplying it by atk
        chr.lowerHP(dmg);
	return dmg;
	}
}
