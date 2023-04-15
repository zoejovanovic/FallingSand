import java.awt.*;

// Grass particles
public class Grass extends PlantParticle {
    public Grass(){}
    public Grass(Grid grid, int x, int y){
            super(grid, x, y);      
    }
  
    public Color color()
    {
        return new Color(0,204,0);
    }
  
    
}