import java.lang.reflect.Array;
    public class GenericArrayUtility {

        public static <T> T[] mergeArrays(T[] a, T[] b) {
            // Handle null inputs
            if (a == null && b == null) {
                return (T[]) new Object[0];
            } else if (a == null) {
                return b;
            } else if (b == null) {
                return a;
            }

            // Create a new array with combined length and correct type
            @SuppressWarnings("unchecked")
            T[] result = (T[]) Array.newInstance(a.getClass().getComponentType(), a.length + b.length);

            // Copy elements
            System.arraycopy(a, 0, result, 0, a.length);
            System.arraycopy(b, 0, result, a.length, b.length);

            return result;
        }
    }




