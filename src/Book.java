public class Book extends Library{
    private String bookID;
    private String title;
    private String author;
    private boolean isAvailable;
    Book(String title,String author){
        this.title=title;
        this.author=author;
        isAvailable=true;
        this.bookID=BookIDGenerator.generateBookID();
    }
    public boolean borrowBook(){
        if(isAvailable){
            isAvailable = false;
            return true;
        }
        else {System.out.println("Currently, not available");
        return false;}
    }
    public boolean returnBook(){
        if (isAvailable){
            System.out.println("The book was not borrowed.");
            return false;
        }else{isAvailable = true;
        return true;}
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookID() {
        return bookID;
    }



    public void displayBook(){
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
    }
}
