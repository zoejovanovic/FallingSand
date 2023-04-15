import java.awt.*;

// Oil particles
public class Oil extends LiquidParticle {
    
  public Oil(){}
  
  public Oil(Grid grid, int x, int y){
            super(grid, x, y);      
  }  

  public Color color()
  {
      return new Color(51,51,51);
  }
}