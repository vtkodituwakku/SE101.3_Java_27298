public class OppositePlayer extends Movements {
  OppositePlayer(Directions direction) {
    this.direction = direction;
    this.spaces = 2;
  }

  @Override
  public void movements() {
    switch (direction) {
      case UP:
        direction = Directions.DOWN;
        break;
      case DOWN:
        direction = Directions.UP;
        break;
      case LEFT:
        direction = Directions.LEFT;
        break;
      case RIGHT:
        direction = Directions.RIGHT;
        break;
      default:
    }

    System.out.printf("[%s] : %s\n", direction, getLocation(spaces));
  }
}
