package cs2s03;

public class AListPQueue implements MyPriorityQueue {

	private AList list;
	
	public AListPQueue (){
		this.list = new AList();
	}

	public AListPQueue (AList c){

		this.list = c;
	}
	
	@Override
	public char next() throws EmptyContainerException {
		// TODO Auto-generated method stub
		if (list.getHd() == '\0') throw new EmptyContainerException(toString());
		return list.getHd();
	}

	@Override
	public void deleteItem() {
		// TODO Auto-generated method stub
		if (this.list.getTl() == null){
			this.list.setHd('\0');
		}
		else {
			this.list = this.list.getTl();
		}
	}

	@Override
	public void insertItem(int p, char c) {
		if (this.list.isEmpty()){
			this.list = new AList (c,p,null);
		}
		else{
			this.list = insert(this.list, p, c);
		}
	}
	
	private AList insert(AList ins, int p, char c) {
		if (ins == null || p > ins.getPriority()){
			return new AList (c,p,ins);
		}
		if (ins.getPriority() == p && ins.getHd() > c){
			// do the alpha order order
			
				return new AList (c,p,ins);
			
		}

			return new AList(ins.getHd(), ins.getPriority(), insert (ins.getTl(),p,c));
		
	}
//	private AList insert(AList ins, int p, char c) {
//		if (p > this.list.getPriority() || ins== null){
//			return new AList (c,p,ins);
//		}
//		if (this.list.getPriority() == p && this.list.getHd() > c){
//			// do the alpha order order
//			
//				return new AList (c,p,ins);
//			
//		}
//
//			return new AList(ins.getHd(), ins.getPriority(), insert (ins.getTl(),p,c));
//		
//	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (this.list.getHd() == '\0') return true;
		else return false;
	}
	
	@Override
	public boolean equals(Object l){
		//compare l to this.list
		if (toString().equals(l.toString()))
			return true;
		return false;

	}

	@Override
	public String toString() {
		String str = this.list.toString();
		return "AListPQueue  " + str;
	}
}
