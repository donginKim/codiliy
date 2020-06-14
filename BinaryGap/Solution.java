/**
 *  Task Score   100%
 *  Correctness  100%
 *  Performance  Not assessed
 */
public class Solution {
  public static int solution(int N){

      // 2진수로 만든 뒤, 각 글자를 Array 형태로 제공
      char[] binary = Integer.toBinaryString(N).toCharArray();

      int count = 0;
      int result = 0;

      for(int i=0;i<binary.length;i++){
          // 1 ~ 1 이진수 바이너리 갭 사이에 존재하는 0의 갯수를 구하는 작업
          if(binary[i]=='0'){
              count++;
          }else{

              /**
               * 만약 기존에 result의 갯수보다 크다면 result 값으로 갱신
               * 애초 1, 즉 바이너리 갭 부분을 만나게 되면 이곳으로 빠지게 되며, 애초 만나지 못하면 계속 result는 0인 상태로 리턴한다.
               */
              if(result<count){
                  result = count;
              }
              // 이곳을 타게 된다면 바이너리 갭을 만나게 됨으로 다시 count를 시작하게 된다.
              count = 0;
          }
      }

      return result;
  }

  public static void main(String[] args) {
      /**
       * run solution
       *
       * example test
       * N = 1041 -> return = 5
       * N = 32   -> return = 0
       *
       */
      System.out.println(solution(32));
  }
}
