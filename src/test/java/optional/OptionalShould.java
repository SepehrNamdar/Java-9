package optional;

import football.player.Player;
import helper.PlayerTestHelper;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class OptionalShould {

    @Test
    void should_not_create_stream_from_optional() {
        final PlayerTestHelper playerTestHelper = new PlayerTestHelper();
        final List<Player> players = playerTestHelper.getPlayers();

/*        Optional.ofNullable(players)
                .flatMap(p -> p.stream())*/

        final long count = Optional.ofNullable(players).stream()
                .flatMap(Collection::stream)
                .map(Player::getName)
                .count();

        assertThat(count).isEqualTo(5);
    }

}
