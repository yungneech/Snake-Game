public class Location
{
	private int row;
	private int col;
	
	public Location(int r, int c)
	{
		row = r;
		col = c;
	}
	
	public int row()
	{
		return row;
	}
	
	public int col()
	{
		return col;
	}
	
	public boolean equals(Location other)
	{
		if(this.row() == other.row() && this.col() == other.col())
			return true;
		return false;
	}
	
	public int compareTo(Location other)
	{
		if(this.row() > other.row())
			return 1;
		else if(this.row() < other.row())
			return -1;
		else if(this.col() > other.row())
			return 1;
		else if(this.col() < other.col())
			return -1;
		else
			return 0;
	}
	
	public String toString()
	{
		return "Location (" + row() + "," + col() + ")";
	}
}
