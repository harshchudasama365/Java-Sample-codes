package harsh_week2_graded;


public class MagicOfBooks {

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
			System.out.println("1.Print your books (new,favourite,completed)");
			System.out.println("2.Find book by bookId");
			System.out.println("3.Print the details of a book");
			System.out.println("Please enter your choice:");

			int opt = Integer.parseInt(variables.sc.nextLine());
			// if option is not from 1-3
			while (opt > 3 | opt < 0) {
				System.out.println("Please enter your options between 1-3");
				System.out.println("Please enter your choice");
				opt = Integer.parseInt(variables.sc.nextLine());
			}
			switch (opt) {

			case 1:
				info();
				break;
			case 2:
				findbookid();
				break;
			case 3:
				findBook();
				break;

			}
		} catch (Exception e) {
			System.out.println("You didn't entered or entered wrong syntax of option");
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
		try {
			int i = 0;
			int count = 0;
//			System.out.println("");
			variables.inputbook = variables.sc.nextLine();
			// will search for bookname in books name array
			for (String b : Books_obj.bookName) {
				if (b.toLowerCase().equals(variables.inputbook.toLowerCase())) {
					System.out.println("Author Name: " + Books_obj.authorName[i]);
					System.out.println("Description: " + Books_obj.description[i]);
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
			Thread.currentThread().run();
		}
		}
		catch(Exception e)
		{
			System.out.println("You didnt answered the question: Do you want to continue? ");
		}

	}
}
