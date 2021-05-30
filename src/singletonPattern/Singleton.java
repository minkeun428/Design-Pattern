package singletonPattern;

/**
 * 싱글톤 패턴 = 클래스의 객체를 하나만 만들어서 사용하는 패턴
 * */
public class Singleton {
    static Singleton singletonObject;   //정적 참조 변수

    private Singleton() {};   //private 생성자

    //객체 반환 정적 메서드
    public static Singleton getInstance() {
        if(singletonObject ==  null) {   //정적 참조 변수가 빈 값일 때만 생성함. (한 주소만 바라보고 있음)
            singletonObject = new Singleton();
        }

        return singletonObject;
    }
}
