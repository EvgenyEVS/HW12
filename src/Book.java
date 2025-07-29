import java.util.Objects;

public class Book {
    private String bookName;
    private int publicationYear;
    private Author author;

    public Book(String bookName, int publicationYear, Author author) {
        this.bookName = bookName;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return bookName + " издана в " + publicationYear + " году. " + author.toString() + ".";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return book.bookName == bookName &&
                book.publicationYear == publicationYear &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, publicationYear, author);
    }
}
