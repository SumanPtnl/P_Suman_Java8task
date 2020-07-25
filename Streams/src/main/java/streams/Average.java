package streams;

import java.util.List;

public class Average {

	public static int avg(List<Integer> list)
	 {
		 Double avg = list.stream().mapToInt(val -> val).average().orElse(0.0);
		 return (int)Math.round(avg);
	 }
}
