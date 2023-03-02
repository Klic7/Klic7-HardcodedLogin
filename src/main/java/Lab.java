
public class Lab {
    /**
     * This challenge represents a hardcoded login example:
     *
     *     Let's say we have two users, named "admin" and "user".
     *     "admin" has a password of "qwerty".
     *     "user" has a password of "password".
     *
     * The method should return true if the login should be permitted, and false if it should not. You will need to use
     * if/else statements.
     *
     * @param username a String that represents a username.
     * @param password a String that represents a password.
     * @return true if there is a successful login, and false otherwise.
     */
    public boolean login(String username, String password){
        //update
        String[] Users = {"admin", "user"};
        String[] Passwords = {"qwerty", "password"};
        for (int i=0; i<Users.length; i++){
            if(Users[i].equals(username) && Passwords[i].equals(password)) return true;
        }
        return false;
    }
}
