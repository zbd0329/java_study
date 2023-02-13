public class practice2_8 {
    public static void main(String[] args) {
        //2-8. 아래는 변수 x, y, z의 값을 서로 바꾸는 예제이다. 결과와 같이 출력되도록 코드를 넣으세요.
        int x = 1;
        int y = 2;
        int z = 3;

        int tmp = x;
        x = y;
        y = z;
        z = tmp;

        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);

    }
}
