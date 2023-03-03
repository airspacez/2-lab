public abstract class Unit<T> extends GameObject implements Interaction<T> {

    private T id;
    private String name;
    protected int health;
    protected int damage;
    protected int speed;
    protected int maxSpeed;

    public Unit() {
        super();
        id = null;
        health = 10;
        damage = 0;
        speed = 1;
    }

    public Unit(T id, String name, int health, int damage, int speed) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.speed = speed;
    }

    public T getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}