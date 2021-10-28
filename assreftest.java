//Invoke private methods of some other class using reflection.

import java.lang.reflect.*;
class appTess1234{
    private String s;
    public appTess1234(){
        s = "Apple";
    }
    private void Met1(){
        System.out.println("name of the string is apple");
    }
    private void method2(){
        System.out.println("This is te private method");
    }
}
class assreftest{
    public static void main(String args[]) throws Exception{
        appTess1234 te = new appTess1234();
        Class cls = te.getClass();
        System.out.println(cls.getName());

        Method m1 = appTess1234.class.getDeclaredMethod("Met1");
        m1.setAccessible(true);
        m1.invoke(te);
        Method m2 = cls.getDeclaredMethod("method2");
        m2.setAccessible(true);
        m2.invoke(te);
    }
}
