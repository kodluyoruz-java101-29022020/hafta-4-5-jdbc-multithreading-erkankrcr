package thread.main;

import thread.threads.Find;
import thread.utils.ListUtil;

import java.util.List;

public class Application {
    public static void main(String[] args) {
      List<List<Integer>> lists = ListUtil.divideByFourList(ListUtil.createTenThousandList());
      Thread findOne = new Thread(new Find(lists.get(0),0));
      Thread findTwo = new Thread(new Find(lists.get(1),1));
      Thread findThree = new Thread(new Find(lists.get(2),2));
      Thread findFour = new Thread(new Find(lists.get(3),3));
      findOne.start();
      findTwo.start();
      findThree.start();
      findFour.start();

    }
}
