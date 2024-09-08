import java.sql.DriverManager;

class LoadingDriver {
    public static void main(String args[]){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL Driver Loaded!");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
