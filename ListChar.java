package cs2s03;

public class ListChar implements MyStack {

	char hd;
	ListChar tl;

	ListChar (){
		this.hd = '\0';
		this.tl = null;
	}
	
	ListChar (char c, ListChar l){
		this.hd = c;
		this.tl = l;
	}

	@Override
	public char top() throws EmptyContainerException {
		// TODO Auto-generated method stub
		if (this.hd == '\0') throw new EmptyContainerException(toString());
		return this.hd ;

	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		if (this.hd != '\0') {
		this.hd = this .tl.hd;
		this .tl = this .tl.tl ;
		}

	}

	@Override
	public void push(char c) {
		// TODO Auto-generated method stub
		this .tl = new ListChar(this.hd,this.tl);
		this.hd = c;

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (this .hd == '\0') return true;
		else return false;
	}
	
	@Override
	public boolean equals(Object l){
		//compare l to this.list
		if (this.toString().equals(l.toString()))
			return true;
		return false;

	}

	@Override
	public String toString(){
		if (this.hd == '\0') return "ListChar ,"; 
		String str = "ListChar " + Character.toString(this.hd);
		if (this.tl != null) {
			ListChar tl = this.tl;
			while (tl.hd != '\0') {
				str = str + Character.toString(tl.hd);
				tl = tl.tl;
			}
		}
		return str;
	}

}
