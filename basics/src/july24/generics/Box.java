package july24.generics;

public class Box<T> {

	T data;
	
	

public Box() {
	super();
}

public Box(T data) {
	super();
	this.data = data;
}



public T getData() {
	return data;
}

public void setData(T data) {
	this.data = data;
}

//@Override
//public String toString() {
//	return "Box [data=" + data + ", getData()=" + getData() + "]";
//}


	
	
	
	
}

