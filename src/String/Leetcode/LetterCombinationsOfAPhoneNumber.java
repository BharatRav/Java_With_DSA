package String.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Leetcode Link:-https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
public class LetterCombinationsOfAPhoneNumber {
    static Map<Character,String> map = new HashMap<>();
    //it is given 1 is not present here so
    static {
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
    }
    public List<String> letterCombinations(String digits) {
        if (digits.length()==0){
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();


        String s =map.get(digits.charAt(0));
        if (digits.length()==1){

            for (int j=0;j<s.length();j++) {
                result.add(Character.toString(s.charAt(j)));
                //or
                //result.add(s.charAt(j)+"");
            }
            return result;
        }

        List<String> list = letterCombinations(digits.substring(1,digits.length()));
        //String s =map.get(digits.charAt(0));
        for (int i=0;i<s.length();i++) {
            for (int j=0;j<list.size();j++){
                result.add(s.charAt(i)+""+list.get(j));
            }
        }
        return result;
    }
}
