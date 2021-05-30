package templateCallbackPatternRefactoring;

import strategyPattern.Strategy;

public class Soldier {
    void runContext(String weaponSound) {
        System.out.println("전투 시작");
        executeWeapon(weaponSound).runStrategy();
        System.out.println("전투 종료");
        System.out.println();
    }

    // 전략을 생성하는 코드가 컨텍스트, 즉 군인 내부로 들어옴.
    private Strategy executeWeapon(final String weaponSound) {

        //새 생성자를 리턴하는데, 하나의 인터페이스의 메소드를 오버라이딩하여
        //전달 받은 각각의 sound를 호출함.
        return new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println(weaponSound);
            }
        };

    }
}
