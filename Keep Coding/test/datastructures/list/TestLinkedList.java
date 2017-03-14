package datastructures.list;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestLinkedList {

	LinkedList<Integer> l;

	@Before
	public void setUp() throws Exception {
		l = new LinkedList<Integer>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsert() {
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		
		assertEquals(5, l.getSize());
		System.out.println(l);
	}
	
	@Test
	public void testGet() {
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		
		assertEquals((Integer)1, l.get(0));
		System.out.println(l);
	}

	@Test
	public void testInsertNth() {
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		l.insert(0,5);
		
		
		assertEquals(6, l.getSize());
		assertEquals((Integer)5, l.get(0));
		
		l.insert(6,6);
		assertEquals(7, l.getSize());
		assertEquals((Integer)6, l.get(6));
		System.out.println(l);
		
		l.insert(7,7);
		assertEquals(8, l.getSize());
		assertEquals((Integer)7, l.get(7));
		System.out.println(l);
	}
	
	@Test
	public void testRemove() {
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		
		l.remove(0);
		assertEquals(4, l.getSize());
		assertEquals((Integer)2, l.get(0));
		
		l.remove(3);
		assertEquals(3, l.getSize());
		assertEquals((Integer)4, l.get(2));
		
		l.remove(1);
		assertEquals(2, l.getSize());
		assertEquals((Integer)4, l.get(1));
		System.out.println(l);
	}
	
	@Test
	public void testReverseI() {
		l.insert(1);
		l.reverseI();
		assertEquals(1, l.getSize());
		assertEquals((Integer)1, l.get(0));
		
		l.insert(2);
		l.reverseI();
		assertEquals(2, l.getSize());
		assertEquals((Integer)2, l.get(0));
		
		l.insert(3);
		System.out.println(l);
		l.reverseI();
		System.out.println(l);
		assertEquals(3, l.getSize());
		assertEquals((Integer)3, l.get(0));
		
		
	}
	
	
}
