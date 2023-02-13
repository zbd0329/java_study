public class practice3_1 {
    public static void main(String[] args) {
        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;
//3-1. 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
        b = (byte)i;
        //형 변환 생략할 수 없음.
        //변수 b는 byte타입의 10(2진법), i는 int상수로 100이기 때문에 범위가 다름

        ch = (char)b;
        //형 변환 생략 불가
        //ch는 char이고 b는 byte. 이게 맞나? 아리송

        short s = (short)ch;
        //형 변환 생략 불가
        //short와 char는 같은 2비트이지만 범위가 다르다. 서로 끼워 넣을 수 없다.

        float f = (short)ch;
        //생략 가능
        //boolean,byte(1 bit) < short < char (2 bit) < int < float(4 bit) < long,double (8 bit)

        i = (int)ch;
        //형 변환 생략 가능
        //int는 char보다 범위가 크다.
        //다이어그램으로 그려서 생각하면 더 쉬울것 같다.

        //boolean,byte(1 bit) < short < char (2 bit) < int < float(4 bit) < long,double (8 bit)

    }
}
