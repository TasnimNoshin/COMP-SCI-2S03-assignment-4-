package cs2s03;

class SnocList {

	private char c ;
	private SnocList l ;

	SnocList() {
		this.c = '\0';
		this.l = null;
	}
	
	SnocList ( char c , SnocList l ) { 
		this.setC(c) ;
		this.setL(l) ;
	}

	public char getC() {return c;}

	public SnocList getL() {return l;}

	public void setC(char c) {this.c = c;}

	public void setL(SnocList l) {this.l = l;}


	
	
	@Override
	public boolean equals(Object l){
		//compare l to this.list
		if (this.toString().equals(l.toString()))
			return true;
		return false;

	}

	@Override
	public String toString(){
		String str = Character.toString(this.c) + " SnocList" ;
		while(this.l != null){
			str =  Character.toString(this.l.c)+str;
			this.l = this.l.l;
		}
		return str;
	}

}
