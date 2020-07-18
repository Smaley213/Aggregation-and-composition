package by.htp.less.Travel;

public class Voucher {

public enum Recreation{
		
		AUSTRIA("Автобус", "Все включено", 14),
		ITALY("Самолет", "Все включено", 9),
		SPAIN("Самолет", "Все включено", 12),
		CYPRUS("Корабль", "Все включено", 10);
		
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
			return name() + " [Вид транспорта :" + this.getTypeOfTransport() + ", питание :" + this.getFood() + ", количество дней :"
					+ this.getNumberOfDays() + "]";
		}
		
			

	}

	public enum Treatment{
		
		VENA("Самолет", " Завтрак,Обед", 20),
		SUZDAL("Автобус", "Все включено", 25),
		ANAPA("Поезд", " Завтрак,Обед", 14),
		OSLO("Автобус", "Все включено", 23);
	
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
			return name() + " [Вид транспорта :" + this.getTypeOfTransport() + ", питание :" + this.getFood() + ", количество дней :"
					+ this.getNumberOfDays() + "]";
		}
	}
	
	public enum Excursion{
		
		PARIS("Самолет", "Завтрак", 5),
		LONDON("Самолет", "Завтрак", 7),
		AMSTERDAM("Автобус", "Все включено", 5),
		PRAHA("Поезд", "Все включено", 8);

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
			return name() + " [Вид транспорта :" + this.getTypeOfTransport() + ", питание :" + this.getFood() + ", количество дней :"
					+ this.getNumberOfDays() + "]";
		}
	}
	
	public enum Shopping{
		
		MOSKOW("Самолет", "Без питания", 4),
		MINSK("Поезд", "Завтрак", 5),
		RIODEJANEIRO("Автобус", "Все включено", 2),
		PHENYAN("Самолет", "Завтрак", 6);
	
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
			return name() + " [Вид транспорта :" + this.getTypeOfTransport() + ", питание :" + this.getFood() + ", количество дней :"
					+ this.getNumberOfDays() + "]";
		}
	}
	
	public enum Cruise{
		
		REDSEA("Лайнер", "Все включено", 5),
		BLUELAGUN("Лайнер", "Завтрак", 4),
		OCEANS("Лайнер", "Завтрак,Обед", 10);

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
			return name() + " [Вид транспорта :" + this.getTypeOfTransport() + ", питание :" + this.getFood() + ", количество дней :"
					+ this.getNumberOfDays() + "]";
		}
	}

}
