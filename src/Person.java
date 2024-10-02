public class Person extends Library{
    private String name;
    private String ID;
    private int age;
    private String login;
    private String password;
    private Role role;
    public enum Role {
        MEMBER,
        LIBRARIAN,
        ADMIN
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Age: " + age);
        System.out.println("Role:"+role);
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
