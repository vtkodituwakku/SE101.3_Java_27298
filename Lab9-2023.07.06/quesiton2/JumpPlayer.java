public class JumpPlayer extends Movements {
  private boolean crouched;

  JumpPlayer(Directions direction, boolean crouched) {
    this.direction = direction;
    this.crouched = crouched;
    this.spaces = 5;
  }

  public void setCrouched(boolean crouched) {
    this.crouched = crouched;
  }

  public boolean getCrouched() {
    return crouched;
  }

  @Override
  public void movements() {
    if (crouched) {
      spaces = 2;
    }

    System.out.printf("[%s] : %s\n", direction, getLocation(spaces));
  }
}
