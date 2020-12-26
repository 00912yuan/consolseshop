import java.util.Scanner;

public class Test {
    public  static void main(String[] args){
        System.out.println("请输入用户名：");
        Scanner sc = new Scanner(System.in);
       String Username =sc.next();
        System.out.println("请输入用户名："+Username);
        System.out.println("请输入密码：");
        String password = sc.next();
        System.out.println("请输入密码："+password);
    }
}
