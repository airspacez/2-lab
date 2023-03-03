public abstract class GameObject {

    protected int x;
    protected int y;

    public GameObject() {
        this.x = 0;
        this.y = 0;
    }

    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}