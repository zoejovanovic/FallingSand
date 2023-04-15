import java.awt.*;

// Air particles
public class Air extends FixedParticle {
    
  public Air(){}
  
  public Air(Grid grid, int x, int y){
            super(grid, x, y);      
  }  
  
  public Color color()
  {
      return new Color(200,200,255);
  }
}