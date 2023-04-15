import java.awt.*;

// Abstract base class for plant particles
public abstract class PlantParticle extends Particle {
    
  public PlantParticle(){}
    
  public PlantParticle(Grid grid, int x, int y){
            super(grid, x, y);      
  }  
    public void step()
    {
        if(grid.get(x, y-1).getClass().getName().equals("Water"))
            swapWith(x, y-1);
    }
  
}