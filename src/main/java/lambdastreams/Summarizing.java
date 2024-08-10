package lambdastreams;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Summarizing {
    public static void main(String[] args) {
        DoubleSummaryStatistics stats = Stream.generate(Math::random)
                .limit(1000)
                .collect(Collectors.summarizingDouble(Double::doubleValue));
        System.out.println(stats);

        // DoubleSummaryStatistics A state object for collecting statistics such as count, min, max, sum, and average.
        //This class is designed to work with (though does not require) streams. For example, you can compute summary statistics on a stream of doubles with:
    }
}
