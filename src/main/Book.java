package main;

public class Book {
    String BookName;
    String AuthorName;
    String ISBN_No;

    public Book(String BookName,String AuthorName,String ISBN_No){
        this.BookName=BookName;
        this.AuthorName=AuthorName;
        this.ISBN_No=ISBN_No;
    }

    public String getISBN_No() {
        return ISBN_No;
    }

    public void setISBN_No(String ISBN_No) {
        this.ISBN_No = ISBN_No;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }
}
