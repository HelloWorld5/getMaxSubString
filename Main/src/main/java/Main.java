/**
 * Created by Administrator on 2016/11/14.
 */
import java.util.HashMap;
import java.util.Map;


public class Main {

    public static int getMaxSubString(String str){
        String sub = str;
        char[] tmpCharArray = str.toCharArray();
        int max = 26;
        while(max != 0){
            for(int i = 0;i + max<tmpCharArray.length;i++){
                String subStr = str.substring(i,i+max-1);
                if(ifdouble(subStr)){
                    return subStr.length();
                }
            }
            max --;
        }
        return sub.length();
    }

    public static boolean ifdouble(String str){
        char[] tmpCharArray = str.toCharArray();
        Map<Character,Integer> tmpMap = new HashMap<Character,Integer>();
        int index = 1;
        for(char tmpChar : tmpCharArray){
            Integer value = tmpMap.get(tmpChar);
            if(value == null || value == 0){
                tmpMap.put(tmpChar, index);
            } else {
                return false ;
            }
        }
        return true ;
    }
}
