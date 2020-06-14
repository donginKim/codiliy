# BinaryGap





## 원문

A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

Write a function:

class Solution { public int solution(int N); }

that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..2,147,483,647].



## 번역

양의 정수 N 내의 이진 갭은 N의 이진 표현에서 양쪽 끝에 1로 둘러싸인 연속적인 0의 최대 시퀀스입니다.

 예를 들어, 숫자 9는 이진 표현 1001을 가지며 길이 2의 이진 간격을 포함합니다. 
숫자 529는 이진 표현 1000010001을 가지며 길이 2는 길이 4와 길이 3의 두 이진 간격을 포함합니다. 
길이 15의 1 진 이진 간격 숫자 32는 이진 표현 100000을 가지며 이진 간격이 없습니다. 함수를 작성하십시오. 

클래스 솔루션 {public int solution (int N); } 양의 정수 N이 주어지면 가장 긴 이진 간격의 길이를 반환합니다. 

N에 이진 간격이 없으면 함수는 0을 반환해야합니다. 
예를 들어, N = 1041이 주어지면 함수는 5를 반환해야합니다. 
N에는 이진 표현이 10000010001이고 가장 긴 이진 간격은 길이가 5이기 때문입니다. 
N = 32이면 N은 이진 표현이 '100000'이므로 함수는 0을 반환해야합니다. 
이진 간격이 없습니다. 

다음 가정을위한 효율적인 알고리즘을 작성하십시오. 

N은 [1..2,147,483,647] 범위의 정수입니다.



