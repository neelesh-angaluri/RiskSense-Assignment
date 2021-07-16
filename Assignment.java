import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Write a function (in Java or Scala) that inputs an array or list of strings and outputs a map where
//the key is a unique instance of one of the strings, and the value is the number of occurrences of
//that string. So for example, if the input is [“Red”, “Blue”, “Green”, “Blue”], the output should look
//like: { “Red”: 1, “Green”: 1, “Blue”: 2 }.

// Runtime : O(n) as we are iterating through the whole input list of strings where n is the length of the list
// Space : O(n) where n is again the number of strings stored in the HashMap.

public class Assignment {

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Blue");
		
		 countStrings(list);
		System.out.println(countStrings(list));
	}
	
	public static HashMap<String,Integer> countStrings(List<String> inputStrings)
	{
		HashMap<String,Integer> map = new HashMap<>();
		
		for(String s : inputStrings)
		{
			if(map.containsKey(s))
			{
				map.put(s,map.get(s)+1);	// If the string already exists, increment value by 1.
			}
			else
			{
				map.put(s,1);		// If we encounter the string for the first time, add it to the map with a value of 1.
			}
		}
		return map;
	}

}
