package ch7_51;
/*<[자바의 정석 - 기초편] ch7-51,52 익명 클래스>
 * https://youtu.be/jRusDJ5ca4g?si=uQ6Hneg1lV-27mgu
 *new 조상클래스이름/구현인터페이스이름 (){ code }
 * */

//일반적으로 클래스 사용하는 과정은 "클래스 정의"와 "객체 생성"과정으로 이뤄진다.

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass {
    public static void main(String[] args) {
        Button b = new Button("start");
        //b.addActionListener(new EventHandler());//2. 객체 생성
        b.addActionListener(new ActionListener(){ //조상의 이름(조상클래스/구현인터페이스 이름)
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred");
            }
        });
    }
}
//1. 클래스 정의
class EventHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent occurred");
    }
}
//하지만 위와 같은 리스너들은 대부분 "일회성"이다.
// => 따라서 익명클래스로 사용하면 더 효율적이다.