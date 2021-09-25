package Katas;


import java.util.ArrayList;

public class LoopInspector {

    public int loopSize(Node node) {
        List<Node> list = new ArrayList();
        while(!list.contains(node)) {
            list.add(node);
            node = node.getNext();
        }
        return list.size() - list.indexOf(node);
    }

}
