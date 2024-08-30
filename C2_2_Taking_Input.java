import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name");

        String userName = myObj.nextLine();
        System.out.println("USername is " + userName);
        myObj.close();
    }
}