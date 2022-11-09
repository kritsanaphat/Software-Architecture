

import java.util.Comparator;
import java.util.List;

public class HeightSortStrategy implements SortStrategy {
    @Override
    public void customSort(List<Person> people) {
        // YOU ARE NOT ALLOWED TO MODIFY THE CODE ABOVE THIS COMMENT !!
        // YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!
        Comparator<Person> heightComparator = new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getHeight() - o2.getHeight();
            }};
        people.sort(heightComparator);
    }

}
