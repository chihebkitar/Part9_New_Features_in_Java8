package lambdastreams;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class LambdaDemo {
    public static void main(String[] args) {
        // foreach takes a consumer
        // lambda expression
        Stream.of(3,1,4,1,5,9)
                .forEach(n -> System.out.println(n));


        // using anonymous inner class
        Stream.of(3,1,4,1,5,9)
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.println(integer);
                    }
                });

        // define consumer separately
        Consumer<Integer> printer = n -> System.out.println(n);
        Stream.of(3,1,4,1,5,9)
                .forEach(printer);

    }
}
