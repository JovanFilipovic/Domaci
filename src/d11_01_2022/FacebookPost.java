package d11_01_2022;

public class FacebookPost {

	String userThis;
	String userPosted;
	String post;
	int likes;
	int shares;

	public void like() {
		this.likes++;
	}

	public void dislike() {
		if (this.likes > 0)
			;
		this.likes--;
	}

	public void share() {
		this.shares++;
	}

	public void print() {
		System.out.println(this.userThis + " >>> " + this.userPosted);
		System.out.println(this.post);
		System.out.println("Likes " + this.likes + " | Shares " + this.shares);
	}

}
