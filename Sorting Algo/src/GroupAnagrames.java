import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrames {
    public static void main(String[] args) {
//        String nums[] = {'eat','tea','tan','ate','nat','bat'};
        String nums[] = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = new ArrayList<>();
        for(int i = 0 , j =0; i< nums.length; i++){
             while(j< nums.length){
                 if (nums[i].length()==nums[j].length()){
                     if (nums[i].equals(nums[j])){
                         result.add(Arrays.asList(nums[i], nums[j]));
                     }
                     else{
//                         Anagram(nums[j])
                         if (nums[j].equals(nums[i])){
                             result.add(Arrays.asList(nums[i], nums[j]));
                         }
                     }
                 }
                 j++;
             }
        }
    }
//    static void Anagram(String str1){
//        int j = str1.length()-1;
//         for (int i = 0; i<str1.length(); i++){
//             char[] charArray = str1.toCharArray();
//             char temp = charArray[i];
//             charArray[i] = charArray[j];
//             charArray[j] = temp;
//             str1 = new String(charArray);
//
//         }
//    }
}
