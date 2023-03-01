public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Bob", 5, "meow");
        System.out.println(animal.createCat("Rex", 6, "meow", 2));
        animal.getInfo();

        System.out.println(animal.createDog("Dara", 5, "bau", "Kangal"));
        animal.getInfo();
    }
}