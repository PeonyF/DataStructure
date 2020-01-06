package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int countSoldBooks = Integer.parseInt(br.readLine());
        for(int i=0; i<countSoldBooks; i++){

        }




        for (String key : bookMap.keySet()) {
            int value = bookMap.get(key);


            if (max == value && maxBook.compareTo(key) > 0) {
                maxBook = key;
                max = value;
            } else if (max < value) {
                maxBook = key;
                max = value;
            }
        }
        System.out.println(maxBook);

    }
}

class BestSeller {
    private static final int baseBook = 1;
    private Map<String, Integer> bookMap = new HashMap<>();
    String maxBook = "";
    int max = 0;

    public void addBook(String bookName){
        if (checkContainsBook(bookName)) {
            int countBook = bookMap.get(bookName);
            bookMap.put(bookName, countBook + baseBook);
        }
        if (!checkContainsBook(bookName)) {
            bookMap.put(bookName, baseBook);
        }
    }

    public boolean checkContainsBook(String bookName){
        return  bookMap.containsKey(bookName);
    }



}
