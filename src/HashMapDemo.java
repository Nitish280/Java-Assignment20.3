import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
		//here we are creating the object of Hashmap
	        HashMap<String, String> hashMap = new HashMap<String, String>();
	         //1.functionalities
	        //here we are  Putting the element in the hashset
	        hashMap.put("Name", "Nitish Singh");
	        hashMap.put("Designation", "Trainee");
	        //2.functionalities
	        //here we are Adding a key-value pair to the HashMap
	        //object if the key-value pair doesn’t exist already.
	        hashMap.put("Name", "Nitish");
	        
	        //3.functionalities
	        //here we are Retrieving a value associated 
	        //with a given key from the HashMap.
	         System.out.println(hashMap.get("Name"));
	        //4.functionalities
	        //Here we are Clear all the key-value pair present in the HashMap.
	        hashMap.clear();//removes
	        //here we are initializing the hashmap
	        for(Map.Entry<String, String> el : hashMap.entrySet()){
	            String key = el.getKey();
	            String value = el.getValue();
	            System.out.println(key + " : " + value);
	        }

}
}
