import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dzm
{
    public static final List a;
    public int b;
    public int c;
    public int d;
    public int e;
    public eei f;
    public List g;
    public List h;
    public List i;
    
    static {
        a = new ArrayList();
    }
    
    public dzm(int i, int size, final int d, final int e, eei s, final List list, final List list2, final List list3) {
        this.b = i;
        this.c = size;
        this.d = d;
        this.e = e;
        eei s2 = s;
        if (s == null) {
            s2 = ebr.s();
        }
        this.f = s2;
        if (list == null) {
            this.g = dzm.a;
        }
        else {
            size = list.size();
            this.g = new ArrayList(size);
            eei eei;
            List g;
            for (i = 0; i < size; ++i) {
                eei = list.get(i);
                g = this.g;
                if ((s = eei) == null) {
                    s = ebr.s();
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
    
    public static dzm a(final int n, final int n2, final Object o) {
        List<Object> singletonList;
        if (o != null) {
            singletonList = Collections.singletonList(o);
        }
        else {
            singletonList = null;
        }
        return g(0, n, n2, 1, null, null, singletonList, singletonList);
    }
    
    public static dzm b(final int n, final int n2, final int n3, final List list, final List list2, final List list3) {
        return g(n, n2, -1, n3, null, list, list2, list3);
    }
    
    public static dzm c(final int n, final int n2, final eei eei, final Object o, final Object o2) {
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
        return g(n, n2, -1, 1, eei, null, singletonList2, singletonList);
    }
    
    static dzm d(final dzm dzm) {
        return g(dzm.b, dzm.c, dzm.d, dzm.e, dzm.f, dzm.g, dzm.h, dzm.i);
    }
    
    static dzm e(final dzm dzm, final int n) {
        final int d = dzm.d;
        int n2;
        if (d >= 0) {
            n2 = d + n;
        }
        else {
            n2 = -1;
        }
        return g(dzm.b, dzm.c + n, n2, dzm.e, dzm.f, dzm.g, dzm.h, dzm.i);
    }
    
    static dzm f(final int n, final Object o) {
        return c(3, n, ebr.s(), o, null);
    }
    
    private static dzm g(final int n, final int n2, final int n3, final int n4, final eei eei, final List list, final List list2, final List list3) {
        return new dzm(n, n2, n3, n4, eei, list, list2, list3);
    }
}
