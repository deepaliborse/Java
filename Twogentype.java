//Implement a generic class with two generic type variables.
class Twogentype {
    public static void main(String[] args) {

        GenericsClass<Integer,String> Obj1 = new GenericsClass<>(5,"Apple");
        System.out.println("Generic Class returns: " + Obj1.getData1()+" "+ Obj1.getName1());
        GenericsClass<Integer,String> Obj2 = new GenericsClass<>(4,"Bannana");
        System.out.println("Generic Class returns: " + Obj2.getData1()+" "+ Obj2.getName1());
        GenericsClass<Integer,String> Obj3 = new GenericsClass<>(3,"Mango");
        System.out.println("Generic Class returns: " + Obj3.getData1()+" "+ Obj3.getName1());
    }
}

class GenericsClass<T,S> {
    private T data;
    private S name;
    public GenericsClass(T data, S name) {
        this.data = data;
        this.name = name;
    }

    public T getData1() {
        return this.data;
    }
    public S getName1(){
        return this.name;
    }
}
