package Questions;

public class PreAndPostIncrement {
    public static void main(String[] args) {

        int num1=9;

        int num2= num1++;


        if(num2 < 10){
            System.out.println(num2 + " Hello World");
        } else {
            System.out.println(num1 + " Hello Universal");
        }
    }
}
