import java.util.Scanner;
public class Login{
    
    static void login ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n *******welcome to Princemart*******");
        System.out.println("\n\n         Singup        ");
        System.out.println("User Id:");
        String Id = scanner.nextLine();
        System.out.println("Password:");
        String Password=scanner.nextLine();
        System.out.println("Singup Sucessfully !!!!! Pelase Login And Enjoy Shoping");
        System.out.print("\033c");
        System.out.println("\n\n         Login        ");
        System.out.println("User Id:");
        String Id1 = scanner.nextLine();
        System.out.println("Password:");
        String Password1=scanner.nextLine();
        String captcha = CaptchaGenerator.generateCaptcha();
        System.out.println("Generated CAPTCHA: " + captcha);
        System.out.println("Enter Captcha");
        String captch1 = scanner.nextLine();
        
        if(Id1.equals(Id) && Password1.equals(Password)){
            if(captch1.equals(captcha))
            {
            System.out.println("Login Successfull !! Welcome To Our Store");
            store1.Store();
            }else{
                System.out.println("Invalid Captcha, Please Try Again!!!");
            }
        }
        else{
            System.out.println("Invalid User ID or password, Please try again.");
        }
    }
public static void main(String[] args) {

    login();

}
}