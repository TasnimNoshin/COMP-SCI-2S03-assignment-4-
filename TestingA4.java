package cs2s03;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestingA4 {

	private ListChar lc;
	private StackChar sc;
	private SnocQueue sq;
	private AListPQueue apq;

	////////////////////TESTS FOR ListChar()////////////////////////

	//throws exception EmptyContainerException

	@Test (expected = EmptyContainerException.class) 
	public void ListChar1() throws EmptyContainerException{
		lc = new ListChar();
		lc.top();
	}

	@Test (expected = EmptyContainerException.class) 
	public void ListChar2() throws EmptyContainerException{
		lc = new ListChar();
		lc.push('c');
		lc.pop();
		lc.top();
	}

	@Test (expected = EmptyContainerException.class) 
	public void ListChar3() throws EmptyContainerException{
		lc = new ListChar();
		lc.push('\0');
		lc.top();
	}

	//sequences of 15 operations

	@Test 
	public void ListChar4() throws EmptyContainerException{
		lc = new ListChar();
		lc.push('s');
		lc.push('t');
		lc.push('r');
		lc.push('i');
		lc.push('n');
		lc.push('g');
		lc.top();
		lc.pop();
		lc.pop();
		lc.pop();
		lc.pop();
		lc.pop();
		lc.pop();
		lc.isEmpty();
		lc.push('l');
		assertEquals(lc.toString(), "ListChar l");
	}

	@Test
	public void ListChar5() throws EmptyContainerException{
		lc = new ListChar();
		lc.push('k');
		lc.push('n');
		lc.push('i');
		lc.push('f');
		lc.push('e');
		lc.push('t');
		lc.isEmpty();
		lc.top();
		lc.pop();
		lc.pop();
		lc.pop();
		lc.pop();
		lc.pop();
		lc.top();
		lc.push('o');
		assertEquals(lc.toString(), "ListChar ok");
	}

	@Test
	public void ListChar6() throws EmptyContainerException{
		lc = new ListChar();
		lc.push('a');
		lc.push('l');
		lc.pop();
		lc.top();
		lc.push('n');
		lc.push('z');
		lc.isEmpty();
		lc.top();
		lc.pop();
		lc.top();
		lc.isEmpty();
		lc.push('j');
		lc.pop();
		lc.top();
		lc.push('p');
		assertEquals(lc.toString(), "ListChar pna");
	}

	//random 4 tests

	@Test
	public void ListChar7() throws EmptyContainerException{
		lc = new ListChar();
		lc.push('a');
		lc.push('l');
		lc.pop();
		lc.top();
		lc.isEmpty();
		lc.top();
		lc.push('r');
		lc.top();
		lc.isEmpty();
		lc.push('j');
		lc.top();
		lc.push('p');
		assertEquals(lc.toString(), "ListChar pjra");
	}

	@Test
	public void ListChar8() throws EmptyContainerException{
		lc = new ListChar();
		lc.push('m');
		lc.top();
		lc.isEmpty();
		lc.push('b');
		lc.pop();
		lc.push('k');
		assertEquals(lc.toString(), "ListChar km");
	}

	@Test
	public void ListChar9() throws EmptyContainerException{
		lc = new ListChar();
		lc.push('i');
		lc.isEmpty();
		lc.push('l');
		lc.top();
		assertEquals(lc.toString(), "ListChar li");
	}

	@Test
	public void ListChar10() throws EmptyContainerException{
		lc = new ListChar();
		lc.push('a');
		lc.push('p');
		lc.pop();
		lc.top();
		lc.isEmpty();
		lc.top();
		lc.push('p');
		lc.top();
		lc.isEmpty();
		lc.push('l');
		lc.top();
		lc.push('e');
		assertEquals(lc.toString(), "ListChar elpa");
	}



	////////////////////TESTS FOR SnocQueue()////////////////////////

	//throws exception EmptyContainerException

	@Test (expected = EmptyContainerException.class) 
	public void SnocQueue1() throws EmptyContainerException{
		sq = new SnocQueue();
		sq.peek();
	}

	@Test (expected = EmptyContainerException.class)
	public void SnocQueue2() throws EmptyContainerException{
		sq = new SnocQueue();
		sq.enqueue('c');
		sq.dequeue();
		sq.peek();
	}

	@Test (expected = EmptyContainerException.class)
	public void SnocQueue3() throws EmptyContainerException{
		sq = new SnocQueue();
		sq.enqueue('\0');
		sq.peek();
	}

	//sequences of 15 operations

	@Test 
	public void SnocQueue4() throws EmptyContainerException{
		sq = new SnocQueue();
		sq.enqueue('s');
		sq.enqueue('t');
		sq.enqueue('r');
		sq.enqueue('i');
		sq.enqueue('n');
		sq.enqueue('g');
		sq.peek();
		sq.dequeue();
		sq.dequeue();
		sq.dequeue();
		sq.dequeue();
		sq.dequeue();
		sq.dequeue();
		sq.isEmpty();
		sq.enqueue('l');
		assertEquals(sq.toString(), "SnocQueue l SnocList");
	}

	@Test
	public void SnocQueue5() throws EmptyContainerException{
		sq = new SnocQueue();
		sq.enqueue('k');
		sq.enqueue('n');
		sq.enqueue('i');
		sq.enqueue('f');
		sq.enqueue('e');
		sq.enqueue('t');
		sq.isEmpty();
		sq.peek();
		sq.dequeue();
		sq.dequeue();
		sq.dequeue();
		sq.dequeue();
		sq.dequeue();
		sq.peek();
		sq.enqueue('o');
		assertEquals(sq.toString(), "SnocQueue ot SnocList");
	}

	@Test
	public void SnocQueue6() throws EmptyContainerException{
		sq = new SnocQueue();
		sq.enqueue('a');
		sq.enqueue('l');
		sq.dequeue();
		sq.peek();
		sq.enqueue('n');
		sq.enqueue('z');
		sq.isEmpty();
		sq.peek();
		sq.dequeue();
		sq.peek();
		sq.isEmpty();
		sq.enqueue('j');
		sq.dequeue();
		sq.peek();
		sq.enqueue('p');
		assertEquals(sq.toString(), "SnocQueue pjz SnocList");
	}

	//random 4 tests

	@Test
	public void SnocQueue7() throws EmptyContainerException{
		sq = new SnocQueue();
		sq.enqueue('a');
		sq.enqueue('l');
		sq.dequeue();
		sq.peek();
		sq.isEmpty();
		sq.peek();
		sq.enqueue('r');
		sq.peek();
		sq.isEmpty();
		sq.enqueue('j');
		sq.peek();
		sq.enqueue('p');
		assertEquals(sq.toString(), "SnocQueue pjrl SnocList");
	}

	@Test
	public void SnocQueue8() throws EmptyContainerException{
		sq = new SnocQueue();
		sq.enqueue('m');
		sq.peek();
		sq.isEmpty();
		sq.enqueue('b');
		sq.dequeue();
		sq.enqueue('k');
		assertEquals(sq.toString(), "SnocQueue kb SnocList");
	}

	@Test
	public void SnocQueue9() throws EmptyContainerException{
		sq = new SnocQueue();
		sq.enqueue('i');
		sq.isEmpty();
		sq.enqueue('l');
		sq.peek();
		assertEquals(sq.toString(), "SnocQueue li SnocList");
	}

	@Test
	public void SnocQueue10() throws EmptyContainerException{
		sq = new SnocQueue();
		sq.enqueue('a');
		sq.enqueue('p');
		sq.dequeue();
		sq.peek();
		sq.isEmpty();
		sq.peek();
		sq.enqueue('p');
		sq.peek();
		sq.isEmpty();
		sq.enqueue('l');
		sq.peek();
		sq.enqueue('e');
		assertEquals(sq.toString(), "SnocQueue elpp SnocList");
	}

	////////////////////TESTS FOR StackChar()////////////////////////

	//throws exception EmptyContainerException

	@Test (expected = EmptyContainerException.class)
	public void StackChar1() throws EmptyContainerException{
		sc = new StackChar();
		sc.top();
	}

	@Test (expected = EmptyContainerException.class)
	public void StackChar2() throws EmptyContainerException{
		sc = new StackChar();
		sc.push('c');
		sc.pop();
		sc.top();
	}

	@Test (expected = EmptyContainerException.class)
	public void StackChar3() throws EmptyContainerException{
		sc = new StackChar();
		sc.push('c');
		sc.pop();
		sc.push('d');
		sc.pop();
		sc.top();
	}

	//sequences of 15 operations

	@Test 
	public void StackChar4() throws EmptyContainerException{
		sc = new StackChar();
		sc.push('s');
		sc.push('t');
		sc.push('r');
		sc.push('i');
		sc.push('n');
		sc.push('g');
		sc.top();
		sc.pop();
		sc.pop();
		sc.pop();
		sc.pop();
		sc.pop();
		sc.pop();
		sc.isEmpty();
		sc.push('l');
		assertEquals(sc.toString(), "StackChar [l]");
	}

	@Test
	public void StackChar5() throws EmptyContainerException{
		sc = new StackChar();
		sc.push('k');
		sc.push('n');
		sc.push('i');
		sc.push('f');
		sc.push('e');
		sc.push('t');
		sc.isEmpty();
		sc.top();
		sc.pop();
		sc.pop();
		sc.pop();
		sc.pop();
		sc.pop();
		sc.top();
		sc.push('o');
		assertEquals(sc.toString(), "StackChar [o, k]");
	}

	@Test
	public void StackChar6() throws EmptyContainerException{
		sc = new StackChar();
		sc.push('a');
		sc.push('l');
		sc.pop();
		sc.top();
		sc.push('n');
		sc.push('z');
		sc.isEmpty();
		sc.top();
		sc.pop();
		sc.top();
		sc.isEmpty();
		sc.push('j');
		sc.pop();
		sc.top();
		sc.push('p');
		assertEquals(sc.toString(), "StackChar [p, n, a]");
	}

	//random 4 tests

	@Test
	public void StackChar7() throws EmptyContainerException{
		sc = new StackChar();
		sc.push('a');
		sc.push('l');
		sc.pop();
		sc.top();
		sc.isEmpty();
		sc.top();
		sc.push('r');
		sc.top();
		sc.isEmpty();
		sc.push('j');
		sc.top();
		sc.push('p');
		assertEquals(sc.toString(), "StackChar [p, j, r, a]");
	}

	@Test
	public void StackChar8() throws EmptyContainerException{
		sc = new StackChar();
		sc.push('m');
		sc.top();
		sc.isEmpty();
		sc.push('b');
		sc.pop();
		sc.push('k');
		assertEquals(sc.toString(), "StackChar [k, m]");
	}

	@Test
	public void StackChar9() throws EmptyContainerException{
		sc = new StackChar();
		sc.push('i');
		sc.isEmpty();
		sc.push('l');
		sc.top();
		assertEquals(sc.toString(), "StackChar [l, i]");
	}

	@Test
	public void StackChar10() throws EmptyContainerException{
		sc = new StackChar();
		sc.push('a');
		sc.push('p');
		sc.pop();
		sc.top();
		sc.isEmpty();
		sc.top();
		sc.push('p');
		sc.top();
		sc.isEmpty();
		sc.push('l');
		sc.top();
		sc.push('e');
		assertEquals(sc.toString(), "StackChar [e, l, p, a]");
	}

	////////////////////TESTS FOR AListPQueue()////////////////////////

	//throws exception EmptyContainerException

	@Test (expected = EmptyContainerException.class)
	public void AListPQueue1() throws EmptyContainerException{
		apq = new AListPQueue();
		apq.next();
	}

	@Test (expected = EmptyContainerException.class)
	public void AListPQueue2() throws EmptyContainerException{
		apq = new AListPQueue();
		apq.insertItem(0, 'c');
		apq.deleteItem();
		apq.next();
	}

	@Test (expected = EmptyContainerException.class)
	public void AListPQueue3() throws EmptyContainerException{
		apq = new AListPQueue();
		apq.insertItem(0,'\0');
		apq.next();
	}

	//sequences of 15 operations

	@Test 
	public void AListPQueue4() throws EmptyContainerException{
		apq = new AListPQueue();
		apq.insertItem(0, 's');
		apq.insertItem(0, 't');
		apq.insertItem(0, 'r');
		apq.insertItem(0, 'i');
		apq.insertItem(0, 'n');
		apq.insertItem(0, 'g');
		apq.next();
		apq.deleteItem();
		apq.deleteItem();
		apq.deleteItem();
		apq.deleteItem();
		apq.deleteItem();
		apq.deleteItem();
		apq.isEmpty();
		apq.insertItem(0,'l');
		assertEquals(apq.toString(), "AListPQueue  AList l0");
	}

	@Test
	public void AListPQueue5() throws EmptyContainerException{
		apq = new AListPQueue();
		apq.insertItem(0,'k');
		apq.insertItem(2,'n');
		apq.insertItem(5,'i');
		apq.insertItem(3,'f');
		apq.insertItem(10,'e');
		apq.insertItem(20,'t');
		apq.isEmpty();
		apq.next();
		apq.deleteItem();
		apq.deleteItem();
		apq.deleteItem();
		apq.deleteItem();
		apq.deleteItem();
		apq.next();
		apq.insertItem(31,'o');
		assertEquals(apq.toString(), "AListPQueue  AList o31k0");
	}

	@Test
	public void AListPQueue6() throws EmptyContainerException{
		apq = new AListPQueue();
		apq.insertItem(9,'a');
		apq.insertItem(3,'l');
		apq.deleteItem();
		apq.next();
		apq.insertItem(4,'n');
		apq.insertItem(6,'z');
		apq.isEmpty();
		apq.next();
		apq.deleteItem();
		apq.next();
		apq.isEmpty();
		apq.insertItem(8,'j');
		apq.deleteItem();
		apq.next();
		apq.insertItem(9,'p');
		assertEquals(apq.toString(), "AListPQueue  AList p9n4l3");
	}

	//random 4 tests

	@Test
	public void AListPQueue7() throws EmptyContainerException{
		apq = new AListPQueue();
		apq.insertItem(3,'a');
		apq.insertItem(4,'l');
		apq.deleteItem();
		apq.next();
		apq.isEmpty();
		apq.next();
		apq.insertItem(3,'r');
		apq.next();
		apq.isEmpty();
		apq.insertItem(0, 'j');
		apq.next();
		apq.insertItem(0,'p');
		assertEquals(apq.toString(), "AListPQueue  AList a3r3j0p0");
	}

	@Test
	public void AListPQueue8() throws EmptyContainerException{
		apq = new AListPQueue();
		apq.insertItem(0,'m');
		apq.next();
		apq.isEmpty();
		apq.insertItem(0,'b');
		apq.deleteItem();
		apq.insertItem(0,'k');
		assertEquals(apq.toString(), "AListPQueue  AList k0m0");
	}

	@Test
	public void AListPQueue9() throws EmptyContainerException{
		apq = new AListPQueue();
		apq.insertItem(9,'i');
		apq.isEmpty();
		apq.insertItem(9,'l');
		apq.next();
		assertEquals(apq.toString(), "AListPQueue  AList i9l9");
	}

	@Test
	public void AListPQueue10() throws EmptyContainerException{
		apq = new AListPQueue();
		apq.insertItem(3,'a');
		apq.insertItem(5,'p');
		apq.deleteItem();
		apq.next();
		apq.isEmpty();
		apq.next();
		apq.insertItem(11,'p');
		apq.next();
		apq.isEmpty();
		apq.insertItem(3,'l');
		apq.next();
		apq.insertItem(0,'e');
		assertEquals(apq.toString(), "AListPQueue  AList p11a3l3e0");
	}

}
