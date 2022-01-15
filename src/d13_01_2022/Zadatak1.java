package d13_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {


		FacebookPost fbPrvi = new FacebookPost("Jovax Ludiropic", "Giot Munjo", "Zasto ovako da bude kad mozze da ne bude onako");
		FacebookPost fbDrugi = new FacebookPost("Liberud Dublige", "Svakut Loki", "Svako je zdrav dok ne bude ne zdrav");

		
		fbDrugi.dislike();
		fbDrugi.like();
		fbDrugi.print();
		
		System.out.println();
		
		fbPrvi.like();
		fbPrvi.like();
		fbPrvi.like();
		fbPrvi.dislike();
		for (int i = 0; i < 46512; i++) {
			fbPrvi.share();
		}
		fbPrvi.print();
	}

}
