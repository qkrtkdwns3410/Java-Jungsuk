package cp6.variableKing;

import javax.crypto.spec.IvParameterSpec;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;

/**
 * packageName    : cp6.variableKing
 * fileName       : TestClass2
 * author         : ipeac
 * date           : 2023-03-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-24        ipeac       최초 생성
 */
public class TestClass2 {
    int iv; // 인스턴스 변수
    static int cv; // 클래스 변수(static 변수)

    void instanceMethod() {
        System.out.println("iv = " + iv);
        System.out.println("cv = " + cv);
        //지역변수 클래스 변수 모두 가능합니다 =>
    }

    static void staticMethod() {
        TestClass2 testClass2 = new TestClass2();
        testClass2.iv = 10;
        // System.out.println("iv = " + iv); => iv 는 당연히 안됨
        /*
        * iv 생성시기는 static 메서드가 메모리에 올라간 이후임. (만약 객체를 생성한다면)
        * 별도로 객체를 생성해주는 방법외에는 static 메서드가 메모리 올라간 시점에는 같은 레벨의 static 변수만 가능합니다.
        * */
        System.out.println("cv = " + cv);
    }
}
