class Solution {
    public int findComplement(int num) {
        int numberOfShifts = lengthInBinary(num);
        int mask = 0xFFFFFFFF<<numberOfShifts;
        return ~num & ~mask;
    }
    private int lengthInBinary(int num){
        int length = 0;
        while(num!=0){
            num = num>>1;
            length++;
        }
        return length;
    }
}
