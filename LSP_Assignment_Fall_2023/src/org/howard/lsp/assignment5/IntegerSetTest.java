package org.howard.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntegerSetTest {

    private IntegerSet setA;
    private IntegerSet setB;

    @BeforeEach
    void setUp() {
        setA = new IntegerSet();
        setB = new IntegerSet();
    }

    @Test
    @DisplayName("Test for add method")
    void testAdd() {
    	setA.add(1);
		setA.add(2);
		setA.add(3);
		setA.add(4);
		setA.add(5); //set1 is [1,2,3,4,5]

		assertEquals(true, setA.contains(1)); //set1 is [1,2,3,4,5]
		assertEquals(false,setA.contains(0));
    }

    @Test
    @DisplayName("Test for Union")
    public void testUnion() {
    	setA.add(0);
		setA.add(1);
		setA.add(2);
		setA.add(3); //set1 is [0,1,2,3]
		setB.add(3);
		setB.add(4);
		setB.add(5); //set2 is [3,4,5]
		setA.union(setB); //set1 union is [0,1,2,3,4,5]
		assertEquals(true,setA.contains(5)); //set1.union(set2) is [0,1,2,3,4,5]
		assertEquals(false,setA.contains(6)); //set1.union(set2) is [0,1,2,3,4,5]
    }

    @Test
    @DisplayName("Test cases for Clear")
    void testClear() {
        setA.add(0);
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        assertEquals("[0, 1, 2, 3, 4]", setA.toString());
        setA.clear();
        assertEquals("[]", setA.toString());
    }
    
    @Test
    @DisplayName("Test for equals() method")
    void testEquals() {
    	setA.add(0);
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setB.add(0);
        setB.add(1);
        setB.add(2);
        setB.add(3);
        setB.add(4);
        assertEquals(true,setA.equals(setB));
        setB.remove(1); //removes 1 from set B
        assertEquals(false,setA.equals(setB));  
    }
    
    
    @Test
    @DisplayName("Test for smallest() method")
    void testSmallest() throws IntegerSetException{
    	setA.add(0);
    	setA.add(1);
    	setA.add(2);
    	setA.add(3); //setA is [0,1,2,3]
    	assertEquals(0, setA.smallest()); //setA.smallest() is 0
    	setA.remove(0); //set1 is [1,2,3]
    	assertEquals(1,setA.smallest());
    }
    
    @Test
	@DisplayName("Test for smallest() will throw exception")
	void testSmallestException() throws IntegerSetException{
		setA.add(0);
		setA.add(1);
		setA.add(2);
		setA.add(3); //setA is [0,1,2,3]
		setA.clear(); //setA is []
		assertThrows(IntegerSetException.class, () -> setA.smallest()); //setA.smallest() will throw an exception
	}
    
    @Test
    @DisplayName("Test for largest() method")
    void testLargest() throws IntegerSetException {
    	setA.add(0);
    	setA.add(5);
    	setA.add(10);
    	setA.add(3);
    	assertEquals(10, setA.largest()); //setA largest is 10
    	setA.remove(10); //setA becomes [0,5,3]
    	assertEquals(5, setA.largest()); //setA largest is 5 now	
    			
    }
    
    @Test
	@DisplayName("Test for largest() will throw exception")
	void testLargestException() throws IntegerSetException{
		setA.add(0);
		setA.add(1);
		setA.add(2);
		setA.add(3); //setA is [0,1,2,3]
		setA.clear(); //setA is []
		assertThrows(IntegerSetException.class, () -> setA.largest()); //setA.largest() will throw an exception
	}
    
    @Test
    @DisplayName("Test for isEmpty() method")
    void testIsEmpty() {
    	setA.add(0);
    	setA.add(2);
    	setA.add(3);
    	setA.add(5);
    	assertEquals(false,setA.isEmpty()); //setA isn't empty
    	setA.clear(); //setA is empty
    	assertEquals(true,setA.isEmpty()); //SetA is empty
    	
    }
    

    @Test
	@DisplayName("Test for complement() method")
	void testComplement(){
		setA.add(0);
		setA.add(1);
		setA.add(2);
		setA.add(3); //setA is [0,1,2,3]
		setB.add(0);
		setB.add(4);
		setB.add(5); //setB is [0,4,5]
		setA.complement(setB); //setA.complement(setB) is [1,2,3]
		assertEquals(true,setA.contains(3)); //set1.complement(setB) is [1,2,3]
		assertEquals(false,setA.contains(4));
	}
    
    @Test
	@DisplayName("Test for diff() method")
	void testDiff(){
		setA.add(0);
		setA.add(1);
		setA.add(2);
		setA.add(3); //setA is [0,1,2,3]
		setB.add(3);
		setB.add(4);
		setB.add(5); //setA is [3,4,5]
		setA.diff(setB);
		assertEquals(true,setA.contains(0)); //set1.diff(setB) is [0,1,2]
		assertEquals(false,setA.contains(3)); //set1.diff(setB) is [0,1,2]
	}
    
	@Test
	@DisplayName("Test for contains() method")
	void testContians(){
		setA.add(0);
		setA.add(1); //setA is [0,1]
		assertEquals(true,setA.contains(1)); //setA contains 1
		assertEquals(false,setA.contains(2)); //setB does not contain 2
	}
	
	@Test
	@DisplayName("Test for intersect() method")
	void testIntersect() {
		setA.add(0);
		setA.add(1);
		setA.add(2);
		setA.add(3);
		setB.add(3);
		setB.add(4);
		setB.add(5);
		setA.intersect(setB); //setA.intersect(setB) is [3]
		assertEquals(true,setA.contains(3)); //setA.intersect(setB) is [3]
		assertEquals(false,setA.contains(4));
	}
}

