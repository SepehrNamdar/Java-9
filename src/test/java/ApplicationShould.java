import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationShould {

    @Test
    void works() {
        Application app = new Application();

        boolean isWorking = app.isWorking();

        assertThat(isWorking).isTrue();
    }

}
