import java.util.Scanner;

public class Practicum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library library = new Library();

        while (true) {
            printMenu();

            int command = scanner.nextInt();
            if (command == 0) {
                System.out.println("Выход.");
                break;
            } else if (command == 1) {
                library.addBook();
            } else if (command == 2) {
                library.findByAuthor();
            } else if (command == 3) {
                library.printAll();
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Добавить книгу.");
        System.out.println("2 - Найти книги автора.");
        System.out.println("3 - Увидеть список книг.");
        System.out.println("0 - Выход.");
    }

}
