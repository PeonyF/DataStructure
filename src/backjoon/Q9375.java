package backjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q9375 {
    public static void main(String[] args) {

        PassionKing passionKing = new PassionKing();
        Scanner sc = new Scanner(System.in);
        int inputCountTC = sc.nextInt();

        for (int i = 0; i < inputCountTC; i++) {
            int inputCountCloths = sc.nextInt();

            for (int j = 0; j < inputCountCloths; j++) {

                String clothName = sc.next();
                String clothType = sc.next();

                passionKing.addNumOfCloths(clothType);
            }
            int result = passionKing.multipleEachClothTypes();
            System.out.println(result);
            passionKing.initHashMap();
        }
    }
}

class PassionKing {
    private static final int baseNumCloth = 1;
    private static final int naked = 1;

    private Map<String, Integer> clothsList = new HashMap<>();

    void addNumOfCloths(String clothType) {
        if (checkContainsKey(clothType)) {
            int numOfCloths = clothsList.get(clothType);
            clothsList.put(clothType, numOfCloths + baseNumCloth);
        }
        if (!checkContainsKey(clothType)) {
            clothsList.put(clothType, baseNumCloth);
        }
    }

    private boolean checkContainsKey(String clothType) {
        return clothsList.containsKey(clothType);
    }

    void initHashMap() {
        clothsList.clear();
    }


    int multipleEachClothTypes() {
        int result = baseNumCloth;
        for (int cloth : clothsList.values()) {
            result *= cloth + baseNumCloth;
        }
        return result - naked;
    }

}
