/**
 *  Task Score   100%
 *  Correctness  100%
 *  Performance  Not assessed
 *
 *  수학적 계산 문제가 나에겐 약점
 *  사실 수학을 못해서 못풀었던 케이스....
 *
 */
public class Solution {
  public static int[] solution(int[] A, int K){

      int[] result = new int[A.length];

      for(int i =0; i<A.length; i++){
          result[(i+K)%A.length] = A[i];
      }

      return result;
  }

  public static void main(String[] args) {
      /**
       * run solution
       *
       * example test
       * A = [3, 8, 9, 7, 6] K = 3 -> return = [9, 7, 6, 3, 8]
       * A = [1, 2, 3, 4] K = 4  -> return = [1, 2, 3, 4]
       *
       */


      System.out.println(solution(new int[]{3, 8, 9, 7, 6}, 3));
  }

}