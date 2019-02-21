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

public class Dealer extends Person {

    /* ---------- ---------- ---------- VARIABLES ---------- ---------- ----------  */

    public String Name = "Dealer";

    /* ---------- ---------- ---------- CONSTRUCTOR ---------- ---------- ----------  */

    public Dealer() {
        this.Cards = new ArrayList<>();
        this.HandValue = 0;
    }
}
