import java.awt.*;

// Stone particles
public class Stone extends FixedParticle {
    
  public Stone(){};
  
  public Stone(Grid grid, int x, int y){
            super(grid, x, y);      
  }  
  
  public Color color()
  {
      return new Color(100,100,100);
  }
}