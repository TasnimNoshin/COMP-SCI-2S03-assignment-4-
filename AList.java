package cs2s03;

class AList {
	private char hd ;
	private int priority ;
	private AList tl ;
	
	public AList() {
		this.hd = '\0';
		this.priority = -2;
		this.tl = null;
	}

	public AList ( final char a , final int b , final AList ll ) {
		this . hd = a ;
		this . priority = b ;
		this . tl = ll ; 
	}

	public AList getTl(){
		return this.tl;
	}

	public void setTl(AList tl){
		this.tl = tl;
	}

	public char getHd(){
		return this.hd;
	}

	public void setHd(char c){
		this.hd = c;
	}

	public void setPriority(int num){
		this.priority = num;
	}

	public int getPriority(){
		return this.priority;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (this.hd  == '\0') return true;
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
		if (this.hd == '\0') return "AList ";
		String str ="AList "+ Character.toString(this.hd) + Integer.toString(this.priority);
		while(this.tl != null){
			str = str + Character.toString(this.tl.hd) + Integer.toString(this.tl.priority);
			this.tl = this.tl.tl;
		}
		return str;

	}

}
