package thread.threads;

import java.util.ArrayList;
import java.util.List;

public class Find implements Runnable {
    private List<Integer> singleList , doubleList , checkList;
    private int threadId;

    public Find(List<Integer> list , int threadId){
        this.singleList = new ArrayList<>();
        this.doubleList = new ArrayList<>();
        this.checkList = list;
        this.threadId = threadId;
    }

    @Override
    public void run() {
        System.out.println("Thread "+threadId+" Çalışıyor....");
        for(int i : checkList){
            if(i%2 == 0){
                doubleList.add(i);
                System.out.println("Thread "+threadId+" Çift Sayı Buldu : "+i);
            }else{
                System.out.println("Thread "+threadId+" Tek Sayı Buldu : "+i);
                singleList.add(i);
            }
        }
    }
}
