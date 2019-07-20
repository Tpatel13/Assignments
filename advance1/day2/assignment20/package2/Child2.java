package advance1.day2.assignment20.package2;

import advance1.day2.assignment20.package1.*;

public class Child2 extends Base{
    public void getValues() {
        Base base=new Base();
        System.out.println (variable3); // Line 1
        System.out.println (base.variable3); // Line 2
        System.out.println (variable4);
    }

}
