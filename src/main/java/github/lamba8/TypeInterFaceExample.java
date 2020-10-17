package github.lamba8;

//Java 8 Lambda Basics 10 - Type Inference
public class TypeInterFaceExample {

    public static void main(String args[]) {

        StringLengthLamba lambda = s -> s.length();
        //get rid of type interface in Lamba...if one remove String s as well.
        StringLengthLamba lamba = (String s) -> s.length(); //get rid of type interface in Lamba...if one remove String s as well.


        //Pass actions
        printLamba(s -> s.length(), "hello world");



        //Runnable using Lamba.
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Run the thread");
            }
        });

        t.run();

        Thread t2 = new Thread(() -> System.out.println("Run the thread"));
        t2.run();

    }

    public static void printLamba(StringLengthLamba lamba, String s) {
        System.out.println(lamba.getLength(s));
    }

    interface StringLengthLamba {

        int getLength(String s);

    }
}
