class loginfail extends Exception {
    loginfail(String s) {
        super(s);
    }
}

class login {
    static void validate(String u, int p) throws loginfail {
        String user = "anu";
        int password = 123;
        if (u.equals(user) && p == password)
            System.out.println("login successful");  // Corrected typo
        else
            throw new loginfail("login failed");
    }

    public static void main(String args[]) {
        try{String name = "ajay";
        int pass = 1234;
        validate(name, pass);}
        catch(Exception e){
            System.out.println(e);
        }
    }
}
