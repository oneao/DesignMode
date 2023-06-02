package cn.oneao.InterfaceSegregationPrinciple.before;

public class Client {
    public static void main(String[] args) {
        OneaoSafetyDoor door = new OneaoSafetyDoor();
        door.antiTheft();
        door.fireProof();
        door.waterProof();
    }
}
