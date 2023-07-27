package za.co.entelect.utility.math.config;


import za.co.entelect.utility.math.model.Bracket;

import java.util.ArrayList;
import java.util.List;

public class TaxLoader {
    public static List<Bracket> LoadTaxBrackets() {
        List<Bracket> brackets = new ArrayList();
        brackets.add(new Bracket(95750,0));
        brackets.add(new Bracket(237100,18));
        brackets.add(new Bracket(370500,26));
        brackets.add(new Bracket(512800,31));
        brackets.add(new Bracket(673000,36));
        brackets.add(new Bracket(857900,41));
        brackets.add(new Bracket(0,45));
        return brackets;
    }
}
