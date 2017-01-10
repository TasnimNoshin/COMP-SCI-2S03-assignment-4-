package cs2s03;


public class SnocQueue implements MyQueue {

	private SnocList list;

	public SnocQueue () {
		this.list = new SnocList();
	}

	public SnocQueue (SnocList c){

		this.list = c;
	}

	@Override
	public char peek() throws EmptyContainerException {
		// TODO Auto-generated method stub 
		if (list.getC()== '\0') throw new EmptyContainerException(toString());
		return list.getC();

	}

	@Override
	public void dequeue() {
		// TODO Auto-generated method stub
		if (!(this.isEmpty())){
		this.remove();
		}

	}

	@Override
	public void enqueue(char c) {
		// TODO Auto-generated method stub//traverse
		this.add(c);
	}
	
	public void remove () {
		if (this.list.getC() != '\0' ){
			if (this.list.getL() != null) {
				this.list.setC(this.list.getL().getC()); 
				this.list.setL(this.list.getL().getL());
			}
			else {
				this.list.setC('\0');
			}
		}
	}

	public void add (char y) {
		if (this.list.getC() == '\0'){
			this.list.setC(y);
		} else {
			if(this.list.getL() == null){      
				this.list.setL(new SnocList(y,null)); 
		    }
			else {
				SnocQueue temp = new SnocQueue (this.list.getL());
				temp.add(y);
			}
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (this.list.getC() == '\0') return true;
		else return false;
	}

	@Override
	public String toString() {

		String str = this.list.toString();
		return "SnocQueue " + str;
	}

	@Override
	public boolean equals(Object l){
		//compare l to this.list
		if (toString().equals(l.toString()))
			return true;
		return false;

	}
}
