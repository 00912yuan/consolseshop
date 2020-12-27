
import java.io.File;
import java.io.InputStream;
import java.util.Scanner;
public class Test {
    public  static void main(String[] args) throws ClassNotFoundException {
        boolean bool = true;
        while (bool) {
            System.out.println("请输入用户名：");
            Scanner sc = new Scanner(System.in);
            String Username = sc.next();
            System.out.println("请输入用户名：" + Username);
            System.out.println("请输入密码：");
            String password = sc.next();
            System.out.println("请输入密码：" + password);
            //File file =new File("C:\\Users\\ASUS\\Desktop\\consolseshop\\src\\User.xlsx");
            java.io.InputStream in = Class.forName("Test").getResourceAsStream("/User.xlsx");
            ReadExcel readExcel = new ReadExcel();
            User users[] = readExcel.readExcel(in);
            for (int i = 0; i < users.length; i++) {
                if (Username.equals(users[i].getUsername()) && password.equals(users[i].getPassword())) {
                    System.out.println("登陆成功");
                    bool = false;
                    break;
                } else {
                    System.out.println("登录失败");
                }
            }
        }
    }
    private static class InputStream {
    }
}
