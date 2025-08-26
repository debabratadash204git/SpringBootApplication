package slidingWindow;

import java.util.*;

public class LongestSubstringWithoutRepeatingChar {
	
	public int findLongestSubstringWithoutRepeatingChar(String str) {
		
		int maxLength=0;
		int start = 0;
		int end =0;
		Map<Character,Integer> map = new HashMap<>();
		
		for(end = 0; end < str.length(); end++ ) {
			
			char ch = str.charAt(end);
			map.put(ch, map.getOrDefault(ch, 0) +1);
			
			while(map.get(ch) > 1)
			{
				char startChar = str.charAt(start);
				map.put(startChar, map.get(startChar) -1);
				start++;
			}
			
			maxLength = Math.max(maxLength, end - start +1);		
		}
		
		return maxLength;
	}

	public static void main(String[] args) {
		
		String str = "eghghhgg";
		
		LongestSubstringWithoutRepeatingChar lswr = new LongestSubstringWithoutRepeatingChar();
		int length = lswr.findLongestSubstringWithoutRepeatingChar(str);
		System.out.println("Length of the LongestSubstringWithoutRepeatingChar->  " + length);
		
	}

}
