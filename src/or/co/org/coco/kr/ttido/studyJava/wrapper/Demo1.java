package or.co.org.coco.kr.ttido.studyJava.wrapper;

public class Demo1 {
    public static void main(String[] args) {
        String str0 = "11";


        String str1 ="";
        str1 += 5;
//        String str2 = 5;            //문제가 되는 이유 >>>> 위의 식은 이미 str1이라는 것을 정의 하고 정의한 str1이라는 값에 5를 더함 >> 자동형변환을 통해 String 형으로 변환됨 but 아래는 걍 숫자 5를 문자열에 넣어라 >> 에러!!
                                    //즉 숫자 5를 문자열로 변환할 필요가 있음
        String str2 = "5";
        String str3 = String.valueOf(5);  //둘 중 하나를 넣어라             다른 형태의 값을 String 형으로 변환하라!
        Integer i = new Integer(10);
//      Integer i = Integer.valueOf(10) 과 같다.

    //    System.out.println(str1);

        VV v =new VV();

        System.out.println(v.bm(5));            //잘못만든것
                                                        //그러나 Auto Boxing 을 통해  상관 없어짐
        System.out.println(v.bm(i));
    }


}
class VV{
 /*   public String am(int num){
       return num.toString;                                            //에러가 발생한다.     이유는 메소드를 호출해야되는데 기본 데이터 타입의 변수가 들어감 >> 문제 생김
    }*/
    public String bm(Object obj){                                           //Object 타입의 obj라는 매개변수를 인자로 받고 있다. 문제 발생 X
        return obj.toString();                                              //인자로 숫자 5를 받았다. 이건 문제가 되어야 하지만 버전이 올라감 혹은 여러 요인등으로 인해 편의성을 봐주는 것같다. 하지만 원칙적으로는 wrapper 클래스로 감싸야함
    }
}
