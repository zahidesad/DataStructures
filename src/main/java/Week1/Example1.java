package Week1;

import java.util.ArrayList;

/**
 *
 * @author zahid
 */
public class Example1 {

    public static void main(String[] args) {
        /*ArrayList list = new ArrayList();
        String s = "dasdasd";
        list.add(s);
        int i = 1;
        list.add(i);
        //String k = list.get(1);
        int b = 0;
        Object o = b;
        int c = (int) o;
        String t = (String) o;*/

        Box b1 = new Box();

        int i = 0;
        b1.setItem(i);
        String s = (String) b1.getItem();

        Box<String> b2 = new Box();
        b2.setItem(s);
        int r = Integer.parseInt(b2.getItem());

        BigBox<String, Integer> bb1 = new BigBox<>();
        //BigNumber <String> bn1 = new BigNumber<>(); //Error
        BigNumber <Integer> bn2 = new BigNumber<>();
        BigNumber <Double> bn3 = new BigNumber<>();
        
        ShapeBox <Rectangle> sb = new ShapeBox<>();
        sb.CompareWith("dsasa");
    }
}
