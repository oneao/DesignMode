package cn.oneao.DependencyInversionPrinciple.after;


public class KingstonMemory implements Memory {

    public void save() {
        System.out.println("使用金士顿内存条");
    }
}
