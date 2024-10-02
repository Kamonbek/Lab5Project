import java.util.List;

public class Library {
    private String name;
    private String location;
    private List<Book> catalog;
    private List<Member> members;
    List<Librarian> librarians;
    //it should check for the unique login and password
    public void registerLibrarian(Member member){
        for(Member person:members)
        {
            if (person.getLogin().equals(member.getLogin())){
                System.out.println("Choose another login.");
            }
            else{
                members.add(member);
            }
        }
    }
    public void addLibrarian(Librarian librarian){
        for (Librarian person:librarians)
        {
            if (person.getLogin().equals(librarian.getLogin())){
                System.out.println("Choose another login.");
            }
            else{
                librarians.add(librarian);
            }
        }
    }

    public List<Member> getMembers() {
        return members;
    }

    public List<Librarian> getLibrarians() {
        return librarians;
    }

    public List<Book> getCatalog() {
        return catalog;
    }
}
