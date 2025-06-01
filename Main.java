import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO E - LIBRARY");
        Library el = new Library();
        while (true){
            System.out.println();
            System.out.println("************** Menu ******************");
            System.out.println("1. Insert Book");
            System.out.println("2. Display all books");
            System.out.println("3.Search with Book name");
            System.out.println("4.Search with Author name");
            System.out.println("5.Search with Genere name");
            System.out.println("6.Get the total books count");
            System.out.println("7.Remove Book");
            System.out.println("8. Update Book Name");
            System.out.println("9. Update Author Name");
            System.out.println("10. Update Genre");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("You need to add the book's Name,Author,Genre ");
                    System.out.println("Enter the book name ");
                    String name  = sc.nextLine();
                    System.out.println("Enter the Author name");
                    String author  = sc.nextLine();;
                    System.out.println("Enter the Genre of the book");
                    String genre = sc.nextLine();
                    el.add(name,author,genre);
                    System.out.println("Book added successfully");
                    break;
                case  2:
                    el.display();
                    break;
                case  3:
                    System.out.println("Enter the book name(need not to be full name");
                    String str = sc.nextLine();
                    el.searchwithbookname(str);
                    break;
                case  4:
                    System.out.println("Enter the Author name(need not to be full name");
                    String authorn = sc.nextLine();
                    el.searchwithAuthor(authorn);
                    break;
                case  5:
                    System.out.println("Enter the Genre(need not to be full name");
                    String gene = sc.nextLine();
                    el.searchwithGenre(gene);
                    break;
                case 6:
                    el.bookscount();
                    break;
                case 7:
                    System.out.println("Enter the serial no.");
                    int n = sc.nextInt();
                    el.removebook(n);
                    System.out.println("Book successfully removed");
                    break;
                case 8:
                    System.out.println("Enter the serial no.");
                    int a = sc.nextInt();
                    System.out.println("Enter the book name to be updated");
                    String bn = sc.nextLine();
                    el.updatebook(a,bn);
                    break;
                case 9:
                    System.out.println("Enter the serial no.");
                    int b = sc.nextInt();
                    System.out.println("Enter the Author name to be updated");
                    String bna = sc.nextLine();
                    el.updateAuthor(b,bna);
                    break;
                case 10:
                    System.out.println("Enter the serial no.");
                    int c = sc.nextInt();
                    System.out.println("Enter the Genre to be updated");
                    String bng = sc.nextLine();
                    el.updateGenre(c,bng);
                    break;
                case  11:
                    System.exit(0);
                    break;
                default:
                    System.out.println("You have entered an invalid choice.");
            }
        }
    }
}