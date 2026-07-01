class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int arr[] = new int[26];
        for(char ch :letters){
            arr[ch-'a']++;
        }
        for(int i = target-'a'+1;i<26;i++){
            if(arr[i]>=1){
                return (char)('a'+i);
            }
        }
        return letters[0];
    }
}