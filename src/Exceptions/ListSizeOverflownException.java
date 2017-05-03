package Exceptions;

@SuppressWarnings("serial")
public class ListSizeOverflownException extends RuntimeException {
	public ListSizeOverflownException(String msg)  {
		super("[EXCEPTION]: " + msg);
	}
}
