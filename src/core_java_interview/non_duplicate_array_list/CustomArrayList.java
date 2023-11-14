package core_java_interview.non_duplicate_array_list;

import java.util.ArrayList;

public class CustomArrayList extends ArrayList {
    @Override
    public boolean add(Object o) {
        if (this.contains(o)) {
            return true;
        } else {
            return super.add(o);
        }
    }

    public static void main(String[] args) {
        CustomArrayList cal = new CustomArrayList();
        cal.add(1);
        cal.add(1);
        cal.add(2);
        System.out.println(cal);
    }
}
