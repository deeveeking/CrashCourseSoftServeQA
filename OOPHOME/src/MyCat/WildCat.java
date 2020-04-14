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
			System.out.println("���� ����� ������ � � ��� ����� ���� ���������� ��������)");
			Play();
		}
	}
	
	private void hatePeople() {
		System.out.println("����� " + Name + " ������ " + Breed + " ����� ���");
	}


	@Override
	public void Play() {
		System.out.println("�����! � ��� ���������� �������� � " + Name + " ������ " + Breed);
		
	}
	
	
	
	

}
