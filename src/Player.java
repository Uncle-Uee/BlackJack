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

public class Player extends Person {

    /* ---------- ---------- ---------- VARIABLES ---------- ---------- ----------  */

    public String Name;

    /* ---------- ---------- ---------- CONSTRUCTOR ---------- ---------- ----------  */

    public Player(String Name) {
        this.Name = Name;
        this.Cards = new ArrayList<>();
        this.HandValue = 0;
    }
}
