package proxyPattern;

public class Proxy implements IService{
    /**
    * 대리자(Proxy)는 실제 서비스(ServiceImpl)와 같은 이름의 메서드를 구현함
    * Iservice 인터페이스를 사용함
    * 대리자는 실제 서비스의 같은 이름을 가진 메서드를 호출하고,
    * 그 값을 클라이언트에게 돌려줌.
    * (대리자는 실제 서비스의 메서드 호출 전후에 별도의 로직을 수행할 수도 있음.)
    **/

    IService service1;

    public String runSomething() {
        System.out.println("호출에 대한 흐름 제어가 주목적, 반환 결과를 그대로 전달");

        service1 = new ServiceImpl();

        return service1.runSomething();
    }
}
