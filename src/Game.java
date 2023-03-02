import java.util.Scanner;

public class Game {
    static Human<String> human = new Human<String>("1", "Leonid", 100, 100, 10);
    static Surface surface = new Surface();
    static Artifact artifact = new Artifact("Hello", "111", Math.round(Math.random() * surface.getX()), Math.round(Math.random() * surface.getY()));

    public static void startMenu() {
        clearScreen();
        System.out.print("\n\t\t\t\t\tВыберите опцию: ");
        System.out.print("\n1. Изменить характеристики персонажа ");
        System.out.print("\n2. Изменить размер карты ");
        System.out.print("\n3. Изменить характеристики артефакта ");
        System.out.print("\n4. Играть! ");

        try (Scanner scanner = new Scanner(System.in)) {
            int selectOption = scanner.nextInt();
            switch (selectOption) {
                case 1:
                    editСharacteristics();
                    break;
                case 2:
                    editSurface();
                    break;
                case 3:
                    editArtifact();
                    break;
                case 4:
                    startGame();
                    break;
                default:
                    System.out.println("Досвидания!");
                    System.exit(0);
            }
        }
    }

    public static void editСharacteristics() {
        clearScreen();
        System.out.print("\n\t\t\t\tТекущие характеристики персонажа: ");
        System.out.print("\nИмя персонажа: " + human.getName());
        System.out.print("\nКол-во ХП: " + human.getHealth());
        System.out.print("\nКол-во ДПС: " + human.getDamage());
        System.out.print("\nСкорость передвижения: " + human.getSpeed());
        System.out.print("\nID: " + human.getId());
        System.out.print("\n\t\t\t\t\tВыберите опцию: ");
        System.out.print("\n1. Изменить имя ");
        System.out.print("\n2. Изменить кол-во ХП ");
        System.out.print("\n3. Изменить ДПС ");
        System.out.print("\n4. Изменить скорость передвижения ");
        System.out.print("\n5. Назад ");
        try (Scanner scanner = new Scanner(System.in)) {
            int selectOption = scanner.nextInt();
            switch (selectOption) {
                case 1:
                    refreshName(human);
                    break;
                case 2:
                    refreshHealth(human);
                    break;
                case 3:
                    refreshDamage(human);
                    break;
                case 4:
                    refreshSpeed(human);
                    break;
                case 5:
                    startMenu();
                    break;
                default:
                    System.out.println("Досвидания!");
                    System.exit(0);

            }
        }

    }

    public static void refreshName(Human<String> human) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nВведите имя: ");
            String name = scanner.nextLine();
            human.setName(name);
            startMenu();
        }
    }

    public static void refreshHealth(Human<String> human) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nВведите кол-во здоровья: ");
            int health = scanner.nextInt();
            human.setHealth(health);
            startMenu();
        }
    }

    public static void refreshDamage(Human<String> human) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nВведите кол-во урона: ");
            int damage = scanner.nextInt();
            human.setDamage(damage);
            startMenu();
        }
    }

    public static void refreshSpeed(Human<String> human) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nВведите значение скорости передвижения: ");
            int speed = scanner.nextInt();
            human.setSpeed(speed);
            startMenu();
        }
    }

    public static void editSurface() {
        clearScreen();
        System.out.println("Текущий размер по Х: " + surface.getX());
        System.out.println("Текущий размер по Y: " + surface.getY() + "\n");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите Х: ");
            int editedX = scanner.nextInt();
            System.out.print("Введите Y: ");
            int editedY = scanner.nextInt();
            surface.setX(editedX);
            surface.setY(editedY);
            startMenu();
        }
    }

    public static void editArtifact() {
        clearScreen();
        System.out.println("\t\t\t\t\tХарактеристики артефакта");
        System.out.println("Название артефакта: " + artifact.getName());
        System.out.println("Вид редкости: " + artifact.getRarity());
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nВведите название артефакта: ");
            String name = scanner.nextLine();
            System.out.print("Введите название редкости: ");
            String rarity = scanner.nextLine();
            artifact.setName(name);
            artifact.setRarity(rarity);
            startMenu();
        }
    }

    public static void startGame() {
        clearScreen();
        if(human.getX() <= 0) {
            System.out.println("Конец карты!!!");
            human.setX(0);
        }

        if(human.getY() > surface.getY()) {
            System.out.println("Конец карты!!!");
            human.setY(surface.getY());
        }

        if(human.getY() <= 0) {
            System.out.println("Конец карты!!!");
            human.setY(0);
        }

        if(human.getX() > surface.getX()) {
            System.out.println("Конец карты!!!");
            human.setX(surface.getX());
        }
        System.out.println("РАЗМЕР КАРТЫ: " + surface.getX() + " на " + surface.getY()
                + "\tАртефакт находится по координатам: " + artifact.getX() + ", " + artifact.getY() + "\n");
        System.out.println("Доступные команды: left, right, up, down, q, quit");
        System.out.println("\nТекущие координаты " + human.getName() + ":");
        System.out.println("x: " + human.getX());
        System.out.println("y: " + human.getY());
        if((human.getX() == artifact.getX()) && (human.getY() == artifact.getY())) { 
            human.pickUpArtifact();
            System.out.println("\t\t\t\tАртефакт подобран! \n\t\t\t\tНазвание артефакта: " + artifact.getName() + "\n\t\t\t\tРедкость артефакта: " + artifact.getRarity());
            artifact = null;
            artifact = new Artifact("Hello", "111", Math.round(Math.random() * surface.getX()), Math.round(Math.random() * surface.getY()));
        }
        try (Scanner scanner = new Scanner(System.in)) {
            String movement = scanner.nextLine();
            switch (movement) {
                case "up":
                    human.MoveUp();
                    startGame();
                    break;
                case "down":
                    human.MoveDown();
                    startGame();
                    break;
                case "left":
                    human.MoveLeft();
                    startGame();
                    break;
                case "right":
                    human.MoveRight();
                    startGame();
                    break;
                case "q":
                case "quit":
                    startMenu();
                    break;
                default:
                    System.out.println("Досвидания!");
                    System.exit(0);
            }
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Game.startMenu();
    }

}
