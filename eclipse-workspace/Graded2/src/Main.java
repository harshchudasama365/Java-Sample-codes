import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.*;
import java.util.ArrayList;

class Books {
    String[] bookName = { "Ulysses", "Don Quixote", "One Hundred Years of Solitude", "Hamlet",
            "In Search of Lost Time" };
    String[] authorName = { "James Joyce", "Miguel de Cervantes", "Gabriel Garcia Marquez", "William Shakespeare",
            "Marcel Prous" };
    String[] description = { "Ulysses by James Joyce", "Don Quixote by Miguel de Cervantes",
            "One Hundred Years of Solitude by Gabriel Garcia Marquez", "Hamlet by William Shakespeare",
            "In Search of Lost Time by Marcel Prous" };
    Integer[] bookId = { 0, 1, 2, 3, 4};

}

class variables {
    public static String inputuser;
    public static String inputbook;
    public static String outputuser;
    public static Scanner sc = new Scanner(System.in);
    public static String conti="yes";
}

class User {
    String[] userName = { "Adam Sandler", "Tom Hanks", "Tom Cruise", "Angelina Jolie", "Scarlett Johansson" };
    private String userId;
    private String emailId;
    private String password;
    Map<String, ArrayList<Books>> books = new HashMap<String, ArrayList<Books>>();
    Map<String, HashMap<String, String>> userdetails = new HashMap<String, HashMap<String, String>>();

    public void setdetails(String user) {
        HashMap<String, String> detail = new HashMap<String, String>();
        switch (user.toLowerCase()) {
        case "adam sandler":
            detail.put("New Books:", "Ulysses");
            detail.put("Favourite Books:", "Don Quixote,One Hundred Years of Solitude");
            detail.put("Completed Books:", "Hamlet");
            break;
        case "tom hanks":
            detail.put("New Books:", "One Hundred Years of Solitude");
            detail.put("Favourite Books:", "Ulysses,Hamlet");
            detail.put("Completed Books:", "In Search of Lost Time");
            break;
        case "tom cruise":
            detail.put("New Books:", "Don Quixote");
            detail.put("Favourite Books:", "One Hundred Years of Solitude");
            detail.put("Completed Books:", "Hamlet,In Search of Lost Time");
            break;
        case "angelina jolie":
            detail.put("New Books:", "Ulysses,In Search of Lost Time");
            detail.put("Favourite Books:", "Don Quixote");
            detail.put("Completed Books:", "Don Quixote,Hamlet");
            break;
        case "scarlett johansson":
            detail.put("New Books:", "In Search of Lost Time");
            detail.put("Favourite Books:", "Ulysses");
            detail.put("Completed Books:", "Hamlet");
            break;
        }

        userdetails.put(user, detail);

    }

}


class MagicOfBooks2 {

    User user = new User();
    Books Books_obj = new Books();

    // will check for user name is it allowed or not
    public boolean checkUser() {
        int count = 0;

        for (String s : user.userName) {

            if (s.toLowerCase().equals(variables.inputuser.toLowerCase())) {
                variables.outputuser = s;
                count++;
            }

        }
        if (count == 0) {
            return false;
        } else {
            return true;
        }

    }

    // to select option
    public void opt() {
        try {
            System.out.println("************** MENU **************");
            System.out.println("1. Print your books (new,favourite,completed)");
            System.out.println("2. Find book by bookId");
            System.out.println("0. Exit");
            System.out.println("Please enter your choice:");

            int opt = Integer.parseInt(variables.sc.nextLine());
            // if option is not from 1-3
            
            switch (opt) {

            case 1:
                info();
                this.torun();
                break;
            case 2:
//                findbookid();
                findBook();
                this.torun();
                break; 
            case 0:
            	System.out.println("Thank You !");
            	System.exit(1);
                break;
            default:
            	System.out.println("Invalid Option !");
            	System.out.println("Thank You !");
            	System.exit(1);
            }
           
        } catch (Exception e) {
            System.out.println("Invalid Option !");
            System.exit(1);

        }
    }

