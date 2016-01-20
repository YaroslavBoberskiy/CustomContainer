import java.util.LinkedList;

/**
 * Created by YB on 20.01.2016.
 */
public class Box<Generic> {

    private LinkedList<Generic> itemSaver = new LinkedList<Generic>();

    public void addItem (Generic item) {
        itemSaver.addLast(item);
    }

    public void removeItem (Generic item) {
        itemSaver.remove(item);
    }

    public void listItems () {
        for (Generic temp : itemSaver) {
            System.out.println(temp.toString());
        }
    }
}
