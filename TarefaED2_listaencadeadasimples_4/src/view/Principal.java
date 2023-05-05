package view;

import GustavoCruz.ListaInt.Lista;
import constructor.ListaMaiores;

public class Principal {

	public static void main(String[] args) {
		Lista L = new Lista();
		ListaMaiores contrl = new ListaMaiores();
		int[] vt = {3, 5, 8,12, 9, 7, 6, 2, 3, 7, 16};
		int tam = vt.length;
		System.out.println(tam);
		for(int i = 0; i < tam; i++) {
			if(i == 0) {
				L.addFirst(vt[i]);
			} else {
				try {
					L.addLast(vt[i]);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		contrl.Maiores(L);
		
	}

}
