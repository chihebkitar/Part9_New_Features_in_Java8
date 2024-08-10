package lambdastreams;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Objects;

public class FileFilterDemo {
    public static void main(String[] args) {
        File directory = new File("./src/main/java/lambdastreams");
        System.out.println(directory.getAbsolutePath());

        //anonymous inner class
        Arrays.stream(Objects.requireNonNull(directory.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith("java");
            }
        }))).forEach(System.out::println);

        // use lambda expression instead
        Arrays.stream(
                directory.list((dir,name)->name.endsWith("java"))
        ).forEach(System.out::println);

        // assign lambda to variable
        FilenameFilter javaFiles = (dir, name) -> name.endsWith("java");
        Arrays.stream(
                directory.list(javaFiles))
                .forEach(System.out::println);


    }

}
