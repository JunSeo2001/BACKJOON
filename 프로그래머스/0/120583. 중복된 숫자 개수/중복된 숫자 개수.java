class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int size = array.length;
        for(int i = 0; i < size; i++){
            if(array[i] == n){
                answer++;
            }
        }
        return answer;
    }
}