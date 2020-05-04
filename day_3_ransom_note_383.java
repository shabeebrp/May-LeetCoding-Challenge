class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] map = new int[128];
        for(char ch : magazine.toCharArray()){
            map[ch]++;
        }
        for(char ch: ransomNote.toCharArray()){
            if(map[ch] == 0)return false;
            map[ch]--;
        }
        return true;
    }
}
