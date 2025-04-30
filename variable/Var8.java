package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte b = 127; // -128~127까지 저장 가능
        short s = 32767; //-32768 ~ 32767
        int i = 2147483647; //-2,147,483,648 ~ 2,147,483,647 (약 20억)

        //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long l = 9223372036854775807L; //가장 긴 정수 저장 가능

        //실수
        float f = 10.0f; //표현 범위 작음
        double d = 10.0; //실수 리터럴 보통은 double을 씀 float 쓸거면 f붙혀서 쓰기. //표현 범위 쟤보다 큼

        // 실무에서 거의 사용 x : byte(파일 전송 복사엔 주로 사용), short, float, char
        // 자주 사용하는 타입 : 정수 - int, long(20억 넘을 거 같을 때 씀) 실수 - double 불린형 - boolean 참 거짓 (조건문에 자주 사용) 문자열 - String

        //관례: 변수 이름을 지을 때 소문자로 표기하는 낙타 표기법 ex) orderDetail , my account -> myAccount
        // 자바 클래스 이름 첫글자는 대문자. 나머지는 첫글자 소문자 표기(낙타표기법)
        // 상수는 모두 대문자 언더바로 구분 USER_LIMIT
        // 패키지는 모두 소문자 org.spring.boot

        // 실무에서는 a,b 이런 변수 이름 ㄴㄴ, 용도 명확한 변수 이름하기(프로그램의도를잘알수있음!)  ex ) studentCount
    }
}
