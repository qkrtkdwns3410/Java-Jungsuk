package cp6.variableKing;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * packageName    : cp6.variableKing
 * fileName       : MyMath2
 * author         : ipeac
 * date           : 2023-03-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-24        ipeac       최초 생성
 */
public class MyMath2 {
    long a, b;

    long add() { // 인스턴스 메서드
        return a + b; // IV  a 와  b를 사용합니다.
    }

    static long add(long a, long b) { // 클래스 메서드 (static 메서드)
        return a + b; // 지역변수 a ,b 를 사용합니다.
    }

    public static void main(String[] args) throws IOException {
        MyMath2 mm = new MyMath2();
        mm.a = 10L;
        mm.b = 20L;

        long add = MyMath2.add(mm.a, mm.b);
        System.out.println("add = " + add);
    }
}
