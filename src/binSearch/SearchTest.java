package binSearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchTest 
{

	@Test
	public void emptyArrayTest()
	{
		assertNull(BinSearch.search(new int[0], 0));
	}
	
	@Test
	public void notFoundTest()
	{
		int[] array = {1};
		assertNull(BinSearch.search(array, 0));
		assertNull(BinSearch.search(array, 3));
		
        array = new int[] {1,2,4,5};
		assertNull(BinSearch.search(array, 0));
		assertNull(BinSearch.search(array, 3));
		assertNull(BinSearch.search(array, 6));
	}
	
	@Test
	public void strictTest()
	{
		int[] array = {0, 10, 20, 30, 40};
		assertEquals(new Pair(4, 4), BinSearch.search(array, 40));
		assertEquals(new Pair(2, 2), BinSearch.search(array, 20));
		assertEquals(new Pair(0, 0), BinSearch.search(array,  0));
	}
	
	@Test
	public void severalMatchesTest()
	{
		assertEquals(new Pair(0, 3), BinSearch.search(new int[] {0, 0, 0, 0}, 0));
		assertEquals(new Pair(0, 3), BinSearch.search(new int[] {0, 0, 0, 0, 1, 1}, 0));
		assertEquals(new Pair(0, 3), BinSearch.search(new int[] {0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, 0));
		assertEquals(new Pair(1, 3), BinSearch.search(new int[] {0, 1, 1, 1}, 1));
		assertEquals(new Pair(5, 7), BinSearch.search(new int[] {0, 0, 0, 0, 0, 1, 1, 1}, 1));
		assertEquals(new Pair(1, 3), BinSearch.search(new int[] {0, 1, 1, 1, 2, 2, 2, 2, 2, 2}, 1));
		assertEquals(new Pair(5, 7), BinSearch.search(new int[] {0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2}, 1));
	}
	
}
