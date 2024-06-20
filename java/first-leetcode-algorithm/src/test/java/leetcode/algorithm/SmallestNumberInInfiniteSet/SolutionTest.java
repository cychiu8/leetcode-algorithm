package leetcode.algorithm.SmallestNumberInInfiniteSet;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class SolutionTest {

    static Stream<SmallestInfiniteSet> solutions() {
        return Stream.of(new BasicSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(SmallestInfiniteSet smallestInfiniteSet) {

        smallestInfiniteSet.addBack(2); // 2 is already in the set, so no change is made.
        assertEquals(1, smallestInfiniteSet.popSmallest()); // return 1, since 1 is the smallest
                                                            // number, and remove it from the set.
        assertEquals(2, smallestInfiniteSet.popSmallest()); // return 2, and remove it from the set.
        assertEquals(3, smallestInfiniteSet.popSmallest()); // return 3, and remove it from the set.
        smallestInfiniteSet.addBack(1); // 1 is added back to the set.
        assertEquals(1, smallestInfiniteSet.popSmallest()); // return 1, since 1 was added back to
                                                            // the set and is the smallest number,
                                                            // and remove it from the set.
        assertEquals(4, smallestInfiniteSet.popSmallest()); // return 4, and remove it from the set.
        assertEquals(5, smallestInfiniteSet.popSmallest()); // return 5, and remove it from the set.

    }
}
