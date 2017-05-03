package Test;


import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

import Exceptions.ListSizeOverflownException;
import Models.ListaOrdenada;


public class ListaPrueba {
	private ListaOrdenada<int[]> c = new ListaOrdenada<int[]>(null);

	@Test
	public void AddSuccess() {
		
		int[] a = new int[]{1,2};
	
		assert (c.add(a));
	}


	
}
