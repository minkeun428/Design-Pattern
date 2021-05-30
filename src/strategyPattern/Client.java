package strategyPattern;

/**
 * 템플릿 메서드 패턴과 유사
 * 단일 상속만이 가능한 자바에서는 상속이라는 제한이 있는
 * 템플릿 메서드 패턴보다는 전략 패턴이 더 많이 활용됨.
 */

public class Client {
    public static void main(String[] args) {
        Strategy strategy = null;
        Soldier rambo = new Soldier();

        //총을 람보에게 전달해서 전투를 수행하게 한다
        strategy = new StrategyGun();
        rambo.runContext(strategy);

        //검을 전달
        strategy = new StrategySword();
        rambo.runContext(strategy);

        //활을 전달
        strategy = new StrategyBow();
        rambo.runContext(strategy);
    }
}
