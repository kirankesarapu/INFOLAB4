public class Account {
    private String username; 
    private String password; 
    private String email; 
    
    Account() {
    }

    Account(String username, String password, String email){
        this.username = username; 
        this.password = password; 
        this.email = email;
    }


    public static Account login(String username, String password){
        // API and validate user credentials
        Account account = new Account(username, password, "");
        return account; 
    }

    public static Account setusername(String username , String password, String email){

        // API call to register this account
        Account account = new Account(username, password, email);
        return account; 
    }

    public void setpassword(String newPassword) {
        // API call to reset password
    }
    public void setusername(String setusername){

    }
    public void setemail(String setemail){
        
    }
}
