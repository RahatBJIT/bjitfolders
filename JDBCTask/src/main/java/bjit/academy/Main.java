package bjit.academy;

public class Main {

    public static void main(String args[]){
        DBConnect dbObj = new DBConnect();
        dbObj.doConnectDB();
        dbObj.fetchData();
    }
}
