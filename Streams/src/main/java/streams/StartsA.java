package streams;

import java.util.ArrayList;
import java.util.List;

public class StartsA {

	public static List<String> check(List<String> list)
	{
		List<String> res=new ArrayList<String>();
		list.stream().forEach(str->{
			if(str.charAt(0)=='a' && str.length()==3 )
				res.add(str);
		});
		return res;
	}
}
