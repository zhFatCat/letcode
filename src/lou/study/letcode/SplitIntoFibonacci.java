package lou.study.letcode;

import java.util.ArrayList;
import java.util.List;

public class SplitIntoFibonacci {
    private int nextIndex = 0;
    List<Integer> result = new ArrayList<Integer>();

    public List<Integer> splitIntoFibonacci(String str) {
        int length = str.length();

        if (length < 3) {
            return result;
        }
        List<Integer> intArray = new ArrayList<Integer>(length);
        for (int i = 0; i < length; i++) {
            intArray.add(Integer.parseInt(str.substring(i, i + 1)));
        }
        if (intArray.get(0) != 0) {
            for (int i = 0; i <= length - 3; i++) {
                int first = 0;
                for (int j = 0; j <= i; j++) {
                    first = first * 10 + intArray.get(j);
                }
                nextIndex = i + 1;

                if (intArray.get(i + 1) != 0) {
                    for (int k = i + 1; k <= length - 2; k++) {
                        int second = 0;
                        result.clear();
                        result.add(first);
                        for (int l = i + 1; l <= k; l++) {
                            second = second * 10 + intArray.get(l);
                        }
                        nextIndex = k + 1;

                        result.add(second);
                        while (nextIndex <= length - 1 && addNext(nextIndex, intArray, result.get(result.size() - 1) + result.get(result.size() - 2))) {
                            if (nextIndex == length) {
                                return result;
                            }
                        }
                    }
                } else {
                    result.clear();
                    result.add(first);
                    result.add(0);
                    nextIndex++;
                    while (nextIndex <= length - 1 && addNext(nextIndex, intArray, result.get(result.size() - 1) + result.get(result.size() - 2))) {
                        if (nextIndex == length) {
                            return result;
                        }
                    }
                }
            }
        } else {
            nextIndex = 1;
            if (intArray.get(1) != 0) {
                for (int k = 1; k <= length - 2; k++) {
                    int second = 0;
                    result.clear();
                    result.add(0);
                    for (int l = 1; l <= k; l++) {
                        second = second * 10 + intArray.get(l);
                    }
                    nextIndex = k + 1;

                    result.add(second);
                    while (nextIndex <= length - 1 && addNext(nextIndex, intArray, result.get(result.size() - 1) + result.get(result.size() - 2))) {
                        if (nextIndex == length) {
                            return result;
                        }
                    }
                }
            } else {
                result.clear();
                result.add(0);
                result.add(0);
                nextIndex++;
                while (nextIndex <= length - 1 && addNext(nextIndex, intArray, result.get(result.size() - 1) + result.get(result.size() - 2))) {
                    if (nextIndex == length) {
                        return result;
                    }
                }
            }
        }
        return new ArrayList<Integer>();
    }

    private boolean addNext(int start, List<Integer> intArray, int target) {
        if (intArray.get(start) == 0) {
            if (target == 0) {
                nextIndex++;
                result.add(0);
                return true;
            }
            return false;
        }
        int nextInt = 0;
        for (int m = start; m <= intArray.size() - 1; m++) {
            nextInt = nextInt * 10 + intArray.get(m);
            if (nextInt == target) {
                nextIndex = m + 1;
                result.add(nextInt);
                return true;
            } else if (nextInt > target) {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] a) {
        System.out.print(new SplitIntoFibonacci().splitIntoFibonacci("0000"));
    }
}

