
public class Book {
	private String title;
	private String author;
	private String content;
	private int edition;
	/**
	 * 
	 * @return
	 */
    public String getTitle() {
		return title;
}
    public String getAuthor() {
    	return author;
    }
    public String getContent() {
    	return content;
    }
    public int getEdition() {
    	return edition;
    }
    public Book(String t, String a, String c, int e) {
    	this.edition = e;
    	this.author = a;
    	this.title = t;
    	this.content = c;
    	
    	
    }
    public int getPages() {
    	int letters = content.length();
    	int pageCount = (int) Math.ceil(letters / 700.0);
    	return pageCount;
    }
    public String toString() {
    	String lives = "";
    	for (int a = 0; a < 1; a++) {
    			lives += "Title: " + title +"\n";
    			lives += "Author: " + author+ "\n";
    			lives += "Edition: "+ edition;
    		}
    		
    	return lives;
    }
    


}

