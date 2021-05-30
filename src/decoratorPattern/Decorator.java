package decoratorPattern;

import proxyPattern.IService;
import proxyPattern.ServiceImpl;

public class Decorator implements IService {
    /**
     * 장식자는 실제 서비스의 같은 이름을 가진 메서드를 호출하고,
     * 그 반환값에 장식을 더해 클라이언트에게 돌려줌.
     * **/

    IService service;

    public String runSomething() {
        System.out.println("호출에 대한 장식이 주목적, 클라이언트에게 반환 결과에 장식을 더하여 전달");

        service = new ServiceImpl();
        return "장식을 더했음! " + service.runSomething();
    }

}
