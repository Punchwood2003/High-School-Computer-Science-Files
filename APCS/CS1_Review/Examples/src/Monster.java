public class Monster
{
	private String type;
	//private int scareFactor;
	private double size;

	public Monster(String t, int sf, double s)
	{
		type = t;		
		//scareFactor = sf;
		size = s;
	}
	@Override
	public boolean equals(Object temp2) {
		Monster temp = (Monster) temp2;
		return this.size == temp.size && 
			   this.type.equals(temp.type);
	}
}