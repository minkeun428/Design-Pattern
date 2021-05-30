package factoryMethodPattern;

public class Driver {
    /**
     * Animal의 하위 클래스들은 해당 메서드를 강제적으로 구현해야 함.
     * 팩토리 메서드 = 객체를 생성 반환하는 메서드.
     * 오버라이드된 메서드가 객체를 반환하는 패턴.
     * 팩토리 메서드 패턴은 의존 역전 원칙(DIP)를 활용함. = 나보다 변하기 쉬운 것에 의존하지 않음.
     * */

    public static void main(String args[]) {

        //팩토리 메서드를 보유한 객체들 생성
        Animal bolt = new Dog();
        Animal kitty = new Cat();

        //팩토리 메서드가 반환하는 객체들
        AnimalToy boltBall = bolt.getToy();
        AnimalToy kittyTower = kitty.getToy();

        //팩토리 메서드가 반환한 객체들을 사용
        boltBall.identify();
        kittyTower.identify();
    }
}
