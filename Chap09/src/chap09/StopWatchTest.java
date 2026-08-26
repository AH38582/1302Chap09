package chap09;

public class StopWatchTest {

	public static void main(String[] args) {
		StopWatch s = new StopWatch();
		s.start();
		
		s.stop(825588);
		System.out.println(s.getElapsedTime());
	}

}
