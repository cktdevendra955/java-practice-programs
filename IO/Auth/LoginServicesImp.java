class LoginServicesImp implements LoginServices{

    final String userid = "admin";
    final String password = "admin";

    int choice;

   
    @Override
    public boolean login(String userid, String password) {
        if (this.userid.equalsIgnoreCase(userid)) {
            if (this.password.equalsIgnoreCase(password)) {
                return true;
            }else{
                System.out.println("Incorrect Password");
                return false;
            }            
        }else{
            System.out.println("Encorrect Userid");
            return false;
        }
    }
    
}
