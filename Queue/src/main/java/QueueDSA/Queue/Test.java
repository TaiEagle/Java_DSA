package QueueDSA.Queue;

public class Test {

	public static void main(String [] args) {
		String webHash = "d250e97a7595fdac4f97debc630d7a8da942319274a76cb32384596b659dbaeb";
		String fileHash = "D250E97A7595FDAC4F97DEBC630D7A8DA942319274A76CB32384596B659DBAEB";
		String fileHashLower = fileHash.toLowerCase();
		
		if(webHash.equals(fileHashLower)) {
			System.out.println("match");
		}
		else {
			System.out.println("not a match");
		}
	}

}
