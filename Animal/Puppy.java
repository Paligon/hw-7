package Animal;
public class Puppy {
	private  String anun;
	public String getName() {
		return anun;
	}
	public Puppy(String m) {
		this.anun = m;
	}

public static void main(String[] args){
	Puppy katu = new Puppy("Boghos");
	System.out.println(katu.getName());
	}
}