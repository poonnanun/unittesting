import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListUtilTest {
	
	/**
	 * Test border element 1,0.
	 */
	@Test
	public void borderElementTest() {
		// 1 element test.
		List<Object> temp = new ArrayList<>();
		temp.add((Object)1);
		assertEquals(1,ListUtil.countUnique(temp));
		
		// No element test.
		temp = new ArrayList<>();
		assertEquals(0,ListUtil.countUnique(temp));
	}
	
	/**
	 * Test null element.
	 */
	@Test(expected = IllegalArgumentException.class) 
	public void nullElementTest() {
		List<Object> temp = null;
		ListUtil.countUnique(temp);
	}
	
	/**
	 * Test huge element.
	 */
	@Test
	public void hugeListTest() {
		// 100 thousand elements test.
		List<Object> temp = new ArrayList<>();
		for(int i=0; i<1000 ; i++) {
			for(int j=0; j<100; j++) {
				temp.add(i);
			}
		}
		assertEquals(1000,ListUtil.countUnique(temp));
		
		// Same 100 elements test.
		List<Object> temp1 = new ArrayList<>();
		for(int i=0; i<100 ; i++) {
			temp1.add(1);
		}
		assertEquals(1,ListUtil.countUnique(temp1));
		
		// Unique 100 elements test.
		List<Object> temp2 = new ArrayList<>();
		for(int i=0; i<100 ; i++) {
			temp2.add(i);
		}
		assertEquals(100,ListUtil.countUnique(temp2));
	}
	

	
}
