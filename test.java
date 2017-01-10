package cs2s03;

import static org.junit.Assert.assertEquals;

public class test {
	public static void main(String[] args) throws EmptyContainerException{
		//SnocList s = new SnocList('a', new SnocList('p', new SnocList('p',null)));
		//ListChar l = new ListChar('s', new ListChar('t', new ListChar('r',null)));
		/*StackChar s = new StackChar();
		s.push('a');
		s.push('p');
		s.push('o');*/
		//SnocList l = new SnocList('a', new SnocList('p', new SnocList('p',null)));
		
		/*SnocQueue q = new SnocQueue();
		q.enqueue('a');
		q.enqueue('b');
		q.enqueue('c');

		q.dequeue();
		
		System.out.println(q.peek());*/
		//AList l = new AList('a',5, new AList('b',2,new AList('c',4,null)));
		/*AListPQueue l = new AListPQueue();
		l.insertItem(0, 'a');
		l.insertItem(1, 'f');
		l.insertItem(0, 'c');*/
//		AListPQueue apq = new AListPQueue();
//		apq.insertItem(3,'a');
//		apq.insertItem(5,'p');
//		apq.deleteItem();
//		apq.next();
//		apq.isEmpty();
//		apq.next();
//		apq.insertItem(11,'p');
//		apq.next();
//		apq.isEmpty();
//		apq.insertItem(3,'l');
//		apq.next();
//		apq.insertItem(0,'e');
//	*/	System.out.println(apq);
		
//		
//		ListChar lc = new ListChar();
//		lc.push('s');
//		lc.push('t');
//		lc.push('r');
//		lc.push('i');
//		lc.push('n');
//		lc.push('g');
//		lc.top();
//		lc.pop();
//		lc.pop();
//		lc.pop();
//		lc.pop();
//		lc.pop();
//		lc.pop();
//		lc.isEmpty();
//		lc.push('l');
//		System.out.println(lc);
		
		AListPQueue apq = new AListPQueue();
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
		System.out.println(apq);
		
		
	}
}