    // will find the book id present or not in our collection
    public void findbookid() {
        try {
            int count = 0;
            System.out.println("Please enter your book id:");
            int bookid = Integer.parseInt(variables.sc.nextLine());
            // searching for book ids in book id array
            for (int id : Books_obj.bookId) {
                if (bookid == id) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Unavailaible");
            } else {
                System.out.println("Available");
            }
        } catch (Exception e) {
            System.out.println("you didn't entered or entered wrong syntax of the book id");
            System.exit(1);
        }

    }

    // print about users books
    public void info() {
        user.setdetails(variables.inputuser);
        // splitting books name by ,
        String[] newbook = user.userdetails.get(variables.inputuser).get("New Books:").split(",");
        String[] compbook = user.userdetails.get(variables.inputuser).get("Completed Books:").split(",");
        String[] favbook = user.userdetails.get(variables.inputuser).get("Favourite Books:").split(",");
        System.out.println("New Books:");
        for (String book : newbook)

        {
            System.out.println(book);
        }
        System.out.println("Favourite Books:");
        for (String book : favbook)

        {
            System.out.println(book);
        }
        System.out.println("Completed Books:");
        for (String book : compbook)

        {
            System.out.println(book);
        }

    }

    // will search for book name in our collection
    public void findBook() {
        try {System.out.println("Book List");
            System.out.println("0 Ulysses   ");
            System.out.println("1 Don Quixote");
            System.out.println("2 One Hundred Years of Solitude");
            System.out.println("3 Hamlet");
            System.out.println("4 In Search of Lost Time");
            System.out.println("Please enter the book id");
            
            int i = -1;
            int count = 0;
//          
            int bookid = Integer.parseInt(variables.sc.nextLine());

//            int id : Books_obj.bookId
//            String b : Books_obj.bookName
            for (int id : Books_obj.bookId) {
                if (bookid == id) {
                	System.out.println("Book Name : " + Books_obj.bookName[i]);
                    System.out.println("Author Names : " + Books_obj.authorName[i]);
                    System.out.println("Description : " + Books_obj.description[i]);
                    count++;
                }
                i++;
            }
            if (count == 0) {
                System.out.println("Book not found!");
            }
        }
        // if book name space is empty
        catch (Exception e) {
            System.out.println("You didn't entered the book name");
            System.exit(1);
        }

    }

    public void torun() {
        try {

        System.out.println("Do you want to continue?");
        variables.conti = variables.sc.nextLine();

        while (!variables.conti.toLowerCase().equals("yes") && !variables.conti.toLowerCase().equals("no")) {
            System.out.println("Please enter your answer with these 2 values : yes OR no");
            System.out.println("Do you want to continue?");
            variables.conti = variables.sc.nextLine();
        }
        if (variables.conti.toLowerCase().equals("yes")) {
            opt();
        }
        else if(variables.conti.toLowerCase().equals("no")) {
        	System.out.println("Thank You !");
        }
        }
        catch(Exception e)
        {
            System.out.println("You didnt answered the question: Do you want to continue? ");
        }

    }
}


class initialize implements Runnable {
    static MagicOfBooks2 magic = new MagicOfBooks2();

    @Override
    public void run() {
        try {
            System.out.println("Please enter your username:");

            variables.inputuser = variables.sc.nextLine();
            // System.out.println(variables.inputuser);
            boolean a = magic.checkUser();
            //if username is present
            if (a) {
                System.out.println("Welcome " + variables.outputuser + "!");
                magic.opt();
//                magic.torun();

            } else {
                System.out.println("User Name is invalid. Please Login again");

    
            }

        }
        //if username spce is empty
        catch (Exception e) {
            System.out.println("You didn't entered the username");
            System.exit(1);
        }

    }

}

class MagicOfBooks {

    // Complete the 'Main' function below.

    public static void Main() {
        try {
            initialize obj = new initialize();
            Thread thread = new Thread(obj);
            thread.start();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}


public class Main {
    public static void main(String[] args) {
        MagicOfBooks.Main();
    }
}
