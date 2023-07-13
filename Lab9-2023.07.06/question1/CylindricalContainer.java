public class CylindricalContainer extends Container {
  private double height, radius;
  final double pi = 3.14159;

  CylindricalContainer(double height, double radius) {
    this.height = height;
    this.radius = radius;
  }

  @Override
  public double volume() {
    return (pi * radius * radius * height);
  }
}
