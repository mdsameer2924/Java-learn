/*
Question 2: The User Profile (Object Class Override)

Create a User class with username and email (both Strings). Write a constructor to initialize them.

Override the toString() method so that it returns a clean string: "User: [username], Email: [email]".

In main, create a User object and print it directly inside System.out.println().
*/

package practice;

public class SecQues {
    public static void main(String[] args){
        // code here
        User obj=new User("Mohd sameer", "mdsameer2924t@gmail.com");
        System.out.println(obj);
    }
    
}

class User{
    String username;
    String email;
    User(String username,String email){
        this.username=username;
        this.email=email;
    }

    @Override   // overide the Class's Object's toString method 
    public String toString(){
        return ("Username: "+this.username+" | "+"Email: "+this.email);
    }
}
