/*
Team HotMES: Emma Vukelj, Shaumik Ashraf, Maddie Ostergaard
APCS pd9
HW30 - Ye Olde Role Playing Game, Expanded
2015-11-12
*/

//Charactar superclass

public class Character {

    //attributes
    protected String name;
    protected int hp = 100;
    protected int str;
    protected int def;
    protected double atk;
    protected final static String[] descriptions = {   //desriptions for about() method
		//I'm so glad I'm taking Shakespearian Literature
		"Unknown - a charactar who hath a tale yet untold and potential yet unseen",
		"Warrior - the ever valiant sword-welder, whose conviction overshadows youth",
		"Monster - 'ere in its heart has light long since been begotten, if 'ere lies any heart at all",
		"Mage - from this mans staff turns snakes and sprouts water",
		"Rogue - this cunning vagrant's quick-blade knowst not honor",
		"Archer - even a hundred leagues betwixt he and his foe can't falter this man's arrows",
		"Alchemist - whether this man yield sorcerery or science no man doth know",
		"And as future come hither so shalt more classes come anew..."
		};
    protected int class_type;    //this variable will hold index number of description Array of proper class (indicates subclass)
	
	
    //constructor
    public Character() {
	//base stats
	hp = 150;
	str = 100;
	def = 50;
	atk = 0.8;
		
	//assume no subclass, so unknown description index
	class_type = 0;
    }
	
    //other methods
    public boolean isAlive() {
        return( hp > 0 );
    }

    public int getDefense() {
        return( def );
    }

    public String getName(){
        return( name );
    }
    
    public int lowerHP(int damage) {
	hp -= damage;
        if( hp<0 ) {  //prevent hp from being negative
            hp = 0;
        }
        return(hp);  //return new hp, not necessary but may have uses
    }

    public int attack(Character chr) {
        int dmg;  //damage of attack
	dmg = (int)(this.str * this.atk) - chr.getDefense();
	chr.lowerHP(dmg);
	return dmg;
    }

    public void specialize(){
	//any other specialize stat
        def -= 10;
        atk += .2;
    }
    
    public void normalize(){
        //revert to base stats
	def = 50;
        atk = 0.8;
    }
	
	public String about() {
	    return( descriptions[class_type] );
	}
	
}

