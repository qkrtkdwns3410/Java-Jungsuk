package cp6.classAndInstance;

import java.io.IOException;

/**
 * packageName    : cp6.classAndInstance
 * fileName       : Tv
 * author         : ipeac
 * date           : 2023-03-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-21        ipeac       최초 생성
 */
public class Tv {
    /*
     * 속성 :  크기, 길이, 높이, 색상, 볼륨 등등
     * 기능 : 켜기, 끄기, 볼룸 업 다운 등
     */
    String color;
    boolean power;
    int channel;
    
    void power() {
        power = !power;
    }
    
    void channelUp() {
        channel++;
    }
    
    void channelDown() {
        channel--;
    }
}

class TvTest {
    public static void main(String[] args) throws IOException {
        Tv tv;
        tv = new Tv();
        tv.channel = 7;
        tv.channelDown();
        System.out.println("tv.channel = " + tv.channel); // tv.channel = 6
    }
}

class TvTest3 {
    public static void main(String[] args) throws IOException {
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        System.out.println("tv1 = " + tv1.channel);
        System.out.println("tv1 = " + tv2.channel);
        
        System.out.println("tv1 = " + tv1);
        System.out.println("tv2 = " + tv2);
        
    }
}

class TvTest4 {
    public static void main(String[] args) throws IOException {
        Tv[] tvArr = new Tv[3]; // 길이가 3인 Tv 객체 배열
        
        //Tv 객체를 생성해서 Tv 객체 배열의 각 요소에 저장
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10; // tvArr[i] 의 channel에 i+10 저장
        }
        for (Tv tv : tvArr) {
            tv.channelUp();
            System.out.println("tvArr = " + tv.channel); // 0x 100 0x 200 0x 300 에 각각 메모리 할당 후 각각 멤버변수마다 i+10 값으로 초기 설정 => channelUp 메서드로 각각 주소의  값을 +1 시킨값을 프린트
/*            tvArr = 11
            tvArr = 12
            tvArr = 13*/
        }
        
    }
}
