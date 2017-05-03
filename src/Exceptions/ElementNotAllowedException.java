package Exceptions;

@SuppressWarnings("serial")
public class ElementNotAllowedException extends NullPointerException  {
	public ElementNotAllowedException(String msg)  {
		super("[EXCEPTION]: " + msg);
	}
}
