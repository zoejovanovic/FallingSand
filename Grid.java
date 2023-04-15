// A grid of particles
public class Grid {
  // Instance Variables
  private Particle[][] world;
  private int width, height;

  // Main constructor
  public Grid(int width, int height) {
    // set width and height
    this.width = width;
    this.height = height;
    // initialize world
    world = new Particle[width][height];
    // fill with air particles
    // and add barriers along edges
    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        // set (x, y) to a new particle  
        if(x == 0 || y == 0 || x == width-1 || y == height-1)
            set(x, y, new Barrier(this, x, y));
            
        else
            set(x, y, new Air(this, x, y));
      }
    }
  }

  // Grid accessor and mutator
  public Particle get(int x, int y) {
    // Return the particle at (x, y)
    return world[x][y];
  }
  public void set(int x, int y, Particle value) {
    //set the particle at (x, y) to value
    world[x][y] = value;
  }

  // Utility method to swap particles
  public void swap(int x1, int y1, int x2, int y2) {
    // Move particles
    // swap the particles by calling set
    Particle temp = get(x1, y1);
    set(x1, y1, get(x2, y2));
    set(x2, y2, temp);
    // Pass new coords (do not edit)
    get(x1, y1).moveTo(x1,y1);
    get(x2, y2).moveTo(x2, y2);
  }
}