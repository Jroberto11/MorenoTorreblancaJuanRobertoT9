package Main;



import Models.ListaOrdenada;



public class pruebalista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaOrdenada<int[]> Lista = new ListaOrdenada<int[]>(null);
		int[] a = new int[]{1,2};
	Lista.add(a);
	System.out.println(Lista.size());
	}

}
