
import java.io.File;
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
        File file =new File("C:\\Users\\ASUS\\Desktop\\consolseshop\\src\\User.xlsx");
        ReadExcel readExcel = new ReadExcel();
        User users[]=readExcel.readExcel(file);
        for(int i=0;i<users.length;i++){
            if (Username.equals(users[i].getUsername()) &&password.equals(users[i].getPassword())){
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("登录失败");
            }
        }
    }
}
