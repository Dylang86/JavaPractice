public class Alien {
    private int health;
    private String name;
    private int damage;

    public Alien() {
        this.health = 0;
        this.name = "Not Set";
        this.damage = 0;
    }

    public Alien(int health, String name, int damage) {
        this.health = health;
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

}
