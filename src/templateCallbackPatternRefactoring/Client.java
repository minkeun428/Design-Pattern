package templateCallbackPatternRefactoring;

public class Client {
    public static void main(String[] args) {
        Soldier rambo = new Soldier();

        rambo.runContext("총 리펙토링 총!");
        rambo.runContext("칼 리펙토링 칼!");
        rambo.runContext("도끼 리펙토링 도끼!");
    }
}
