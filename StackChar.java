package cs2s03;

import java.util.ArrayList;

public class StackChar implements MyStack {

	private ArrayList<Character> list = new ArrayList<Character>();

	public StackChar (){

		this.list.clear();
	}



	@Override
	public char top() throws EmptyContainerException {
		// TODO Auto-generated method stub
		if (this.list.isEmpty()) throw new EmptyContainerException(toString());
		return this.list.get(0);
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		if(!(this.list.isEmpty())){
		this .list.remove(0);
		}
	}

	@Override
	public void push(char c) {
		// TODO Auto-generated method stub

		this .list.add(0,c);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.list.isEmpty();
	}
	
	@Override
	public boolean equals(Object l){
		//compare l to this.list
//		String obj = l.toString();
		if (toString().equals(l.toString())){
			return true;
		}
		return false;

	}

	@Override
	public String toString(){

		String str = this.list.toString();
		return "StackChar " + str;
	}

}
