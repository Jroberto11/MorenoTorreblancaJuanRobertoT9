package Models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

import Exceptions.ElementNotAllowedException;
import Exceptions.ListSizeOverflownException;




public class ListaOrdenada<E> extends ArrayList<E>{

	private final byte MAX_SIZE=100;//Tamanio max
	
	public ListaOrdenada(Comparator<E> comp){//constructor con comparator
		super();
	}
	@Override
	public boolean add(E element) throws ListSizeOverflownException,ElementNotAllowedException {
		if (element != null) {
			if (this.size() <= MAX_SIZE) {
				return super.add(element);
			} else {
				throw new ListSizeOverflownException("La lista está llena!");
				}
		} else {
			throw new ElementNotAllowedException("No acepto valores null!");
		}
	}
	@Override 
	public boolean addAll(Collection<? extends E> c) throws ListSizeOverflownException,ElementNotAllowedException {
		if(c.size()+this.size() <= MAX_SIZE) {
			return super.addAll(c);
		} else {
			throw new ListSizeOverflownException("La lista está llena!");
		}
	}
	public void reverse(){
		
		
	}
	public void min(Collection<? extends E>coll,Comparator<? super E>comp){
		
	}
	public void max(Collection<? extends E>coll,Comparator<? super E>comp){
		
	}
}
