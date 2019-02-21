/*
 * Created By : Uee
 * Modified By :
 *
 * <p>
 * This Source Code is released under the terms of the
 * GNU license. See https://www.gnu.org/licenses/#GPL
 * for more information.
 * <p>
 * Usage:   Do what you want, modify like you want.
 * <p>
 */

public class PlayBlackJack {

    /* ---------- ---------- ---------- VARIABLES ---------- ---------- ----------  */

    private BlackJackRules _rules = new BlackJackRules();

    /* ---------- ---------- ---------- PLAY BLACKJACK METHOD ---------- ---------- ----------  */

    public void ShowInformation(Dealer dealer, Player player) {
        System.out.println(player.Name);
        player.ShowCards();
        System.out.println("Score = " + player.HandValue);
        System.out.println(_rules.WinOrLose(dealer, player));
        System.out.println();
    }

    public static void main(String[] args) {

        PlayBlackJack playBlackJack = new PlayBlackJack();

        Dealer dealer = new Dealer();
        Player billy = new Player("Billy");
        Player lemmy = new Player("Lemmy");
        Player andrew = new Player("Andrew");
        Player carla = new Player("Carla");

        dealer.AddCard(new Card("Spades", "Jack", 10));
        dealer.AddCard(new Card("Hearts", "9", 9));

        System.out.println(dealer.Name);
        dealer.ShowCards();
        System.out.println("Score = " + dealer.HandValue);
        System.out.println();

        billy.AddCard(new Card("Spades", "2", 2));
        billy.AddCard(new Card("Diamonds", "2", 2));
        billy.AddCard(new Card("Hearts", "2", 2));
        billy.AddCard(new Card("Diamonds", "4", 4));
        billy.AddCard(new Card("Clubs", "5", 5));

        playBlackJack.ShowInformation(dealer, billy);

        lemmy.AddCard(new Card("Spades", "Ace", 11));
        lemmy.AddCard(new Card("Hearts", "7", 7));
        lemmy.AddCard(new Card("Diamonds", "Ace", 11));

        playBlackJack.ShowInformation(dealer, lemmy);

        andrew.AddCard(new Card("Diamonds", "King", 10));
        andrew.AddCard(new Card("Spades", "4", 4));
        andrew.AddCard(new Card("Clubs", "4", 4));

        playBlackJack.ShowInformation(dealer, andrew);

        carla.AddCard(new Card("Clubs", "Queen", 10));
        carla.AddCard(new Card("Spades", "6", 6));
        carla.AddCard(new Card("Diamonds", "9", 9));

        playBlackJack.ShowInformation(dealer, carla);
    }
}
