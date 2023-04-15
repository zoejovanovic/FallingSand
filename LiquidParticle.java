import java.util.*;
import java.awt.*;

// Abstract base class for liqudid particles
public abstract class LiquidParticle extends Particle {
    
  public LiquidParticle(){}
  
  public LiquidParticle(Grid grid, int x, int y){
            super(grid, x, y);      
  }  
  // Randomly move left, right, or down
  public void step() {
    // randomly swap with a particle to the
    // left, right, or down, if it is Air
    int dir = (int) (3 * Math.random());
    if(dir == 0) //left
        trySwap(x-1, y);
    
    else if(dir == 1) // right
        trySwap(x+1, y);
    
    else if(dir == 2) // down
        trySwap(x, y-1);
  }

  // Note: you may want to write a trySwap() helper method here
  // to make your code more concise, but you don't need to.
  private void trySwap(int x2, int y2)
  {
      if(grid.get(x2, y2).getClass().getName().equals("Air"))
            swapWith(x2, y2);
  }
}