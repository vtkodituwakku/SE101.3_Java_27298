abstract class Movements {
  protected Directions direction;
  protected int spaces;

  public abstract void movements();

  public void setDirection(Directions direction) {
    this.direction = direction;
  }

  public void setLocation(Directions direction) {
    this.direction = direction;
  }

  public String getLocation(int spaces) {
    switch (direction) {
      case UP:
        return "Moved up by " + spaces + " spaces";
      case DOWN:
        return "Moved down by " + spaces + " spaces";
      case RIGHT:
        return "Moved right by " + spaces + " spaces";
      case LEFT:
        return "Moved left by " + spaces + " spaces";
      default:
        return "No movement";
    }
  }
}
