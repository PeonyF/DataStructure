package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1302 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BestSeller bestSeller = new BestSeller();
        int countSoldBooks = Integer.parseInt(br.readLine());

        for (int i = 0; i < countSoldBooks; i++) {
            String bookName = br.readLine();
            bestSeller.addBook(bookName);
        }

        String bestSellerBook = bestSeller.getBookName();
        System.out.println(bestSellerBook);
    }
}

class BestSeller {
    private static final int baseBook = 1;

    private Map<String, Integer> bookMap = new HashMap<>();
    private int tmpValue;
    private String bestSellerBookKey = "";
    private int bestSellerBookValue = 0;

    void addBook(String bookName) {
        if (checkContainsBook(bookName)) {
            int countBook = bookMap.get(bookName);
            bookMap.put(bookName, countBook + baseBook);
        }
        if (!checkContainsBook(bookName)) {
            bookMap.put(bookName, baseBook);
        }
    }

    private boolean checkContainsBook(String bookName) {
        return bookMap.containsKey(bookName);
    }

    String getBookName() {
        for (String key : bookMap.keySet()) {
            tmpValue = bookMap.get(key);
            toFindBestSellerBook(key);
        }
        return  bestSellerBookKey;
    }

    private void toFindBestSellerBook(String key) {
        if (bestSellerBookValue == tmpValue &&  bestSellerBookKey.compareTo(key) > 0) {
            bestSellerBookKey = key;
            bestSellerBookValue = tmpValue;
        }
        if (bestSellerBookValue < tmpValue) {
            bestSellerBookKey = key;
            bestSellerBookValue = tmpValue;
        }
    }
}
