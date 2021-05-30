package proxyPattern;

public class ClientWithProxy {
    public static void main(String[] args) {
        //프록시를 이용한 호출
        IService proxy = new Proxy();

        //Proxy가 가지고 있는 메소드 호출
        System.out.println(proxy.runSomething());
    }
}
