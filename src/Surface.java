public class Surface {
    // Размерность карты
    private double x;
    private double y;

    public Surface() {
        this.x = 100;
        this.y = 100;
    }

    public Surface(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

}
