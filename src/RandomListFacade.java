import java.util.List;
import java.util.Random;

public class RandomListFacade {
    private RandomList randomList;
    private ListFilter listFilter;
    private ListPrinter listPrinter;
    public RandomListFacade() {
        randomList = new RandomList();
        listFilter = new ListFilter();
        listPrinter = new ListPrinter();
    }
    public void printRandomEvenList(){
        //Tao danh sach ngau nhien
        List<Integer> randomNumbers = randomList.generateList(10, 1, 5);
        //Loc cac so le
        List<Integer> evenNumbers = listFilter.filterOdd(randomNumbers);
        //In ra cac so chan
        listPrinter.printList(evenNumbers);
    }
}
