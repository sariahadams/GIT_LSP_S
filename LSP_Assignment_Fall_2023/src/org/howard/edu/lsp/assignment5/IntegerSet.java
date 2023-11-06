
/*
 * Sariah Adams
 */

package org.howard.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class IntegerSet {
    // Creating ArrayList to store the set
    private List<Integer> set = new ArrayList<Integer>();

    /**
     * Default constructor for IntegerSet class
     */
    public IntegerSet() {
    }

    /**
     * Clearing the internal representation of a set
     */
    public void clear() {
        set.clear();
    }

    /**
     * Getting the length of the internal set
     *
     * @return number of elements in the current set
     */
    public int length() {
        return set.size();
    }

    /**
     *
     * Returns true if the two sets are equal, false otherwise; Two sets are equal if
     * they contain all of the same values in ANY order.
     *
     */
    public boolean equals(IntegerSet first_Set) {
        List<Integer> fSet = first_Set.getSet();

        // Check if the sizes of the sets are equal
        if (set.size() != fSet.size()) {
            return false;
        }

        // Sorting the lists before comparison
        Collections.sort(set);
        Collections.sort(fSet);

        // Checking if lists are equal using equals() method
        return set.equals(fSet);
    }

    /**
     * Returns true if the set contains the value, otherwise false
     *
     * @param value to be checked if present in set
     * @return true if the set contains the value, otherwise false
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest item in the set;
     *
     * @return value of the largest item in the set
     * @throws IntegerSetException if the set is empty
     */
    public int largest() throws IntegerSetException {
        if (isEmpty()) {
            throw new IntegerSetException("Error: Set is empty");
        }

        int max = Collections.max(set);
        return max;
    }

    /**
     * Returns the smallest item in the set
     *
     * @return value of the smallest item in the set
     * @throws IntegerSetException if the set is empty
     */
    public int smallest() throws IntegerSetException {
        if (isEmpty()) {
            throw new IntegerSetException("Error: Set is empty");
        }

        int min = Collections.min(set);
        return min;
    }

    /**
     * Adds an item to the set or does nothing if already there
     *
     * @param item to be added to set
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an item from the set or does nothing if not there
     *
     * @param item to be removed
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item)); // ignored if item is not there
    }

    /**
     * Gets the union of two sets and store the union in the set of the object that
     * called the method
     *
     * @param intSetb, an Object of class IntegerSet
     */
    public void union(IntegerSet intSetf) {
        List<Integer> fSet = intSetf.getSet();
        for (int value : fSet) {
            if (!set.contains(value)) {
                set.add(value);
            }
        }
    }

    /**
     * Gets intersection of two sets and store the intersection in the set of object
     * that called the method
     *
     * @param intSetb, an Object of class IntegerSet
     */
    public void intersect(IntegerSet intSetb) {
        List<Integer> bSet = intSetb.getSet();
        set.retainAll(bSet);
    }

    /**
     * Gets the difference of two sets and store the difference in the set of the
     * object that called the method. Set difference, i.e., s1 –s2
     *
     * @param intSetb, an Object of class IntegerSet
     */
    public void diff(IntegerSet intSetb) {
        List<Integer> bSet = intSetb.getSet();
        set.removeAll(bSet);
    }

    /**
     * Checking if the set is empty
     *
     * @return true if the set is empty, false otherwise
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Converting ArrayList to String
     *
     * @return String representation of set
     */
    public String toString() {
        return set.toString();
    }

    /**
     * Get the set with whitespace between values in string format
     *
     * @return set in string format without "[" and "]"
     */
    private List<Integer> getSet() {
        return set;
    }

	public void complement(IntegerSet setB) {
		// TODO Auto-generated method stub
		
	}
}

class IntegerSetException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IntegerSetException(String message) {
		super(message);
	}
}
	

