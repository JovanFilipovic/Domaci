package d11_01_2022;

public class Zadatak3 {

	public static void main(String[] args) {

		FacebookPost prvi = new FacebookPost();
		FacebookPost drugi = new FacebookPost();

		prvi.userThis = "Sunta Suntovic";
		prvi.userPosted = "Luna Lonukic";
		prvi.post = " de si be? ";
		prvi.likes = 3;
		prvi.shares = 1;

		drugi.userThis = "Gunta Guntovic";
		drugi.userPosted = "Tuna TRonukic";
		drugi.post = " Sto si be? ";
		drugi.likes = 77;
		drugi.shares = 14;

		prvi.dislike();
		prvi.like();
		prvi.print();
		prvi.share();

		drugi.dislike();
		drugi.like();
		drugi.print();
		drugi.share();
	}

}
