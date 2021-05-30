package adapterPattern2;

public class ClientWithAdapter {
    public static void main(String args[]) {

        //변환기 역할을 하는 AdapterServiceA,B를 생성
        //그 안에서 ServiceA,B가 가지고 있는 runService()메소드를 호출

        //호출 당하는 쪽의 메서드를 호출하는 쪽의 코드에 대응하도록
        //중간에 변환기를 통해 호출하는 패턴

        AdapterServiceA asa1 = new AdapterServiceA();
        AdapterServiceB asb1 = new AdapterServiceB();

        asa1.runService();
        asb1.runService();
    }
}
