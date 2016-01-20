/**
 * Created by YB on 20.01.2016.
 */
public class Launcher {

    public static void main(String [ ] args)
    {
        // Create different types of boxes

        Box <Integer> integerBox = new Box<Integer>();
        Box <String> stringBox = new Box<String>();

        // Create Values

        int oneInt = 1;
        int twoInt = 2;
        int threeInt = 3;

        String oneStr = "one";
        String twoStr = "two";
        String threeStr = "three";

        // Fill LinkedLists

        integerBox.addItem(oneInt);
        integerBox.addItem(twoInt);
        integerBox.addItem(threeInt);

        stringBox.addItem(oneStr);
        stringBox.addItem(twoStr);
        stringBox.addItem(threeStr);

        // REMOVE items from Int box

        integerBox.listItems();
        integerBox.removeItem(twoInt);
        integerBox.listItems();

        // REMOVE items from String Box

        stringBox.listItems();
        stringBox.removeItem(twoStr);
        stringBox.listItems();

    }

}
