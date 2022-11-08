import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atnc
{
    private static final Object[] a;
    
    static {
        a = new Object[0];
    }
    
    public static final Object[] a(final Collection collection) {
        final int size = collection.size();
        Object[] array;
        if (size == 0) {
            array = atnc.a;
        }
        else {
            final Iterator iterator = collection.iterator();
            if (!iterator.hasNext()) {
                array = atnc.a;
            }
            else {
                array = new Object[size];
                int n = 0;
                while (true) {
                    final int n2 = n + 1;
                    array[n] = iterator.next();
                    Object[] copy;
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
                        copy = Arrays.copyOf(array, n3);
                        copy.getClass();
                    }
                    else {
                        copy = array;
                        if (!iterator.hasNext()) {
                            array = Arrays.copyOf(array, n2);
                            array.getClass();
                            break;
                        }
                    }
                    n = n2;
                    array = copy;
                }
            }
        }
        return array;
    }
    
    public static final Object[] b(final Collection collection, Object[] copy) {
        final int size = collection.size();
        int n = 0;
        if (size == 0) {
            if (copy.length > 0) {
                copy[0] = null;
                return copy;
            }
        }
        else {
            final Iterator iterator = collection.iterator();
            if (!iterator.hasNext()) {
                if (copy.length > 0) {
                    copy[0] = null;
                    return copy;
                }
            }
            else {
                Object[] array;
                if (size <= copy.length) {
                    array = copy;
                }
                else {
                    final Object instance = Array.newInstance(copy.getClass().getComponentType(), size);
                    instance.getClass();
                    array = (Object[])instance;
                }
                while (true) {
                    final int n2 = n + 1;
                    array[n] = iterator.next();
                    Object[] copy2;
                    if (n2 >= array.length) {
                        if (!iterator.hasNext()) {
                            copy = array;
                            break;
                        }
                        int n3;
                        if ((n3 = n2 * 3 + 1 >>> 1) <= n2) {
                            n3 = 2147483645;
                            if (n2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        copy2 = Arrays.copyOf(array, n3);
                        copy2.getClass();
                    }
                    else {
                        copy2 = array;
                        if (!iterator.hasNext()) {
                            if (array == copy) {
                                copy[n2] = null;
                                break;
                            }
                            copy = Arrays.copyOf(array, n2);
                            copy.getClass();
                            break;
                        }
                    }
                    n = n2;
                    array = copy2;
                }
            }
        }
        return copy;
    }
}
