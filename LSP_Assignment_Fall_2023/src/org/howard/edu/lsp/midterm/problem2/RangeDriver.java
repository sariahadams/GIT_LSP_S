package org.howard.edu.lsp.midterm.problem2;

public class RangeDriver {
    private int start;
    private int end;

    public RangeDriver(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public boolean isValueInRange(int value) {
        return value >= start && value <= end;
    }

    public boolean doRangesOverlap(RangeDriver otherRange) {
        return this.start <= otherRange.end && this.end >= otherRange.start;
    }

    public int size() {
        return end - start + 1;
    }

    public static void main(String[] args) {
        RangeDriver range1 = new RangeDriver(5, 10);
        RangeDriver range2 = new RangeDriver(8, 15);

        int testValue = 7;

        System.out.println("Is " + testValue + " in range? " + range1.isValueInRange(testValue));
        System.out.println("Do range1 and range2 overlap? " + range1.doRangesOverlap(range2));
        System.out.println("Size of range1: " + range1.size());
    }
}


