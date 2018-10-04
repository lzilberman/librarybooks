package telran.library.entities;

import java.util.List;

import javax.persistence.*;

import telran.library.dto.Cover;

@Table(name="books")
@Entity
public class Book {
@Id
long isbn;
String title;
@Enumerated(EnumType.STRING)
Cover cover;
int amount;
int pickPeriod;
@ManyToMany
List<Author> authors;
@OneToMany(mappedBy="book")
List<Record> records;

	public Book() {}

	public Book(long isbn, String title, Cover cover, int amount, int pickPeriod, List<Author> authors) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.cover = cover;
		this.amount = amount;
		this.pickPeriod = pickPeriod;
		this.authors = authors;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void setPickPeriod(int pickPeriod) {
		this.pickPeriod = pickPeriod;
	}
	
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public long getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public Cover getCover() {
		return cover;
	}

	public int getAmount() {
		return amount;
	}

	public int getPickPeriod() {
		return pickPeriod;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public List<Record> getRecords() {
		return records;
	}


	
	
}
