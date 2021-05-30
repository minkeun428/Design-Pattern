package singletonPattern;

public class Client {
    public static void main(String[] args) {

        // private 생성자이므로 new를 통해 인스턴스를 생성 못함
        // Singleton s = new Singleton(); --> 실행 시, 컴파일 에러

        Singleton s1 = Singleton.getInstance();  //static(정적) 메서드라서 바로 호출 가능
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1);   //같은 주소값 얻음
        System.out.println(s2);   //하나의 단일 객체를 참조하고 있기 때문
        System.out.println(s3);   //단일 객체는 쓰기 가능한 속성을 갖지 않는 것이 정석임

        s1 = null;
        s2 = null;
        s3 = null;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
