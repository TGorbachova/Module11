/**
 * �author Tetiana Horbachova
 * @version 1. 0
 */
package Module11_xUnit.Module11;

public class EmptyToyException extends Exception{
	
	public EmptyToyException(String s) {
	      super(s);
	   }

	public String getDetailsMessage(){
		return super.getMessage();
	}
	}
