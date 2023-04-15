import java.awt.*;
import java.util.*;

// Main driver class
// Runs the FallingParticles simulation
public class Simulator
{
  // Main method
  // Creates and runs a new simulator
  public static void main(String[] args) {
    Simulator sim = new Simulator(100, 100);
    sim.run();
  }
  
  // Instance variables
  private Grid grid;
  private ParticleDisplay display;
  private ArrayList<String> classes;
  private int width, height;
  
  public Simulator(int width, int height) {
    // Initialize instance variables
    this.width = width;
    this.height = height;
    // Add new particle types here
    // Names must match class names EXACTLY
    classes = new ArrayList<String>();
    classes.add("Air");
    classes.add("Stone");
    classes.add("Sand");
    classes.add("Water");
    classes.add("Dirt");
    classes.add("Grass");
    classes.add("Oil");

    // Create ParticleDisplay
    display = new ParticleDisplay("Falling Sand", height, width, classes);
    // Create grid
    grid = new Grid(width, height);
  }
  
  // Called when the user clicks on a location using the given tool
  private void locationClicked(int x, int y, Class tool) {
    // Barriers are permanent
    if (grid.get(x,y) instanceof Barrier) {
      return;
    }
    // Add special cases here, if any

    // Set particle at x,y to new instance of tool
    // Do not modify
    else {
      try {
        grid.set(x, y, (Particle) tool.newInstance());
        grid.get(x,y).initialize(grid, x, y);
      }
      catch (Exception e) {
        System.out.println("Error during instantiation");
        System.out.println(e);
      }
    }
  }

  // Set display colors based on grid
  public void updateDisplay()
  {
    for(int x = 0; x < width; x++)
    {
        for(int y = 0; y < height; y++)
            display.setColor(x, y, grid.get(x,y).color());
    }
  }

  // Called repeatedly.
  // Causes one random particle to maybe do something.
  public void step() 
  {
    int x = (int) (width * Math.random());
    int y = (int) (height * Math.random());
    grid.get(x,y).step();
  }
  
  //do not modify
  public void run() {
    while (true) {
      for (int i = 0; i < display.getSpeed(); i++) {
        step();
      }
      updateDisplay();
      display.repaint();
      display.pause(1);  //wait for redrawing and for mouse
      int[] mouseLoc = display.getMouseLocation();
      if (mouseLoc != null)  {//test if mouse clicked
        try {
          locationClicked(mouseLoc[1], height - (mouseLoc[0]+1), Class.forName(classes.get(display.getTool())));
        }
        catch (Exception e) {
          System.out.println("You added an invalid class name.");
          System.out.println(e);
        }
      }
    }
  }
}
