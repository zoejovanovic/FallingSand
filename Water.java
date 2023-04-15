import java.awt.*;

// Water particles
public class Water extends LiquidParticle {
    
  public Water(){}
  
  public Water(Grid grid, int x, int y){
            super(grid, x, y);      
  }  

  public Color color()
  {
      return new Color(0,0,255);
  }
}