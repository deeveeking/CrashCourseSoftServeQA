package MyCat;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		WildCat wild = new WildCat("Том","Леопард");
		wild.saveWorld(r.nextInt(4));
		
			if(r.nextInt(5) > 1) {
				WildCat wild2 = new WildCat("Дуо","Тигрёнок");
				wild2.saveWorld(r.nextInt(4));
			} if(r.nextInt(5) > 1) {
				HomeCat cat = new HomeCat("Мурчик","Британец","Андрей");
				cat.layOnSofa(r.nextInt(100), r.nextInt(10));
			}else {
				HomeCat cat = new HomeCat("Бакс","Сиамский","Жанна");
				cat.layOnSofa(r.nextInt(100), r.nextInt(10));
			}
		
	}

}
