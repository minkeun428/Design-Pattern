package adapterPattern2;

public class AdapterServiceA {

    //ServiceA의 메소드를 호출하는 중간 변환기 역할
    //ServiceA의 메소드를 직접 호출 하는 것보다
    //중간 어댑터 클래스를 생성하여 호출하는 패턴
    //이 변환기들을 인터페이스를 구현하게 해서 더 개선할 수도 있지만
    //개념 정리를 위해 여기까지만 구현함

    ServiceA sa1 = new ServiceA();

    void runService() {
        sa1.runServiceA();
    }

}
