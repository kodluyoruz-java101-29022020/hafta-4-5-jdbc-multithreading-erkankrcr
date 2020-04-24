package thread.utils;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {
    public static List<Integer> createTenThousandList(){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<=10000;i++){
            list.add(i);
        }
        return list;
    }

    public static List<List<Integer>> divideByFourList(List<Integer> list){
        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(list.subList(0,2500));
        resultList.add(list.subList(2500,5000));
        resultList.add(list.subList(5000,7500));
        resultList.add(list.subList(7500,10000));
        return resultList;
    }
}
