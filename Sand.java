import java.awt.*;

// Sand particles
public class Sand extends GravityParticle {
    public Sand(){}
    public Sand(Grid grid, int x, int y){
            super(grid, x, y);      
    }
  
    public Color color()
    {
        return new Color(255,204,51);
    }
}