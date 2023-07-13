public class Main {
  public static void main(String[] args) {
    System.out.println("Regular player");
    RegularPlayer regularPlayer = new RegularPlayer(Directions.DOWN);
    regularPlayer.movements();
    regularPlayer.setDirection(Directions.UP);
    regularPlayer.movements();
    regularPlayer.setDirection(Directions.LEFT);
    regularPlayer.movements();
    regularPlayer.setDirection(Directions.RIGHT);
    regularPlayer.movements();

    System.out.println("Opposite player");
    OppositePlayer oppositePlayer = new OppositePlayer(Directions.RIGHT);
    oppositePlayer.movements();
    oppositePlayer.setDirection(Directions.LEFT);
    oppositePlayer.movements();
    oppositePlayer.setDirection(Directions.UP);
    oppositePlayer.movements();
    oppositePlayer.setDirection(Directions.DOWN);
    oppositePlayer.movements();

    System.out.println("Jump player");
    JumpPlayer jumpPlayer = new JumpPlayer(Directions.UP, true);
    jumpPlayer.movements();
    jumpPlayer.setDirection(Directions.DOWN);
    jumpPlayer.movements();
    jumpPlayer.setDirection(Directions.LEFT);
    jumpPlayer.movements();
    jumpPlayer.setDirection(Directions.RIGHT);
    jumpPlayer.movements();
  }
}
