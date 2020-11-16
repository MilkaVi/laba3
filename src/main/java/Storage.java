import pckg.MyObject;

import java.util.*;

public class Storage {
    private static Map<Integer, MyObject> objects = new HashMap<>();
    static {
        MyObject object;
        object = new MyObject();
        object.setTickedNum("34");
        object.setGroup("1801");
        object.setName("nikola");
        object.setSecondName("vakar");
        object.setLastName("nikolka");
        object.setMark1(8);
        object.setMark2(9);
        object.setMark3(9);
        object.setMark4(9);
        object.setAvarageMark();
        create(object);
    }

    public static Collection<MyObject> readAll() {
        return objects.values();
    }

    public static MyObject readById(Integer id) {
        return objects.get(id);
    }

    public static void create(MyObject object) {
        /* минимальное значение идентификатора */
        Integer id = 1;
        /* множество идентификаторов всех объектов в списке */
        Set<Integer> ids = objects.keySet();
        if(!ids.isEmpty()) {
            /* вычисление идентификатора, на 1 большего
             * максимального из существующего */
            id += Collections.max(ids);
        }
        object.setId(id);
        objects.put(id, object);
    }

    public static void update(MyObject object) {
        objects.put(object.getId(), object);
    }

    public static void delete(Integer id) {
        objects.remove(id);
    }
}