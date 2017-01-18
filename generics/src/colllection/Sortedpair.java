package colllection;

public class Sortedpair<t extends Comparable<t>>{
	
	private final t first;
	
	private final t second;
	

	public Sortedpair(t left ,t right)
	{
		if(left.compareTo(right)<0)
		{
		first=left;
		second =right;
		}
		else {
			first=right;
			second=left;
		}
	}
	public t getfirst()
	{
		return first;
	}
  public t getsecond()
  {
	  return second;
  }
  
}

