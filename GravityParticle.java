import java.awt.*;

// Abstract base class for gravity particles
public abstract class GravityParticle extends Particle {
    
  public GravityParticle(){}
    
  public GravityParticle(Grid grid, int x, int y){
            super(grid, x, y);      
  }  
  
  public void step() {
    
    if(grid.get(x, y-1).getClass().getName().equals("Air"))
        swapWith(x, y-1);
        
  }
}