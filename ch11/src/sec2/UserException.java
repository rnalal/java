package sec2;
//사용자Exception
public class UserException extends Exception {
	public UserException() { }
	public UserException(String msg){
		super(msg);
	}
}
