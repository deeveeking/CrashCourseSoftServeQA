package MyCat;

public class WildCat extends Cat implements Playable {
	
	
	public WildCat(String Name,String Breed) {
		this.Breed = Breed;
		this.Name = Name;
	}
	
	protected void saveWorld(int daywithouteat) {
		if(daywithouteat > 2) {
			hatePeople();
		}else {
			System.out.println("Ётот котик добрый и с ним можно даже попытатьс€ поиграть)");
			Play();
		}
	}
	
	private void hatePeople() {
		System.out.println(" отик " + Name + " породы " + Breed + " очень зол");
	}


	@Override
	public void Play() {
		System.out.println("”спех! ” вас получилось поиграть с " + Name + " породы " + Breed);
		
	}
	
	
	
	

}
