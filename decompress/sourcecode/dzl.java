import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dzl
{
    public static final List a;
    public int b;
    public int c;
    public int d;
    public int e;
    public eeh f;
    public List g;
    public List h;
    public List i;
    
    static {
        a = new ArrayList();
    }
    
    public dzl(int i, int size, final int d, final int e, eeh s, final List list, final List list2, final List list3) {
        this.b = i;
        this.c = size;
        this.d = d;
        this.e = e;
        eeh s2 = s;
        if (s == null) {
            s2 = ebq.s();
        }
        this.f = s2;
        if (list == null) {
            this.g = dzl.a;
        }
        else {
            size = list.size();
            this.g = new ArrayList(size);
            eeh eeh;
            List g;
            for (i = 0; i < size; ++i) {
                eeh = list.get(i);
                g = this.g;
                if ((s = eeh) == null) {
                    s = ebq.s();
                }
                g.add(s);
            }
        }
        if (list2 != null) {
            this.h = Collections.unmodifiableList((List<?>)list2);
        }
        if (list3 != null) {
            this.i = Collections.unmodifiableList((List<?>)list3);
        }
    }
    
    public static dzl a(final int n, final int n2, final Object o) {
        List<Object> singletonList;
        if (o != null) {
            singletonList = Collections.singletonList(o);
        }
        else {
            singletonList = null;
        }
        return g(0, n, n2, 1, null, null, singletonList, singletonList);
    }
    
    public static dzl b(final int n, final int n2, final int n3, final List list, final List list2, final List list3) {
        return g(n, n2, -1, n3, null, list, list2, list3);
    }
    
    public static dzl c(final int n, final int n2, final eeh eeh, final Object o, final Object o2) {
        List<Object> singletonList = null;
        List<Object> singletonList2;
        if (o != null) {
            singletonList2 = Collections.singletonList(o);
        }
        else {
            singletonList2 = null;
        }
        if (o2 != null) {
            singletonList = Collections.singletonList(o2);
        }
        return g(n, n2, -1, 1, eeh, null, singletonList2, singletonList);
    }
    
    static dzl d(final dzl dzl) {
        return g(dzl.b, dzl.c, dzl.d, dzl.e, dzl.f, dzl.g, dzl.h, dzl.i);
    }
    
    static dzl e(final dzl dzl, final int n) {
        final int d = dzl.d;
        int n2;
        if (d >= 0) {
            n2 = d + n;
        }
        else {
            n2 = -1;
        }
        return g(dzl.b, dzl.c + n, n2, dzl.e, dzl.f, dzl.g, dzl.h, dzl.i);
    }
    
    static dzl f(final int n, final Object o) {
        return c(3, n, ebq.s(), o, null);
    }
    
    private static dzl g(final int n, final int n2, final int n3, final int n4, final eeh eeh, final List list, final List list2, final List list3) {
        return new dzl(n, n2, n3, n4, eeh, list, list2, list3);
    }
}
