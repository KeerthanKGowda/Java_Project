package ShoppingMall;

public class InvalidQuantityException extends RuntimeException{

	private String msg;
	public InvalidQuantityException(String msg) {
		this.msg=msg;
	}
	public String getMessage (){
		return msg;
	}

}
