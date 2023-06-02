package cn.oneao.InterfaceSegregationPrinciple.after;



public class Client {
    public static void main(String[] args) {
        OneaoSafetyDoor one = new OneaoSafetyDoor();
        one.antiTheft();
        one.fireproof();
        one.waterproof();
    }
}
