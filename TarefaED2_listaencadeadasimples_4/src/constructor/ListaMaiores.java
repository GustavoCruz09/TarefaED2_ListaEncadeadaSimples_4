package constructor;

import GustavoCruz.ListaInt.Lista;
import GustavoCruz.QuickSort.QuickSort;

public class ListaMaiores {

	public ListaMaiores() {
		// TODO Auto-generated constructor stub
	}

	public void Maiores(Lista l) {
		QuickSort qs = new QuickSort();
		
		int[] vt = new int[11];
		int tam = l.size();
		for(int i = 0; i < tam; i++) {
			try {
				vt[i] = l.get(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		qs.QuickSort(vt, 0, tam - 1);
		
		System.out.println("Os dois maiores da Lista são: \n" + vt[tam - 1] + "\n" + vt[tam - 2]);
		
		
	}

}
