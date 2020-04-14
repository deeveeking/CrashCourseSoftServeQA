package MyCat;

public class HomeCat extends Cat implements Playable {
	
	
	protected String Master;
	
	
	public HomeCat(String Name,String Breed,String Master) {
		this.Master = Master;
		this.Name = Name;
		this.Breed = Breed;
	}
	
	
	protected void layOnSofa(double power,int powermood) {
		if(power > 50 && powermood < 6) {
			spoilShoes();
		}else if(power >=80 && powermood >= 7) {
			Play();
		}else {
			System.out.println("Ваш " + Name + " устал. Поиграйте с " + Master);
		}
	}
	
	private void spoilShoes() {
		System.out.println("Уппсссс... После " + Name + " породы " + Breed + " необходимо постирать обувь. А виноват в этом его хозяин " + Master);
	}

	@Override
	public void Play() {
		for(int i = 0 ; i < 4;i++) {
			if(i != 3) {
			System.out.println("Успех. Играем!");
			}else {
				System.out.println("Кот " + Name + " устал! Скажите " + Master + " что-бы он его покормил)");
			}
		}
	}

}
