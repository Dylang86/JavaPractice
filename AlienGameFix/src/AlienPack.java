public class AlienPack  {
    private Alien[] aliens;

    public AlienPack(int numAliens) {
        aliens = new Alien[numAliens];
    }

    public void addAlien(Alien newAlien, int index) {
        aliens[index] = newAlien;
    }

    public Alien[] getAlien() {
        return aliens;
    }

    public int calculateDamage() {
        int damage = 0;
        for (int i = 0; i < aliens.length; i++) {
            if (aliens[i].getClass() == SnakeAlien.class) {
                damage += aliens[i].getDamage();
            } else if (aliens[i].getClass() == OgreAlien.class) {
                damage += aliens[i].getDamage();
            } else {
                damage += aliens[i].getDamage();
            }
        }
        return damage;
    }

    public static void main(String[] args) {
        SnakeAlien snakeOne = new SnakeAlien(100, "Snake Alien", 4);
        OgreAlien ogreOne = new OgreAlien(50, "Ogre Alien", 10);
        MarshmallowManAlien marshOne = new MarshmallowManAlien(250, "Marshmallow Man Alien", 2);
        AlienPack packOne = new AlienPack(3);
        packOne.addAlien(snakeOne, 0);
        packOne.addAlien(ogreOne, 1);
        packOne.addAlien(marshOne, 2);
        System.out.println(packOne.calculateDamage());

    }
}
