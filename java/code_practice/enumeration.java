class enumeration{
	enum Transport{
		VOLVO(100), MERC(200), HERO(300), HONDA(400);

		private int speed;

		Transport(int num){
			speed = num;
		}

		int speed(){
			return speed;
		}
	}
	public static void main(String[] args) {
		// displaying all transports and their serial numbers  : 

		for(Transport t : Transport.values()){
			System.out.println(" " + t + " has a serial number : " + t.ordinal() + " and speed : "+ t.speed);
		}

		System.out.println("");
	}
}