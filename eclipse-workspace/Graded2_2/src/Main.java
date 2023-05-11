import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



// Create custom Exception 
// Create Books Pojo here
// Create User Pojo
class User{
    String name;
    int id;
    String email;
    String password;
    Map map;
    
    User(String name, int id, Map map){
        this.name = name;
        this.id = id;
        this.email = name + "@gmail.com";
        this.password = name + "123";
        this.map = map;
    }
}

class Book{
    String Name;
    String Author;
    String Description;
    int id;
    
    public Book(String Name, String Author, String Description, int id){
        this.Author = Author;
        this.Description = Description;
        this.Name = Name;
        this.id = id;
    }
}




class Result {
    static Scanner input = new Scanner(System.in);
    public static void run(User user, Book[] books) {
        String condition;
        do {
            System.out.println("************** MENU ***********");
            System.out.println("1. Print your books (new,favourite,completed)");
            System.out.println("2. Find book by bookId");
            System.out.println("0. Exit");
            System.out.println("Please enter your choice: ");
            int ch = input.nextInt();
            switch(ch) {
            case 1: System.out.println("New Books:");
            List<Book> list = (List) user.map.get("New");
            for (int i = 0; i < list.size(); i++) {
                Book book = list.get(i);
                System.out.println(book.Name);
            }
            
            System.out.println("Favourite Books:");
            list = (List) user.map.get("Favourite");
            for (int i = 0; i < list.size(); i++) {
                Book book = list.get(i);
                System.out.println(book.Name);
            }
            System.out.println("Completed Books:");
            list = (List) user.map.get("Completed");
            for (int i = 0; i < list.size(); i++) {
                Book book = list.get(i);
                System.out.println(book.Name);
            }
            break;
            case 2: System.out.println("Book List");
            for(Book book: books) {
                System.out.println(book.id + " " + book.Name);
            }
            System.out.println("Please enter the book id");
            int bookId = input.nextInt();
            try {
                Book book = books[bookId];
                System.out.println("Book Name : " + book.Name);
                System.out.println("Author Names : " + book.Author);
                System.out.println("Description : " + book.Description);
            }
            catch (Exception e) {
                System.out.println("Book Not Found!");
            }
            break;
            case 0:
                return;
            default:
                System.out.println("Invalid Option!");
            }
            
            System.out.println("Do you want to continue?");
            condition = input.next();
            
        } while (condition.equalsIgnoreCase("Yes"));
        
    }
    
    public static Book[] assignBooks(){
        Book[] books = new Book[5];
        books[0] = new Book("Ulysses", "James Joyce", "Ulusses by James Joyce", 0);
        books[1] = new Book("Don Quixote", "Miguel de Cervantes", "Don Quixote by Miguel de Cervantes", 1);
        books[2] = new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez", "One Hundred Years of Solitude by Gabriel Garcia Marquez", 2);
        books[3] = new Book("Hamlet", "William Shakespeare", "Hamlet by William Shakespeare", 3);
        books[4] = new Book("In Search of Lost Time", "Marcel Proust", "In Search of Lost Time by Marcel Proust", 4);
        return books;
    }
    
    public static User[] assignUsers(Book[] books){
        User[] users = new User[5];
        Map map = new HashMap<>();
        List<Book> list=new ArrayList<Book>();
        list.add(books[0]);
        //list.add(books[1]);
        //list.add(books[2]);
        //list.add(books[3]);
        //list.add(books[4]);
        map.put("New", list);
        list=new ArrayList<Book>();
        //list.add(books[0]);
        list.add(books[1]);
        list.add(books[2]);
        //list.add(books[3]);
        //list.add(books[4]);
        map.put("Favourite", list);
        list=new ArrayList<Book>();
        //list.add(books[0]);
        //list.add(books[1]);
        //list.add(books[2]);
        list.add(books[3]);
        //list.add(books[4]);
        map.put("Completed", list);
        list=new ArrayList<Book>();
        users[0] = new User("Adam Sandler", 0, map);
        map = new HashMap<>();
        
        //list.add(books[0]);
        //list.add(books[1]);
        list.add(books[2]);
        //list.add(books[3]);
        //list.add(books[4]);
        map.put("New", list);
        list=new ArrayList<Book>();
        list.add(books[0]);
        //list.add(books[1]);
        //list.add(books[2]);
        list.add(books[3]);
        //list.add(books[4]);
        map.put("Favourite", list);
        list=new ArrayList<Book>();
        //list.add(books[0]);
        //list.add(books[1]);
        //list.add(books[2]);
        //list.add(books[3]);
        list.add(books[4]);
        map.put("Completed", list);
        list=new ArrayList<Book>();
        users[1] = new User("Tom Hanks", 1, map);
        map = new HashMap<>();
        
        //list.add(books[0]);
        list.add(books[1]);
        //list.add(books[2]);
        //list.add(books[3]);
        //list.add(books[4]);
        map.put("New", list);
        list=new ArrayList<Book>();
        //list.add(books[0]);
        //list.add(books[1]);
        list.add(books[2]);
        //list.add(books[3]);
        //list.add(books[4]);
        map.put("Favourite", list);
        list=new ArrayList<Book>();
        //list.add(books[0]);
        //list.add(books[1]);
        //list.add(books[2]);
        list.add(books[3]);
        list.add(books[4]);
        map.put("Completed", list);
        list=new ArrayList<Book>();
        users[2] = new User("Tom Cruise", 2, map);
        map = new HashMap<>();
        
        list.add(books[0]);
        //list.add(books[1]);
        //list.add(books[2]);
        //list.add(books[3]);
        list.add(books[4]);
        map.put("New", list);
        list=new ArrayList<Book>();
        //list.add(books[0]);
        list.add(books[1]);
        //list.add(books[2]);
        //list.add(books[3]);
        //list.add(books[4]);
        map.put("Favourite", list);
        list=new ArrayList<Book>();
        //list.add(books[0]);
        list.add(books[1]);
        //list.add(books[2]);
        list.add(books[3]);
        //list.add(books[4]);
        map.put("Completed", list);
        list=new ArrayList<Book>();
        users[3] = new User("Angelina Jolie", 3, map);
        map = new HashMap<>();
        
        //list.add(books[0]);
        //list.add(books[1]);
        //list.add(books[2]);
        //list.add(books[3]);
        list.add(books[4]);
        map.put("New", list);
        list=new ArrayList<Book>();
        list.add(books[0]);
        //list.add(books[1]);
        //list.add(books[2]);
        //list.add(books[3]);
        //list.add(books[4]);
        map.put("Favourite", list);
        list=new ArrayList<Book>();
        //list.add(books[0]);
        //list.add(books[1]);
        //list.add(books[2]);
        list.add(books[3]);
        //list.add(books[4]);
        map.put("Completed", list);
        users[4] = new User("Scarlett Johansson", 4, map);
        
        return users;
    }
    // Complete the 'Main' function below.

    public static void Main() {
        Book[] books = assignBooks();
        User[] users = assignUsers(books);        
        
        System.out.println("Please enter your username:");
        String name = input.nextLine();
        Boolean flag = false;
        
        for(User user: users) {
            if(name.equalsIgnoreCase(user.name)) {
                flag = true;
                System.out.println("Welcome " + name +"!");
                run(user, books);
                System.out.println("Thank You!");
                break;
            }
        }
        
        if(!flag) {
            System.out.println("User Name is invalid. Please Login again");
        }

    }

}

public class Main {
    public static void main(String[] args) {

        Result.Main();

    }
}