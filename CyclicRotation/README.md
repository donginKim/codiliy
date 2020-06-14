# CyclicRotation





## 원문

An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).

The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

Write a function:

> ```
> class Solution { public int[] solution(int[] A, int K); }
> ```

that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given

```
    A = [3, 8, 9, 7, 6]    K = 3
```

the function should return [9, 7, 6, 3, 8]. Three rotations were made:

```
    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
```

For another example, given

```
    A = [0, 0, 0]    K = 1
```

the function should return [0, 0, 0]

Given

```
    A = [1, 2, 3, 4]    K = 4
```

the function should return [1, 2, 3, 4]

Assume that:

> - N and K are integers within the range [0..100];
> - each element of array A is an integer within the range [−1,000..1,000].

In your solution, focus on ***\*correctness\****. The performance of your solution will not be the focus of the assessment.





## 번역


N 개의 정수로 구성된 배열 A가 제공됩니다. 배열의 회전은 각 요소가 하나의 인덱스만큼 오른쪽으로 이동하고 배열의 마지막 요소가 처음으로 이동 함을 의미합니다. 예를 들어, 배열 A = [3, 8, 9, 7, 6]의 회전은 [6, 3, 8, 9, 7]입니다 (요소는 하나의 인덱스만큼 오른쪽으로 이동하고 6은 첫 번째 위치로 이동).

목표는 배열을 K 회 회전시키는 것입니다. 즉, A의 각 요소는 오른쪽 K 번으로 이동합니다.

함수를 작성하십시오.

> ```
> 클래스 솔루션 {public int [] solution (int [] A, int K); }
> ```

즉, N 개의 정수와 정수 K로 구성된 배열 A가 주어지면 K만큼 회전 한 배열 A를 반환합니다.

예를 들어, 주어진
```
    A = [3, 8, 9, 7, 6]
    K = 3
```
함수는 [9, 7, 6, 3, 8]을 반환해야합니다. 세 번의 회전이 이루어졌습니다.
```
    [3, 8, 9, 7, 6]-> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7]-> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9]-> [9, 7, 6, 3, 8]
```
다른 예를 들어, 주어진
```
    A = [0, 0, 0]
    K = 1
```
함수는 [0, 0, 0]을 반환해야합니다.

주어진
```
    A = [1, 2, 3, 4]
    K = 4
```
함수는 [1, 2, 3, 4]를 반환해야합니다.

다음을 가정하십시오.

N 및 K는 [0..100] 범위 내의 정수이며;
배열 A의 각 요소는 [-1,000..1,000] 범위의 정수입니다.
솔루션에서 정확성에 집중하십시오. 솔루션의 성능은 평가의 초점이 아닙니다.