public abstract class GameObject {
    protected double x;
    protected double y;

    public GameObject() {
        this.x = 50;
        this.y = 50;
    }

    public GameObject(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }
}