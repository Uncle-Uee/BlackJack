public class BlackJackRules {

    private boolean FiveCardWin(Person person) {
        return person.Cards.size() >= 5 && person.HandValue <= 21;
    }

    private boolean BeatDealer(Person dealer, Person person) {
        return person.HandValue >= dealer.HandValue && person.HandValue <= 21;
    }

    private boolean Bust(Person person) {
        return person.HandValue > 21;
    }

    private boolean DealerWins(Person dealer, Person person) {
        return dealer.HandValue > person.HandValue;
    }

    public String WinOrLose(Person dealer, Person person) {
        return FiveCardWin(person) || BeatDealer(dealer, person) || !Bust(person) && !DealerWins(dealer, person)
                ? "Beats Dealer" : "Loses";
    }
}
