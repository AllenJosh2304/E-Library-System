import java.util.*;

public class Library {
    List<String> Name = new ArrayList<>();
    List<String> Author = new ArrayList<>();
    List<String> Genre = new ArrayList<>();

    void add(String n, String a, String g) {
        Name.add(n);
        Author.add(a);
        Genre.add(g);
    }

    void display() {
        if (Name.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        
        for (int i = 0; i < Name.size(); i++) {
            System.out.println("Name of the book: " + Name.get(i) + "Author: " + Author.get(i) + "Genre: " + Genre.get(i));
        }
        System.out.println("Ens of the list");
    }

    void searchwithbookname(String a) {
        String str = a.replace(" ", "");
        str = str.toLowerCase();
        boolean check = false;
        for (int i = 0; i < Name.size(); i++) {
            String bookname = Name.get(i);
            bookname = bookname.replace(" ", "");
            bookname = bookname.toLowerCase();
            if (bookname.contains(str)) {
                check = true;
                System.out.println("No." + i + ": " + Name.get(i));
            }


        }
        if(!check){
            System.out.println("Sry no books available in the given name");
        }
    }

    void searchwithAuthor(String a) {
        String str = a.replace(" ", "");
        str = str.toLowerCase();
        boolean check = false;
        for (int i = 0; i < Author.size(); i++) {
            String bookname = Author.get(i);
            bookname = bookname.replace(" ", "");
            bookname = bookname.toLowerCase();
            if (bookname.contains(str)) {
                check = true;
                System.out.println("No. " + i + " : " + Name.get(i));
            }

        }
        if(!check){
            System.out.println("Sry no books available in the given name");
        }
    }

    void searchwithGenre(String a) {
        String str = a.replace(" ", "");
        str = str.toLowerCase();
        boolean check = false;
        for (int i = 0; i < Genre.size(); i++) {
            String bookname = Genre.get(i);
            bookname = bookname.replace(" ", "");
            bookname = bookname.toLowerCase();
            if (bookname.contains(str)) {
                check = true;
                System.out.println("No." + i + ": " + Name.get(i));
            }
        }
        if(!check){
            System.out.println("Sry no books available in the given name");
        }
    }

    void removebook(int a){
        if(a>=Name.size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        Name.remove(a);
        Author.remove(a);
        Genre.remove(a);
    }

    void bookscount(){
        System.out.println("Total no. books: "+ Name.size());
    }

    void updatebook(int n,String name){
        Name.set(n,name);
        System.out.println("Updated successfully");
    }
    void updateAuthor(int n,String name){
        Author.set(n,name);
        System.out.println("Updated successfully");
    }
    void updateGenre(int n,String name){
        Genre.set(n,name);
        System.out.println("Updated successfully");
    }

}
