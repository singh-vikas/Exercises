package github.lamba8;

public class Greeter {

    public static void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String args[]) {

        Greeter greeter = new Greeter();

        //Java 8 Lambda Basics 5 - Passing Behavior in OOP
        greeter.greet(new HelloWorldGreeting());

        //What if Just pass the action not class/object which does the action
        //Java 8 Lambda Basics 6 - Introducing Lambda Expressions

        //   aBlockOfCode =  public void perform (){
        //         System.out.println("hello world.!");
        //    }    -- action assignment. //Function as a value.

        //Lambda
        Greeting aBlockOfCode = () -> System.out.println("hello");  //Interface should have only one method.

        aBlockOfCode.perform();  //Implemented the action not interface.

        // numberFucntion = (int a) -> a*2;


        //Java 8 Lambda Basics 9 - Lambdas vs Interface Implementations
        Greeting greeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("hello to InnerClass");
            }
        };

    }
}
