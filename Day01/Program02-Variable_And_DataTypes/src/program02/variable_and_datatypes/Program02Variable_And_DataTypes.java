package program02.variable_and_datatypes;

/**
 *
 * @author tamnguyen
 */
public class Program02Variable_And_DataTypes {
    public static void main(String[] args) {
        // để hiển thị hàm lựa chọn nhấn tổ hợp: Ctrl + "dấu cách"
        // TODO code application logic here
        // playWithVariables();
        // sumNumbers();
        // printf_vs_println();
        // playWithIntegers();
        // playWithDoubles();
        // playWithCharacters();
        // playWithStrings();
        // playWithBoolean();
        printIntegers();
    }
    
    // static thì chỉ chơi với static -- OOP
    public static void playWithVariables() {
        // biến là vùng RAM được đặt tên chứa một số byte nhất định, tùy
        // loại thông tin, dữ liệu mà nó chứa bên trong
        // biến là cách đặt tên cho đại lượng, một giá trị đơn hoặc phức
        int yearOfBirth = 1996;
        int currentYear = 2025;
        int Age = currentYear - yearOfBirth;
        System.out.println("Hello Tam Nguyen. Your age: " + Age);
    }
    
    public static void sumNumbers(){
        int a = 5;
        int b = 7;
        System.out.println("a + b = " + (a + b));
    }
    
    public static void printf_vs_println(){
        // lệnh printf thì in ra màn hình nhưng nó không xuống dòng. Để có thể xuống dòng
        // ta dùng siêu kí tự \n
        // lệnh println thì sau khi in ra màn hình nó sẽ xuống dòng
        System.out.printf("This year is %d\n", 2025);        
    }
    
    public static void playWithIntegers(){
        // mọi con số, ký tự xuất hiện trong mã chương trình được gọi là little value
        // số nguyên xuất hiện trong mã chương trình luôn mặc định là kiểu integer
        int x = 5;
        System.out.println("x = " + x);
        // kiểu integer có kích thước là 4 byte
        
        // kiểu long có kích thước là 64 byte
        // long y = 10000000000; nếu như ta định nghĩa như thế này sẽ báo lỗi bì mọi
        // số nguyên xuất hiện trong mã chương trình đều là dạng số nguyên (size = 4bytes)
        // do vậy mà 10000000000 nó vượt quá kích thước của integer. Câu hỏi là vì sao 
        // ta khai báo "long y" rồi mà? Đúng là vậy, nhưng "long y" chỉ dành cho biến y,
        // chứ không cho giá trị của nó. Vậy giải pháp là gì? Chỉ cần thêm hậu tố L là được
        
        long y = 10000000000L;
        System.out.println("y = " + y);
        
        System.out.println("x + y = " + (x + y));
        
        // Có thể dùng _ để phân cách hàng trong chữ số, _ sẽ không in ra màn hình
        //long u = 1000_000_000L;
    }
    
    public static void playWithDoubles(){
        // Trong Java ưu tiên Double hơn là Float, và giá trị mặc nhiên được xem là Double
        // kích thước của Double là 8 bytes còn Float là 4 Bytes
        double piNumber = 3.14;
        System.out.println("pi Number = " + piNumber);
        System.out.printf("pi Number = %f\n", piNumber);
        System.out.printf("pi Number = %.2f\n", piNumber); // %.2f lấy 2 chữ số sau dấu
        // thập phân

        // float vat = 0.1; khi khái báo như thế này thì 0.1 là Double nó có size = 8 bytes
        // nhưng mà float chỉ có size là 4 bytes mà thôi cho nên 0.1 không thể nhét nổi
        // vào biến vat. Vậy cách giải quyết là thêm hậu tố F
        float vat = 0.1F;
        System.out.println("vat = " + vat);
    }
    
    public static void playWithCharacters() {
        // kích thước 2 bytes dành cho lưu trữ kiểu Char, cho phép lưu bảng mã Unicode
        char dollarSign = '$'; // dùng dấu '' để biểu thị ký tự char, còn dấu "" để biểu thị
        // chuỗi String
        System.out.println("Unit: " + dollarSign);
    }
    
    public static void playWithStrings() {
        String name = "Tam Nguyen";
        System.out.println("Name: " + name);
        // name.charAt(0); charAt(int index) là một hàm trả về ký tự ứng với index chỉ định
        System.out.println("Name Letter at Index 1: " + name.charAt(1));
        System.out.println("In hoa: " + name.toUpperCase());
        System.out.println("In thuong: " + name.toLowerCase());
    }
    
    public static void playWithBoolean() {
        boolean flag = true;
        if (flag == false){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }
    
    public static void printIntegers(){
        // in ra các số từ 1 -> 100
        System.out.println("In ra các số từ 1 -> 100");
        for (int i = 0; i < 101; i++) {
            System.out.println(i);
        }
    }
}
