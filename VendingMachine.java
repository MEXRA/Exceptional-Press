import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//a book with 500 pages multiplied by 0.01 pound
public class VendingMachine {
	private List<Book> shelf = new ArrayList<Book>();
	private double locationFactor;
	private double cassette = 0;
	private double safe = 0;
	private String password;
	private int storage2;
	private int length;
	
	public VendingMachine(double locationFactor, String password) {
		this.locationFactor = locationFactor;
		this.password = password;
	}
	public double getCassette(){
		return cassette;
	}
	
	public void insertCoin(double coin) throws RuntimeException {
		final Set<Double> values = new HashSet<Double>(Arrays.asList(0.01,0.02, 0.05,0.1, 0.2, 1.0,2.0));
		if (values.contains(coin)) {

			cassette += coin;
		}
		else {
			throw new IllegalArgumentException("-");
		}
		}
	
	
	public double returnCoins() {
		cassette = 0;
		return cassette;
		
		 
		
	}
		
	public void restock(List<Book> books, String password) {
		if(password.equals(this.password)) {
			int value = books.size() + shelf.size();
			this.shelf = new ArrayList<Book>(value);
			for (int a = 0; a < value ; a++) {
				this.shelf.add(books.get(a));
			}
			
		}
		else if(!(password.equals(this.password))){
			throw new InvalidPasswordException();	
		}
	}
	public double emptySafe(String password) {
		if(!(password.equals(this.password))) {
			throw new InvalidPasswordException();
		}
		else {
			storage2 += safe;
			safe = 0;		}
		return safe;
	}
	public List<String> getCatalogue() {
		int leng = shelf.size();
		List<String> explanation = new ArrayList<String>(leng);
		for (int b = 0; b < leng ; b++) {
			explanation.add(shelf.get(b).toString());
		}
		//return explanation;
		return explanation;
	}
	
	public double getPrice(int index) throws RuntimeException {
		int part;
		double cost = 0;
		if( index <= -1 | index >= shelf.size() ) {
			throw new IndexOutOfBoundsException();
		}
		else {
			Book kitap = shelf.get(index);
			part = kitap.getPages();
			cost = part * locationFactor;
		}
		return cost;
	}
	public Book buyBook (int index) {
	    Book kitap = shelf.get(index);
		int part = kitap.getPages();
		double price = part * locationFactor;
		
		if(price > cassette) {
			throw new CassetteException();
		}
		else {
			shelf.remove(index);
			this.cassette = this.cassette - price;
		}
		return kitap;
	}


}
	


	

	

	
	
	


