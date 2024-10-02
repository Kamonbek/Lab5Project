public class Guest extends Person{
    public void viewCatalog(){
        for (Book book: getCatalog()){
            System.out.println(book);
        }
    }
}
