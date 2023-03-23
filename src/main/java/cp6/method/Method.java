package cp6.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

/**
 * packageName    : cp6.method
 * fileName       : Method
 * author         : ipeac
 * date           : 2023-03-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-23        ipeac       최초 생성
 */
public class Method {
    public static void main(String[] args) throws IOException {
        printGugudan(2);
    }

    public static void printGugudan(int dan) {
        if (!(2 <= dan && dan <= 9)) {
            return; // 명시적 종료 2 ~ 9 단이 아닌경우 함수를 종료하고 호출한 main 메서드로 다시 이동
        }

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", dan, i, dan * i);
        }

        return; // 명시적으로 함수의 종료를 나타내는데  void 메서드의 마지막구간에는 return 문이 불필요하다.
    }

}
