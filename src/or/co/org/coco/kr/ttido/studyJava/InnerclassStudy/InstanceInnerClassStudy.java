package or.co.org.coco.kr.ttido.studyJava.InnerclassStudy;
class Outer{
    private  int num = 1;       //외부클래스의 인스턴스 변수
    private static int sNum =2;     //외부 클래스의 클래스 변수

    private InClass inClass;        //내부클래스인 InClass 형 변수 inClass 선언

    public Outer(){                 //생성자   inClass 에 내부 클래스 >InClass"()의 참조값을 할당하시오
        inClass = new InClass();
    }

    class InClass {
        int inNum = 10;                                 //내부 클래스의 인스턴스 변수

        void Test() {
            System.out.println("Outer num = " + num + " //외부클래스의 인스턴스 변수");
            System.out.println("Outer sNum = " + sNum + " //외부클래스의 스테틱 변수");

        }
    }
        public void testClass(){            //외부 클래스의 메소드로 내부클래스의 메소드 Test를 가리킨다.
            inClass.Test();             //inClass가 가리키는 인스턴스 내부의 Test메소드를 실행하시오.
        }
    }





public class InstanceInnerClassStudy {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println("외부 클래스 사용하여 내부 클래스 기능 호출");

        outer.testClass();                                          //이것만 봤을 때는 외부클래스의 testClass()를 실행한 것 뿐이지만 이 메소드 실행 시 내부 클래스의 test메서드가 실행된다.
            }

}
