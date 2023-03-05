public class Human<T> extends Unit<T> implements Move, PickUpArtifacts, DoubleMove {

    public Human() {
        super();
    }

    public Human(T id) {
        super(id);
    }

    public Human(T id, String name, int health, int damage, int speed) {
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

    //Dependency Inversion Principle

    @Override
    public void DoubleMoveUp() {
        y += speed * 2;
    }

    @Override
    public void DoubleMoveDown() {
        y -= speed * 2;
    }

    @Override
    public void DoubleMoveRight() {
        x += speed * 2;
    }

    @Override
    public void DoubleMoveLeft() {
        x -= speed * 2;
    }

    @Override
    public void pickUpArtifact() {
        health += 10;
        damage += 10;
    }

}
