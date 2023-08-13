package HW04;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
//        2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
//        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
//        4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
//        5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
public abstract class Animal {
    protected String name;
    protected int runLimit;
    protected double jumpLimit;
    protected int swimLimit;

    public Animal(String name, int runLimit, double jumpLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.swimLimit = swimLimit;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " может пробежать " + distance + " метров");
        } else {
            System.out.println(name + " не может пробежать " + distance + " метров");
        }
    }

    public void jump(double height) {
        if (height <= jumpLimit) {
            System.out.println(name + " может прыгнуть на " + height + " метров");
        } else {
            System.out.println(name + " не может прыгнуть на " + height + " метров");
        }
    }

    public void swim(int distance) {
        if (swimLimit == 0) {
            System.out.println(name + " не может плавать");
        } else if (distance <= swimLimit) {
            System.out.println(name + " может проплыть " + distance + " метров");
        } else {
            System.out.println(name + " не может проплыть " + distance + " метров");
        }
    }
}

class Cat extends Animal {
    public Cat(String name, int runLimit, double jumpLimit) {
        super(name, runLimit, jumpLimit, 0);
    }
}

class Dog extends Animal {
    public Dog(String name, int runLimit, double jumpLimit, int swimLimit) {
        super(name, runLimit, jumpLimit, swimLimit);
    }
}

class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Барсик", 200, 2),
                new Cat("Мурка", 1000, 2),
                new Dog("Наполеон", 500, 0.5, 10),
                new Dog("Шарик", 600, 1, 15)
        };

        for (Animal animal : animals) {
            animal.run(550);
            animal.jump(1.5);
            animal.swim(12);
        }
    }
}


