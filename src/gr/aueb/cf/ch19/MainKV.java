package gr.aueb.cf.ch19;

public class MainKV {

    public static void main(String[] args) {
        GenericNodeKV<Integer, String> nodeKV = new GenericNodeKV<>();
        nodeKV.setKey(1);
        nodeKV.setValue("AUEB");

        System.out.println(nodeKV);
    }
}
