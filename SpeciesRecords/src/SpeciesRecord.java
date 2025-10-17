public class SpeciesRecord {
    public static void main(String[] args) {
        AnimalSpecies panda = new AnimalSpecies("Panda", 10000, 73);
        System.out.println(panda.toString());

        AnimalSpecies monkey = new AnimalSpecies("Monkey", 12124, -1);
        System.out.println(monkey.toString());

        System.out.println(monkey.equals(panda));

        AnimalSpecies monkey2 = new AnimalSpecies("Monkey", 12124, -1);
        System.out.println(monkey2.equals(monkey));

        AnimalSpecies bass = new AnimalSpecies();
        System.out.println(bass.toString());
        bass.setName("Bass");
        bass.setPopulation(123329032);
        bass.setGrowthRate(90.3);
        System.out.println(bass.toString());

    }
}