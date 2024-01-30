import java.util.Scanner;

public class Start implements StartCat {
    Scanner scanner = new Scanner(System.in);

    Menu menu = new Menu(null, 0,0,0,0);

    @Override
    public void creatingCat() {
        System.out.print("Введите имя будущего кота: ");
        String name = scanner.nextLine();

        System.out.println("--------------------");

        System.out.println("Котенок по кличке " + name + " создан!");
    }

    @Override
    public void choice() {
        while (true){

            System.out.println("\nМеню:");
            System.out.println("--------------------");
            System.out.println("1. Состояние");
            System.out.println("2. Покормить кота");
            System.out.println("3. Поиграть с котом");
            System.out.println("4. Выйти из программы");
            System.out.print("Ответ: ");

            menu.age();

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    menu.menuCat();
                    break;
                case "2":
                    menu.feedCat();
                    break;
                case "3":
                    menu.playWithCat();
                    break;
                case "4":
                    System.out.println("Выход из программы...");
                    System.exit(0);
                    return;
                default:
                    System.out.println("Ошибка! Выберите из предоставленных действий (1, 2, 3, 4)");
            }

            menu.hungry();
            menu.play();
        }
    }
}
