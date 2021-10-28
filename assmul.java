//Create multiple threads using anonymous inner classes.

class assmul{
    public static void main(String args[]){
        new Thread(){
            public void run(){
                System.out.println("Keep some task here.....");
            }
        }.start();
        new Thread(new Runnable() {
            public void run(){
                System.out.println("Keep some task here.....");
            }
        }).start();
    }
}


