public class Car {
  
  int topSpeed;
  boolean running;
  
  Car (int topSpeed, boolean running) {
    this.running = running;
    this.topSpeed = topSpeed;
  }
  
  public boolean isRunning() {
    return running;
  }
  
  public int getTopSpeed(){
	  return topSpeed;
  }
}
