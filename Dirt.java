import java.awt.*;

// Dirt particles
public class Dirt extends GravityParticle {
    public Dirt(){}
    public Dirt(Grid grid, int x, int y){
            super(grid, x, y);      
    }

    public Color color()
    {
        return new Color(153,102,0);
    }
}