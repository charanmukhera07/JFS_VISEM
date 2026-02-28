import java.util.*;
class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        char[] chars=s.toCharArray();
        
        int i=0;
        int result=0;
        for(int j=1;j<chars.length;j++){
            if(map.get(chars[i])>=map.get(chars[j])){
                result+=map.get(chars[i]);
            }
            else{
                result-=map.get(chars[i]);
            }
            i++;
        }
        result+=map.get(chars[i]);
        return result;
    }
}
class Main{
    public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	Solution sol=new Solution();
	int result=sol.romanToInt(s);
	System.out.println(result);
    }
}
	
