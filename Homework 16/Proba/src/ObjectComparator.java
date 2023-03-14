import java.lang.reflect.Array;
import java.lang.reflect.Field;

public class ObjectComparator {

    public static boolean compareObjects(Object obj1, Object obj2) throws IllegalAccessException {

        if (obj1 == null && obj2 == null) {
            return true;
        }
        if (obj1 == null || obj2 == null) {
            return false;
        }

        Class<?> clazz = obj1.getClass();

        if (!clazz.equals(obj2.getClass())) {
            return false;
        }

        if (clazz.isArray()) {
            int length = Array.getLength(obj1);
            if (length != Array.getLength(obj2)) {
                return false;
            }
            for (int i = 0; i < length; i++) {
                Object element1 = Array.get(obj1, i);
                Object element2 = Array.get(obj2, i);
                if (!compareObjects(element1, element2)) {
                    return false;
                }
            }
            return true;
        }

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Object value1 = field.get(obj1);
            Object value2 = field.get(obj2);
            if (!compareObjects(value1, value2)) {
                return false;
            }
        }
        return true;
    }

}
