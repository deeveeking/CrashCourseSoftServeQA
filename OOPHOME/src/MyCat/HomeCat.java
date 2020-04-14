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
			System.out.println("��� " + Name + " �����. ��������� � " + Master);
		}
	}
	
	private void spoilShoes() {
		System.out.println("�������... ����� " + Name + " ������ " + Breed + " ���������� ��������� �����. � ������� � ���� ��� ������ " + Master);
	}

	@Override
	public void Play() {
		for(int i = 0 ; i < 4;i++) {
			if(i != 3) {
			System.out.println("�����. ������!");
			}else {
				System.out.println("��� " + Name + " �����! ������� " + Master + " ���-�� �� ��� ��������)");
			}
		}
	}

}
