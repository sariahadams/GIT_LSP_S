package org.howard.edu.lsp.midterm.problem2;

public class Range {
    // Instance variables to store the start and end values of the range
    private int start;
    private int end;

    // Constructor to create a range with a specified start and end value
    public Range(int start, int end) {
        // Check if the start value is less than or equal to the end value
        if (start <= end) {
            // Assign the values to the instance variables
            this.start = start;
            this.end = end;
        } else {
            // Throw an exception if the start value is greater than the end value
            throw new IllegalArgumentException("Start value must be less than or equal to end value");
        }
    }

    // Method to check if a given value is contained within the range
    public boolean contains(int value) {
        // Return true if the value is greater than or equal to the start value and less than or equal to the end value
        return (value >= start && value <= end);
    }

    // Method to check if two ranges overlap with each other
    public boolean overlaps(Range other) {
        // Return true if either of the following conditions are true:
        // - The start value of this range is contained within the other range
        // - The end value of this range is contained within the other range
        // - The start value of the other range is contained within this range
        // - The end value of the other range is contained within this range
        return (this.contains(other.start) || this.contains(other.end) || other.contains(this.start) || other.contains(this.end));
    }

    // Method to return the size of the range, which is the difference between the end and start values plus one
    public int size() {
        return (end - start + 1);
    }

    // Method to return a string representation of the range in the format "[start, end]"
    public String toString() {
        return ("[" + start + ", " + end + "]");
    }
}

