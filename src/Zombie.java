public class Zombie<T> extends Unit<T> implements Move {

    public Zombie() {
        super();
    }

    public Zombie(T id) {
        super(id);
    }

    public Zombie(T id, String name, int health, int damage, int speed) {
        super(id, name, health, damage, speed);
    }

    @Override
    public void MoveUp() {
        y += speed;
    }

    @Override
    public void MoveDown() {
        y -= speed;
    }

    @Override
    public void MoveRight() {
        x += speed;

    }

    @Override
    public void MoveLeft() {
        x -= speed;
    }

}
