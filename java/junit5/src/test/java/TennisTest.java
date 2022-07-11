import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class TennisTest {

    @Test
    void score_starts_at_0_0() {
        assertThat(new Game().getScore()).isEqualTo("Love-All");
    }

    @Test
    void first_round_won_by_player_one_score_is_15_love() {
        assertThat(new Game()
                           .roundWon("player1")
                           .getScore())
                .isEqualTo("Fifteen-Love");
    }

    @Test
    void second_round_won_by_player_one_score_is_30_Love() {
        assertThat(new Game()
                           .roundWon("player1")
                           .roundWon("player1")
                           .getScore())
                .isEqualTo("Thirty-Love");
    }

    @Test
    void first_round_won_by_player_two_score_is_Love_Fifteen() {
        assertThat(new Game()
                .roundWon("player2")
                .getScore())
                .isEqualTo("Love-Fifteen");
    }
}
