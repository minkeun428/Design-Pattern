package templateMethodPattern;

public abstract class Animal {

    /**
     * 템플릿 메서드는 공통 로직을 수행하고, 그안에
     * 하위 클레스에게 강제로 구현시키는 추상 메서드를 만들거나
     * 하위 클래스가 선택적으로 오버라이딩할 수 있는 훅 메서드를 만든다.
     * 의존 역전 원칙(DIP)를 활용함. = 자신보다 변하기 쉬운 것에 의존하지 않음.
     */

    //템플릿(견본) 메서드
    public void playWithOwner() {
        System.out.println("귀염둥이 이리온...");
        play();
        runSomething();
        System.out.println("잘했어");
    }

    //추상 메서드 = 하위 클래스에게 구현을 강제함
    abstract void play();

    //Hook 메서드 = 하위 클래스가 선택적으로 오버라이딩할 수 있음
    void runSomething() {
        System.out.println("꼬리 살랑 살랑~");
    }

}
