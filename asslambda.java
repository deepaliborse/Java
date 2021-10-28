//create an interface student with abstract method as marks with one argument total, in main create lambda to calculate average(5 subs) and print it.

interface Stu{
    public void display(float a, float b, float c, float d,float e);
}
class asslambda{
    public static void main(String args[]){
        Stu s1 = (a,b,c,d,e) -> {
            double sum = 0;
            double avg = 0;
            sum=a+b+c+d+e;
            avg = sum/5;
            System.out.println("The sum of marks of student is " +sum);
            System.out.println("The average of marks of the student is "+avg);
        };
        s1.display(90,88,96,85,80);
    }
}

