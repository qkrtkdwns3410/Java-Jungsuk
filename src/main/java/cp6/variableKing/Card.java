package cp6.variableKing;

import java.io.*;

/**
 * packageName    : cp6.variableKing
 * fileName       : Card
 * author         : ipeac
 * date           : 2023-03-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-22        ipeac       최초 생성
 */
public class Card {
    //개별적 속성
    String kind;
    int number;
    
    //카드들의 공통적인 속성은 static으로 선언한다!
    static int width = 100;
    static int height = 250;
    
    public static void main(String[] args) throws IOException {
        Card.width = 200;
        Card.height = 300;
        //클래스 변수는 이런식으로 클래스이름을 직접 호출해서 width와 height 를 변경하면 모든 Card 클래스의 속성이 변경된다.
    }
}
