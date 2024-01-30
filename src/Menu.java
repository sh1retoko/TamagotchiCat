import java.util.Scanner;

public class Menu extends Cat implements MenuCat {
    Scanner scanner = new Scanner(System.in);

    public Menu(String name, double weight, int age, int hungry, int playfulness) {
        super(name, weight, age, hungry, playfulness);
    }

    @Override
    public void menuCat() {
        if (hungry >= 50) {
            System.out.println("\nСостояние: " + "\n\t- Возраст: " + age + "\n\t- Вес: " + weight +
                    "\n\t- Голод: не голоден (" + hungry + "%)" + "\n\t- Игривость: " + playfulness + "%");
        } else {
            System.out.println("\nСостояние: " + "\n\t- Возраст: " + age + "\n\t- Вес: " + weight +
                    "\n\t- Голод: нужно покормить (" + hungry + "%)" + "\n\t- Игривость: " + playfulness + "%");
        }
    }

    @Override
    public void feedCat() {
        System.out.println("\nМеню питания: ");
        System.out.println("--------------------");
        System.out.println("1. Рыба (+0.5 кг, +40 сытость)");
        System.out.println("2. Мясо (+0.3 кг, +30 сытость)");
        System.out.println("3. Молоко (+0.2 кг, +20 сытость)");
        System.out.println("--------------------");
        System.out.print("Ответ: ");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                if (hungry > 70) {
                    System.out.println("--------------------");
                    System.out.println("Кот не хочет есть!");
                    return;
                }
                weight += 0.50;
                hungry += 40;
                break;
            case "2":
                if (hungry > 70) {
                    System.out.println("--------------------");
                    System.out.println("Кот не хочет есть!");
                    return;
                }
                weight += 0.30;
                hungry += 30;
                break;
            case "3":
                if (hungry > 70) {
                    System.out.println("--------------------");
                    System.out.println("Кот не хочет есть!");
                    return;
                }
                weight += 0.20;
                hungry += 20;
                break;
            default:
                System.out.println("Ошибка! Выберите из предоставленных действий (1, 2, 3)");
        }
    }

    @Override
    public void playWithCat() {
        if (playfulness >= 100) {
            System.out.println("Кот не хочет играть");

        } else if (hungry <= 20 || hungry >= 90) {
            System.out.println("Кот наигрался или много съел");

        } else {
            playfulness += 50;
            hungry -= 30;
            weight -= 0.30;
        }
    }
}
