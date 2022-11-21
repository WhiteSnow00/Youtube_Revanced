import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atqu
{
    private static final Object[] a;
    
    static {
        a = new Object[0];
    }
    
    public static final Object[] a(final Collection collection) {
        final int size = collection.size();
        Object[] array;
        if (size == 0) {
            array = atqu.a;
        }
        else {
            final Iterator iterator = collection.iterator();
            if (!iterator.hasNext()) {
                array = atqu.a;
            }
            else {
                array = new Object[size];
                int n = 0;
                while (true) {
                    array[n] = iterator.next();
                    final int n2 = n + 1;
                    if (n2 >= array.length) {
                        if (!iterator.hasNext()) {
                            break;
                        }
                        int n3;
                        if ((n3 = n2 * 3 + 1 >>> 1) <= n2) {
                            n3 = 2147483645;
                            if (n2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        array = Arrays.copyOf(array, n3);
                        array.getClass();
                        n = n2;
                    }
                    else {
                        n = n2;
                        if (!iterator.hasNext()) {
                            array = Arrays.copyOf(array, n2);
                            array.getClass();
                            break;
                        }
                        continue;
                    }
                }
            }
        }
        return array;
    }
    
    public static final Object[] b(final Collection collection, final Object[] array) {
        final int size = collection.size();
        int n = 0;
        Object[] array2;
        if (size == 0) {
            array2 = array;
            if (array.length > 0) {
                array[0] = null;
                return array;
            }
        }
        else {
            final Iterator iterator = collection.iterator();
            if (!iterator.hasNext()) {
                array2 = array;
                if (array.length > 0) {
                    array[0] = null;
                    return array;
                }
            }
            else {
                if (size <= array.length) {
                    array2 = array;
                }
                else {
                    final Object instance = Array.newInstance(array.getClass().getComponentType(), size);
                    instance.getClass();
                    array2 = (Object[])instance;
                }
                while (true) {
                    array2[n] = iterator.next();
                    final int n2 = n + 1;
                    if (n2 >= array2.length) {
                        if (!iterator.hasNext()) {
                            break;
                        }
                        int n3;
                        if ((n3 = n2 * 3 + 1 >>> 1) <= n2) {
                            n3 = 2147483645;
                            if (n2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        array2 = Arrays.copyOf(array2, n3);
                        array2.getClass();
                        n = n2;
                    }
                    else {
                        n = n2;
                        if (iterator.hasNext()) {
                            continue;
                        }
                        if (array2 == array) {
                            array[n2] = null;
                            array2 = array;
                            break;
                        }
                        array2 = Arrays.copyOf(array2, n2);
                        array2.getClass();
                        break;
                    }
                }
            }
        }
        return array2;
    }
}
