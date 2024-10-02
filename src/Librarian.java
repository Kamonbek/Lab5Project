import java.util.List;

public class Librarian extends Person{
    private String librarianID;
    private String name;
    private List<Book> managedBooks=getCatalog();

    public void addBook(Book book){
        managedBooks.add(book);
    }
    public void removeBook(String BookID){
        managedBooks.removeIf(book -> book.getBookID().equals(BookID) && book.isAvailable());
    }
    public void issueBook(String bookID, Member member){
        for(Book book: managedBooks){
            if(book.getBookID().equals(bookID)){
                if(book.isAvailable()){
                    if (member.CountOfBorrowedBooks()<5){
                    member.borrowBook(bookID);
                    book.borrowBook();
                    }
                }
                else{
                    System.out.println(book.getTitle()+" is not available");}
            }
        }
    }
    //notify the member about the return of the book
    public void returnBook(String BookID){
        for(Book book: managedBooks){
            if(book.getBookID().equals(BookID)){
                book.returnBook();
            }
        }
    }
    public void viewBook(){
        for(Book book: managedBooks){
            System.out.println(book.getTitle()+" "+book.isAvailable());
        }
    }
    //think about overdue books
}
