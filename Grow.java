
public class Grow {
	int n=160;

	private void animateStep()
	{
		Canvas.getCanvas().wait(50);
	}
	
	private void eraseObject(Object erased)
	{
		Canvas.getCanvas().erase(erased);
	}
	
	public void animateGrowingCircle()
	{
		Circle c = new Circle();
		c.makeVisible();
		int i;
		for(i=1; i<=n; i++)
		{
			c.changeSize(i);
			 animateStep();		
		}
		
		eraseObject( c );		
	}
	
	public void animateGrowingThenShrinkingSquare()
	{
        Square s = new Square();
        s.makeVisible();
        int i;
        for(i=1; i<=n; i++)
		{
			s.changeSize(i);
			 animateStep();		
		}
        eraseObject( s );
        
        for(i=n; i>=0; i--)
		{
			s.changeSize(i);
			 animateStep();		
		}
        eraseObject( s );
    }


}
