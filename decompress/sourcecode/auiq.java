import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class auiq implements auja, auiz
{
    private final auja[] a;
    private final auiz[] b;
    
    public auiq(final List list) {
        final ArrayList list2 = new ArrayList();
        final ArrayList list3 = new ArrayList();
        for (int size = list.size(), i = 0; i < size; i += 2) {
            final Object value = list.get(i);
            if (value instanceof auja) {
                if (value instanceof auiq) {
                    d(list2, ((auiq)value).a);
                }
                else {
                    list2.add(value);
                }
            }
            final Object value2 = list.get(i + 1);
            if (value2 instanceof auiz) {
                if (value2 instanceof auiq) {
                    d(list3, ((auiq)value2).b);
                }
                else {
                    list3.add(value2);
                }
            }
        }
        if (list2.size() <= 0) {
            this.a = null;
        }
        else {
            this.a = (auja[])list2.toArray(new auja[list2.size()]);
        }
        if (list3.size() <= 0) {
            this.b = null;
            return;
        }
        this.b = (auiz[])list3.toArray(new auiz[list3.size()]);
    }
    
    private static final void d(final List list, final Object[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                list.add(array[i]);
            }
        }
    }
    
    public final int a(final aufq aufq) {
        final auja[] a = this.a;
        int length = a.length;
        int n = 0;
        while (--length >= 0) {
            n += a[length].a(aufq);
        }
        return n;
    }
    
    public final int b(final aufq aufq, final int n) {
        auja[] a;
        int length;
        int n2;
        for (a = this.a, length = a.length, n2 = 0; n2 < n && --length >= 0; n2 += a[length].b(aufq, Integer.MAX_VALUE)) {}
        return n2;
    }
    
    public final void c(final StringBuffer sb, final aufq aufq) {
        final auja[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            a[i].c(sb, aufq);
        }
    }
}
