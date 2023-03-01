public class Animal {
    private String name;
    private int age;
    private String sound;

    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(this.sound);
    }

    public void getInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.sound);
    }

    private class Cat {
        private int lives;

        public Cat(String name, int age, String sound, int lives) {
            Animal.this.name = name;
            Animal.this.age = age;
            Animal.this.sound = sound;
            this.lives = lives;
        }

        public int getLives() {
            return lives;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "lives=" + lives +
                    '}';
        }
    }

    public Cat createCat(String name, int age, String sound, int lives) {
        return new Cat(name, age, sound, lives);
    }

    private class Dog {
        private String breed;

        public Dog(String name, int age, String sound, String breed) {
            Animal.this.name = name;
            Animal.this.age = age;
            Animal.this.sound = sound;
            this.breed = breed;
        }

        public String getBreed() {
            return breed;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "breed='" + breed + '\'' +
                    '}';
        }
    }
    public Dog createDog(String name, int age, String sound, String breed) {
        return new Dog(name, age, sound, breed);
    }
}
