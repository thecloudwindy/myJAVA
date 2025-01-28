package program06.demotextblock;

public class Program06DemoTextBlock {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("My Text Block is " + demoTextBlock());
    }
    
    public static String demoTextBlock(){
        String myTextBlock = """
                             <!DOCTYPE html>
                             <html>
                             <body>
                             
                             <h1>My First Heading</h1>
                             
                             <p>My first paragraph.</p>
                             
                             </body>
                             </html>
                             """;
        return  myTextBlock;
    }
}
