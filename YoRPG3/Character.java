/*
Team HotMES: Emma Vukelj, Shaumik Ashraf, Maddie Ostergaard
APCS pd9
HW30 - Ye Olde Role Playing Game, Expanded
2015-11-12
*/

//Charactar superclass

public abstract class Character {

    //attributes
    protected String name;
    protected int hp = 100;
    protected int str;
    protected int def;
    protected double atk;

	
    //constructor
    public Character() {
	//base stats
	hp = 150;
	str = 100;
	def = 50;
	atk = 0.8;
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

    public abstract void specialize();
    
    public abstract void normalize();
	
    public abstract String about();
	
}

