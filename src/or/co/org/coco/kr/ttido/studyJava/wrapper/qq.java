package or.co.org.coco.kr.ttido.studyJava.wrapper;

public class qq {
    public static int[] solution(int[] numbers) {
        int[] answer = {};
        //핵심은 중복 제거 및 연산의 범위 측정이다. >> 범위를 반절로 쪼갤 수 있다. >> 한사이클을 하나하나가 모든 값과 연산을 진행한다
        // 안쪽에 있는 for문은 전부 진행하는데 밖에 위치하는 for문은 반절만 연산함
        //!! 중요한건 중복 제거 >>> 배열 내의 중복 제거 방법 찾아보자.
        // 마지막이 오름차순정리      Arrays.sort(answer)!
        int counter = 0;
        for(int i =0 ; i <numbers.length ; i++) {
            for (int j = i + 1 ; j <numbers.length / 2 + 1 ;j++)
                answer[counter++] = numbers[i]*numbers[j];
        }


        return answer;

    }

    public static void main(String[] args) {
        int[] num = {1, 3, 4, 5, 6, 7, 8};
        System.out.println(solution(num));;

    }

}
