// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

import java.util.Iterator;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public final class ArrayCreatingInputMerger extends cml
{
    public final cmh a(final List list) {
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final Map c = ((cmh)iterator.next()).c();
            c.getClass();
            for (final Map.Entry<String, V> entry : c.entrySet()) {
                final String s = entry.getKey();
                final V value = entry.getValue();
                Class<?> class1;
                if (value == null || (class1 = value.getClass()) == null) {
                    class1 = String.class;
                }
                final Object value2 = hashMap2.get(s);
                s.getClass();
                Object o;
                if (value2 == null) {
                    if (class1.isArray()) {
                        o = value;
                    }
                    else {
                        o = Array.newInstance(class1, 1);
                        Array.set(o, 0, value);
                        o.getClass();
                    }
                }
                else {
                    final Class<?> class2 = value2.getClass();
                    if (atnh.c(class2, class1)) {
                        value.getClass();
                        final int length = Array.getLength(value2);
                        final int length2 = Array.getLength(value);
                        final Class<?> componentType = value2.getClass().getComponentType();
                        componentType.getClass();
                        o = Array.newInstance(componentType, length + length2);
                        System.arraycopy(value2, 0, o, 0, length);
                        System.arraycopy(value, 0, o, length, length2);
                        o.getClass();
                    }
                    else {
                        if (!atnh.c(class2.getComponentType(), class1)) {
                            throw new IllegalArgumentException();
                        }
                        final int length3 = Array.getLength(value2);
                        o = Array.newInstance(class1, length3 + 1);
                        System.arraycopy(value2, 0, o, 0, length3);
                        Array.set(o, length3, value);
                        o.getClass();
                    }
                }
                o.getClass();
                hashMap2.put(s, o);
            }
        }
        cjz.e((Map)hashMap2, (Map)hashMap);
        return cjz.d((Map)hashMap);
    }
}
