
public class GrowTest {

	
		public static void main(String[] args) throws InterruptedException
		{
				
			Grow g = new Grow();
			 g.animateGrowingCircle();
		       Thread.sleep(2000);	     
		     g.animateGrowingThenShrinkingSquare();
		     Thread.sleep(2000);
		        System.exit(0);
		}

	}


