import java.awt.*;

// Barrier particles
public class Barrier extends FixedParticle {
    
  public Barrier(){}
  
  public  Barrier(Grid grid, int x, int y){
            super(grid, x, y);      
  }
  
  public Color color()
  {
      return new Color(0,0,0);
  }
}