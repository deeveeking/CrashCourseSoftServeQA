package MyCat;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		WildCat wild = new WildCat("���","�������");
		wild.saveWorld(r.nextInt(4));
		
			if(r.nextInt(5) > 1) {
				WildCat wild2 = new WildCat("���","�������");
				wild2.saveWorld(r.nextInt(4));
			} if(r.nextInt(5) > 1) {
				HomeCat cat = new HomeCat("������","��������","������");
				cat.layOnSofa(r.nextInt(100), r.nextInt(10));
			}else {
				HomeCat cat = new HomeCat("����","��������","�����");
				cat.layOnSofa(r.nextInt(100), r.nextInt(10));
			}
		
	}

}
