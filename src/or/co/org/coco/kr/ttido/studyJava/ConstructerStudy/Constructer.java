package or.co.org.coco.kr.ttido.studyJava.ConstructerStudy;

class Family{
    String father ;
    String mother ;
    String boy01;
    String boy02;
    String girl01;
    String getGirl02;


    public Family(String father, String mother, String boy01, String boy02, String girl01, String getGirl02) {
        this.father = father;
        this.mother = mother;
        this.boy01 = boy01;
        this.boy02 = boy02;
        this.girl01 = girl01;
        this.getGirl02 = getGirl02;
    }

    public Family(String father, String mother, String boy01, String girl01) {
        this.father = father;
        this.mother = mother;
        this.boy01 = boy01;
        this.girl01 = girl01;
    }

    public Family(String boy01) {
//        this();                 //기본 생성자가 없는 상태에서 기본생성자를 호출했으니 에러가 뜰 수 밖에
        this.boy01 = boy01;
    }

    public Family(String father, String mother, String boy01) {

        this.father = father;
        this.mother = mother;
        this.boy01 = boy01;
//        this();                     //this()는 가장 위에 생성이 되어야하는데 그렇지 않고 마지막에 두었을 때


    }

}


public class Constructer {
    public static void main(String[] args) {

        Family GH = new Family("기호","기호","기호");

    }

}
/*
* this()라는 키워드는 생각보다 좀 더 합리적이고 코드의 중복을 줄여준다.
* java가 띄워주는 에러메시지를 확인 할 줄 알게 되니 생각보다 java가 합리적이고 좋은 언어라는 생각을 한다.
*
*
* */