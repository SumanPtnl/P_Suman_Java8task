package streams;

import java.util.ArrayList;
import java.util.List;

public class PalindromeCheck {

	
	public static List<String> Palindrome(List<String> list)
	{
		List<String> res=new ArrayList<String>();
		list.stream().forEach(str ->{
			if(check(str))
				res.add(str);
		});
		return res;
	}

	private static boolean check(String str) {
		StringBuffer s=new StringBuffer(str);
		s.reverse();
		String chk=s.toString();
		if(str.equals(chk))
			return true;
		return false;
	}
}
