import cp6.variableKing.MyMath;

/**
 * packageName    :
 * fileName       : ${NAME}
 * author         : ${USER}
 * date           : ${DATE}
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * ${DATE}        ${USER}       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long value = mm.add(1L, 2L);
        System.out.println("value = " + value);
    }
}