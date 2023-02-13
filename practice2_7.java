public class practice2_7 {
    public static void main(String[] args) {
        //2-4. 다음 중 변수를 잘못 초기화 한 것은?
        byte b = 256;
        char c = '';
        char answer = 'no';
        float f = 3.14
        double d = 1.4e3f;

        byte b = 256;
        //byte = 8 bit 2^7=128까지 표기 가능. 초기화 할 수 없음
        char c = '';
        //char는 16bit 2^16=65,536.
        // ''안에는 문자가 들어가야 한다. 만약 공백을 표기하고 싶었다면 ""이들어갔어야함
        //문자와 문자열의 차이는 ?
        char answer = 'no';
        //'n';이나 'o';가 들어가는 것은 가능
        //"no";로 표기해야한다.
        float f = 3.14
        // float 32bit(4byte) 까지 표현 가능
        //;로 마무리가 되지 않아서 오류가 날 것 같다

        double d = 1.4e3f;
        //double 은 64bit까지 가능(8byte)
        // 어떤 숫자가 도출되는지 모르겠다.

        System.out.println('J' +"ava");
        //아스키코드 J값에 문자열의 합. 기본형과 참조형의 합은 어떻게 나오는거지?
        //74ava?
        //두개의 값중에 더 큰 값으로 통일된다. 문자는 char 2byte 참조형은 4byte이므로 참조형으로 통일
        //근데 왜 JAVA가 나오는거지?

        System.out.println(true + null);
        //true (null
        //true가 뜰 줄 알았는데 오류가 나왔다. null은 아무것도 없음 아닌가.

    }
}
