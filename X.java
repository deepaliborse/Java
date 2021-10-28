/*
//Implement a generic class X with two generic type arguments and to manipulate the
//instance variables in methodA and to print values in methodB.


class X {
    public static void main(String[] args) {

        //Object 1:
        GenericsClass<Integer,String> Obj1 = new GenericsClass<>();
        System.out.println("------\nGeneric Class returns for object 1:\n------");

        Obj1.methodA(20,"Anushka");
        Obj1.methodB();

        //Object 2:
        GenericsClass<Integer,String> Obj2 = new GenericsClass<>();
        System.out.println("------\nGeneric Class returns for object 2:\n------");

        Obj2.methodA(10,"Deepali");
        Obj2.methodB();
    }
}

class GenericsClass<T,S> {
    private T data;
    private S name;

    public void methodA(T data, S name) {
        this.data=data;
        this.name=name;
    }

    public void methodB() {
        System.out.println("Data: "+this.data);
        System.out.println("Name: "+this.name);
    }
}*/
