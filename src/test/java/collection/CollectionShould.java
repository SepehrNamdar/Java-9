package collection;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectionShould {

    @Test
    void be_created_easily_and_be_immutable() {
        final Set<Integer> integers = Set.of(1, 2, 3);  // From Java 9
        //integers.add(6);
        final Set<Integer> oldSet = new HashSet<>();    // Until Java 8
        oldSet.add(1);
        oldSet.add(2);
        oldSet.add(3);

        assertThat(integers).isEqualTo(oldSet);

        Map.of("key 1", 1, "key 2", 2);

        List.of(1, 2, 3);
    }
}
