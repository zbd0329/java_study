public class practice3_2 {
    public static void main(String[] args) {
        //3-2. 다음 연산의 결과와 그 이유를 적으세요.
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2); //true
//        System.out.println(y >= 5); //true
//        System.out.println(x < 0 ); //false
//        System.out.println(x > 2); //false

        System.out.println(y += 10 - x++);
//y에 10을 더해서 y에 다시 넣으면 15가 된다. 그 상태에서 x(2)를 빼면 13이 된다.

        System.out.println(x += 2);
//x에 2를 더한값을 x에 넣으면 4가 된다.

        System.out.println(!('A' <= c && c <= 'Z'));
//ture and true 는 ture 그 상태에서 !로 반대가되면 false
        System.out.println('C' - c);
//피연산자의 타입이 int보다 작은 타입이면 int로 변환된다.
//둘 다 int보다 작기 때문에 int로 변환된다.
        System.out.println('5' - '0');
//int로 변환되어 계산하면 그대로 5가 나온다.

        System.out.println(c + 1);
//c가 int로 변환되어 65가되고 +1하면 66

        System.out.println(++c);
//단항 연산자는 형변환을 하지 않는다.
//실제로 변수 c에 저장된 값은 문자코드 65이므로 +1을하면 66이 되고
// 66은 문자코드에서 'B'가 된다.

        System.out.println(c++);
//후위형은 변수가 출력된 후에 값이 증가하므로 값이 변하지 않은것으로 보인다.
        System.out.println(c++);
        System.out.println(c);
//하지만 후위형 이후에 c값을 출력해보면 값이 변한것을 알 수 있다.

    }
}
