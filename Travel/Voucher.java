package by.htp.less.Travel;

public class Voucher {

public enum Recreation{
		
		AUSTRIA("�������", "��� ��������", 14),
		ITALY("�������", "��� ��������", 9),
		SPAIN("�������", "��� ��������", 12),
		CYPRUS("�������", "��� ��������", 10);
		
		String typeOfTransport;
		String food;
		int numberOfDays;

		Recreation(String typeOfTransport, String food, int numberOfDays){
			this.typeOfTransport = typeOfTransport;
			this.food = food;
			this.numberOfDays = numberOfDays;
		}

		public String getTypeOfTransport() {
			return typeOfTransport;
		}

		public String getFood() {
			return food;
		}

		public int getNumberOfDays() {
			return numberOfDays;
		}
		
		@Override
		public String toString() {
			return name() + " [��� ���������� :" + this.getTypeOfTransport() + ", ������� :" + this.getFood() + ", ���������� ���� :"
					+ this.getNumberOfDays() + "]";
		}
		
			

	}

	public enum Treatment{
		
		VENA("�������", " �������,����", 20),
		SUZDAL("�������", "��� ��������", 25),
		ANAPA("�����", " �������,����", 14),
		OSLO("�������", "��� ��������", 23);
	
		String typeOfTransport;
		String food;
		int numberOfDays;
		
		Treatment(String typeOfTransport, String food, int numberOfDays){
			this.typeOfTransport = typeOfTransport;
			this.food = food;
			this.numberOfDays = numberOfDays;
		
		}

		public String getTypeOfTransport() {
			return typeOfTransport;
		}

		public String getFood() {
			return food;
		}

		public int getNumberOfDays() {
			return numberOfDays;
		}
		
		@Override
		public String toString() {
			return name() + " [��� ���������� :" + this.getTypeOfTransport() + ", ������� :" + this.getFood() + ", ���������� ���� :"
					+ this.getNumberOfDays() + "]";
		}
	}
	
	public enum Excursion{
		
		PARIS("�������", "�������", 5),
		LONDON("�������", "�������", 7),
		AMSTERDAM("�������", "��� ��������", 5),
		PRAHA("�����", "��� ��������", 8);

		String typeOfTransport;
		String food;
		int numberOfDays;
		
		Excursion(String typeOfTransport, String food, int numberOfDays){
			this.typeOfTransport = typeOfTransport;
			this.food = food;
			this.numberOfDays = numberOfDays;
		}

		public String getTypeOfTransport() {
			return typeOfTransport;
		}

		public String getFood() {
			return food;
		}

		public int getNumberOfDays() {
			return numberOfDays;
		}
		
		@Override
		public String toString() {
			return name() + " [��� ���������� :" + this.getTypeOfTransport() + ", ������� :" + this.getFood() + ", ���������� ���� :"
					+ this.getNumberOfDays() + "]";
		}
	}
	
	public enum Shopping{
		
		MOSKOW("�������", "��� �������", 4),
		MINSK("�����", "�������", 5),
		RIODEJANEIRO("�������", "��� ��������", 2),
		PHENYAN("�������", "�������", 6);
	
		String typeOfTransport;
		String food;
		int numberOfDays;
		
		Shopping(String typeOfTransport, String food, int numberOfDays){
			this.typeOfTransport = typeOfTransport;
			this.food = food;
			this.numberOfDays = numberOfDays;
		
		}
		
		public String getTypeOfTransport() {
			return typeOfTransport;
		}

		public String getFood() {
			return food;
		}

		public int getNumberOfDays() {
			return numberOfDays;
		}
		
		@Override
		public String toString() {
			return name() + " [��� ���������� :" + this.getTypeOfTransport() + ", ������� :" + this.getFood() + ", ���������� ���� :"
					+ this.getNumberOfDays() + "]";
		}
	}
	
	public enum Cruise{
		
		REDSEA("������", "��� ��������", 5),
		BLUELAGUN("������", "�������", 4),
		OCEANS("������", "�������,����", 10);

		String typeOfTransport;
		String food;
		int numberOfDays;
		
		Cruise(String typeOfTransport, String food, int numberOfDays){
			this.typeOfTransport = typeOfTransport;
			this.food = food;
			this.numberOfDays = numberOfDays;
		
		}

		public String getTypeOfTransport() {
			return typeOfTransport;
		}

		public String getFood() {
			return food;
		}

		public int getNumberOfDays() {
			return numberOfDays;
		}
		
		
		@Override
		public String toString() {
			return name() + " [��� ���������� :" + this.getTypeOfTransport() + ", ������� :" + this.getFood() + ", ���������� ���� :"
					+ this.getNumberOfDays() + "]";
		}
	}

}
