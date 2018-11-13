
public class Set<T> {
	private Node<T> head;
	
	public Set(){
		this.head = null;
	}

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}
	
	public boolean contains(T value){
		boolean result = false;
		Node<T> temp = this.getHead();
		if(temp != null){
			if(temp.getValue() == value){
				result = true;
			}
			while(temp.getNext() != null){
				temp = temp.getNext();
				if(temp.getValue() == value){
					result = true;
				}
			}
		}
		return result;
	}
	
	public boolean isEmpty(){
		return this.getHead() == null;
			
	}
	
	public void clear(){
		this.setHead(null);
	}
	
	public int size(){
		int result = 0;
		Node<T> temp = this.getHead();
		if(temp != null){
			result = 1;
			while(temp.getNext() != null){
				temp = temp.getNext();
				result++;
			}
		}
		return result;
	}
	
	public boolean add(T value){
		Node<T> node = new Node<T>(value);
		boolean result = false;
		Node<T> temp = this.getHead();
		if(temp == null){
			this.setHead(node);
		}
		else{
			if(!this.contains(node.getValue())){
				while(temp.getNext() != null){
					temp = temp.getNext();
				}
				temp.setNext(node);
			}
		}
		return result;
	}
	
	public boolean remove(T value){
		boolean result = false;
		Node<T> temp = this.getHead();
		if(temp != null){
			if(this.contains(value)){
				if(temp.getValue() == value){
					this.setHead(temp.getNext());
				}
				else{
					while(temp.getNext().getValue() != value){
						temp = temp.getNext();
					}
					temp.setNext(temp.getNext().getNext());
				}
				result = true;
			}
		}
		return result;
	}
	
	@Override
	public String toString(){
		String result = "{";
		Node<T> temp = this.getHead();
		if(temp != null){
			result += temp.getValue().toString();
			while(temp.getNext() != null){
				temp = temp.getNext();
				result += " " + temp.getValue().toString();
			}
		}
		result += "}";
		return result;
	}
	
}
