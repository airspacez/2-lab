public class Artifact extends GameObject {

    private String name;
    private String rarity;

    public Artifact() {
        name = "stone";
        rarity = "normal";
        x = 5;
        y = 5;
    }

    public Artifact(String name) {
        this.name = name;
        rarity = "normal";
        x = 5;
        y = 5;
    }

    public Artifact(String name, String rarity) {
        this.name = name;
        this.rarity = rarity;
        x = 5;
        y = 5;
    }

    public Artifact(int x, int y) {
        name = "stone";
        rarity = "normal";
        this.x = x;
        this.y = y;
    }

    public Artifact(String name, String rarity, int x, int y) {
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
