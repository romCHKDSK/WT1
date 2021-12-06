package assignment;

import java.util.List;
import java.util.LinkedList;

public final class Z8 extends Z {
    public static List<Integer> getInsertionPositions(double[] a, double[] b) {
        List<Integer> insPositions = new LinkedList<>();
        
        int insIndex = 0;
        int bIndex = 0;
        for (int aIndex = 0; aIndex < a.length; aIndex++) {
            while (b[bIndex] <= a[aIndex]) {
                insPositions.add(insIndex++);
                bIndex++;
                if (bIndex >= b.length)
                    return insPositions;
            }
            insIndex++;
        }

        return insPositions;
    }
}