public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.catchCat(cat);
    }

    public static class Cat {
        public void sayHello() {
            System.out.println("Мяу!");
        }
    }

    public static class Dog {
        public void sayHello() {
            System.out.println("Гав!");
        }

        public void catchCat(Cat catchCat) {
            System.out.println("Кошка поймана");
            sayHello();
            catchCat.sayHello();
        }
    }
}
