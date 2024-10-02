import java.util.List;

public class Member extends Person{
    private String memberID;
    private String title;
    private List<Book> borrowedBooks;
    public void borrowBook(String bookID){
        for(Book book : getCatalog()){
            if(book.getBookID().equals(bookID)&&book.isAvailable()){
                borrowedBooks.add(book);
            }
        }
    }
    public void returnBook(String bookID){
        for(Book book: borrowedBooks){
            if (book.getBookID().equals(bookID)&&!book.isAvailable()){
                borrowedBooks.remove(book);
            }
            else {
                System.out.println("There is no book with "+bookID+"bookID");
            }
        }
    }
    public void viewBorrowedBooks(){
        for (Book book:borrowedBooks){
            System.out.println(book);
        }
    }

    public int CountOfBorrowedBooks() {
        return borrowedBooks.size();
    }
}
