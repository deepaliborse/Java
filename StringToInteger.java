public class StringToInteger {
    public static void main(String[] args) {

        String str = "100";

        try{
            int number = Integer.parseInt(str);
            System.out.println("String:" + str);
            System.out.println("Integer:" + number);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
    }
}
