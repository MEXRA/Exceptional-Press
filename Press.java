import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Press {
	private HashMap<String, Integer> edition= new HashMap<String, Integer>();
	private HashMap<String, List<Book>> shelf;
	private int store;
	private String directory;
	private int sSize;
	String[] count;



public Press(String pathToBooKDir, int shelfSize) {
		directory = pathToBooKDir;
		sSize = shelfSize;
		shelf = new HashMap<String, List<Book>>(shelfSize);
		File folder = new File(this.directory);
	    count = folder.list();
		for (String count2 : count) {
			this.edition.put(count2, 0);
			this.shelf.put(count2, new ArrayList<Book>());
		}
	}

public List<String> getCatalogue() {
		ArrayList<String> name = new ArrayList<String>();
		File folder = new File(directory);
		count = folder.list();
		for (String count2 : count) {
			name.add(count2);
		}
		return name;
	}
	

}
