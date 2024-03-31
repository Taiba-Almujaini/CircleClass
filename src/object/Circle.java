package object;

public class Circle {

    private double circleRadius;
    private String circleColor;

    public Circle(double circleRadius, String circleColor) {
        this.circleRadius = circleRadius;
        this.circleColor = circleColor;
    }

    public double getCircleRadius() {
        return circleRadius;
    }

    public void setCircleRadius(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    public String getCircleColor() {
        return circleColor;
    }

    public void setCircleColor(String circleColor) {
        this.circleColor = circleColor;
    }
    public double calculateArea() {
        return Math.PI * circleRadius * circleRadius;
    }
}
