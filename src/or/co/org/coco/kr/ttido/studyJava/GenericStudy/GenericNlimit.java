package or.co.org.coco.kr.ttido.studyJava.GenericStudy;

class Box<T extends Number> {           //제네릭 클래스 Box의 타입 매개변수에 올 수 있는 타입 인자를 Number클래스 혹은 그를 상속하는 클래스로 제한한다.
    private T ob;                       // 이를통해 Number클래스들이 가지고 있는 메서드를 자유롭게 호출 할 수있다.

    public int getOb() {            //이 곳의 반환형이 T이면 Double 형으로 출력할때도 int형 반환을 해야되는 등 에러가 발생함 >> 그렇기 떄문에 이곳은 정해줘야함
        return ob.intValue();
    }

    public void setOb(T ob) {
        this.ob = ob;
    }
}



public class GenericNlimit {

    public static void main(String[] args) {
        Box<Integer> ibox = new Box<>();        //일반적인 데이터 타입인 int는 올 수 없다 클래스만 올 수 있기 떄문>> wrapper클래스를 이융해 감싸서 오게 한다.
        Box<Double> dBox = new Box<>();

        ibox.setOb(24);         //절달하는 인자로 숫자 24를 넣었다. 이 곳에는 Integer 타입의 참조 변수가 와야하지만 저렇게 리터럴 값이 오게 될 경우
                                // 자동으로 Integer 형으로 변환 시켜서 전달한다. >>  Integer.valueOf(24); 라는 값이 전달된다.
        dBox.setOb(3.14);

        System.out.println(ibox.getOb());
        System.out.println(dBox.getOb());

    }

}
