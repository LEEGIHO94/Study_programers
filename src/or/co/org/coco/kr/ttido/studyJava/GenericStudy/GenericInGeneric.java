package or.co.org.coco.kr.ttido.studyJava.GenericStudy;

class Box1<T> {
    private T ob;

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }
}
public class GenericInGeneric {
    public static void main(String[] args) {
        Box1<String> sbox = new Box1<>();         //뒤의 다이아몬드 기호 <>에도 String이라는 클래스를 입력해줘야하지만 컴파일러가 알아서 잘 해줌 >> 생략가능
        sbox.setOb("I am  so happy");

        Box1<Box1<String>> wbox = new Box1<>();
        wbox.setOb(sbox);

        Box1<Box1<Box1<String>>> zbox = new Box1<>();
        zbox.setOb(wbox);

        System.out.println(zbox.getOb().getOb().getOb());
    }

    /*
    * 해석 시
    * Box<String>이라는 매개변수화타입을 타입매게변수에 인자로 전달한 것을 이미한다.
    * 위의 말은 정의를 통해 알 수 있는 말이다.
    * 이 코드를 해석하기 위해서는
    * Box<String>이라는 매개변수화 타입을 하나의 데이터 타입 혹은 타입 인자라고 생각하고 문제를 접근하자.
    * 첫번째 부터 String이라는 타입인자를 가지는 sbox의 ob에 문자열을 저장한다.
    * 두번째 인스턴스인 wbox는 Box<String>이라는 타입 인자를 가지는 인스턴스다.
    * 나는 wbox라는 매개변수에 sbox라는 매개변수를 저장할 것이다.  >> 여기서 왜 가능한가???
    *                   1. sbox의 데이터 타입은 ?  Box<String>이다.  // 또한 우리가 가지고 있는 메소드의 데이터 타입은? Box<String)>이다.
    *                           2. 그렇기 때문에 변수 ob에 저장이 가능한것이다.
    *                               이것은    Box<String> ob = sbox
    *                                                          sbox 의 데이터 타입 >> Box<String>     데이터 타입 일치 >> 저장가능
    *                                   3.이 행위를 다음 번에도 반복
    * 그러면 zbox의 ob라는 매개변수에는 wbox가 저장이 되어있을 것이다. 또한 wbox의 매개변수 ob에는 sbox가 저장되어있을것이다.
    *
    *
    * 마지막 문장에서 getOb메서드를 많이 호출한다. >> 이것은 앞에서 부터 하나하나 천천히 해석하면 쉽게 해석할 수 있다.
    *
    *                           zbox.getOb()    .getOb()       .getOb()
    *                    zbox의 ob에 저장된 wbox가 출력됨 >>>   wbox.getOb().getOb()
    *                                                         sbox.getOb()  >>>> I am so happy 라는 문자열을 출력해준다.
    * */

}
