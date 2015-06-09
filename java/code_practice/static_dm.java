class practice{
	static float remainder(float x, float y){
		return x%y ;
	}
}

class static_dm{
	public static void main(String[] args) {
		float a = practice.remainder(11,2);
		System.out.println(a); 
	}
}