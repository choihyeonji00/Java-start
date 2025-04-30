package variable;

public class Var6 {
    public static void main(String[] args) {
        int a; //초기값 안주고 출력하면 ? 오류 = 컴파일 에러(문법에 맞지 x) = 초기화 안된거다.
        //System.out.println(a); //잘못된 예 , 자바는 변수를 초기화하도록 강제함.
    }// 결론 ! 컴파일 단계에서 최적화를 한다.
}
