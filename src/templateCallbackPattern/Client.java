package templateCallbackPattern;

import strategyPattern.Soldier;
import strategyPattern.Strategy;

public class Client {
    public static void main(String[] args) {
        Soldier rambo = new Soldier();

        //익명 내부 클래스 선언1
        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("총! 총총 총이다!");
            }
        });

        //익명 내부 클래스 선언2
        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("칼! 칼칼 칼이다!");
            }
        });

        //익명 내부 클래스 선언3
        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("도끼! 도도끼 도끼다!");
            }
        });

    }
}
