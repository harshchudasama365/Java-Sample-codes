package harsh_week2_graded;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class User {
	String[] userName = { "adam sandler", "Tom Hanks", "tom cruise", "Angelina Jolie", "Scarlett Johansson" };
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

