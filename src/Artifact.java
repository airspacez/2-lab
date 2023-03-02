public class Artifact extends GameObject {

    private String name;
    private String rarity;

    public Artifact() {
        this.name = "Stone with eternity time";
        this.rarity = "Rare";
        this.x = 5;
        this.y = 5;
    }

    public Artifact(String name) {
        this.name = name;
        this.rarity = "Rare";
        this.x = 5;
        this.y = 5;
    }

    public Artifact(String name, String rarity) {
        this.name = name;
        this.rarity = rarity;
        this.x = 5;
        this.y = 5;
    }

    public Artifact(String name, String rarity, double x, double y) {
        this.name = name;
        this.rarity = rarity;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
}
