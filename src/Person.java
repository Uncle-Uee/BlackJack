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

import java.util.*;

public abstract class Person {

    /* ---------- ---------- ---------- VARIABLES ---------- ---------- ----------  */

    public ArrayList<Card> Cards;
    public int HandValue;

    /* ---------- ---------- ---------- PERSON METHODS ---------- ---------- ----------  */

    public void AddCard(Card card) {
        if (card.Name.equalsIgnoreCase("Ace") && this.HandValue + card.Value > 21) {
            card.Value = 1;
            this.HandValue += card.Value;
        } else {
            this.HandValue += card.Value;
        }
        this.Cards.add(card);
    }

    public void ShowCards() {
        for (Card card : this.Cards) {
            System.out.println(card.Name + " of " + card.Suit);
        }
    }
}
