import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahak extends aham
{
    private static final Class c;
    
    static {
        c = Collections.unmodifiableList(Collections.emptyList()).getClass();
    }
    
    public ahak() {
    }
    
    static List a(final Object o, final long n) {
        return (List)ahcj.i(o, n);
    }
    
    private static List e(final Object o, final long n, final int n2) {
        final List a = a(o, n);
        Object e;
        if (a.isEmpty()) {
            if (a instanceof ahaj) {
                e = new ahai(n2);
            }
            else if (a instanceof ahbf && a instanceof agzy) {
                e = ((agzy)a).e(n2);
            }
            else {
                e = new ArrayList(n2);
            }
            ahcj.v(o, n, e);
        }
        else {
            Object o2;
            if (ahak.c.isAssignableFrom(((ahce)a).getClass())) {
                final ArrayList list = new ArrayList(a.size() + n2);
                list.addAll(a);
                ahcj.v(o, n, (Object)list);
                o2 = list;
            }
            else if (a instanceof ahce) {
                final ahai ahai = new ahai(a.size() + n2);
                ((agxo)ahai).addAll(a);
                ahcj.v(o, n, (Object)ahai);
                o2 = ahai;
            }
            else {
                e = a;
                if (!(a instanceof ahbf)) {
                    return (List)e;
                }
                e = a;
                if (!(a instanceof agzy)) {
                    return (List)e;
                }
                final agzy agzy = (agzy)a;
                if (agzy.c()) {
                    e = a;
                    return (List)e;
                }
                final agzy e2 = agzy.e(a.size() + n2);
                ahcj.v(o, n, (Object)e2);
                return (List)e2;
            }
            e = o2;
        }
        return (List)e;
    }
    
    public final List b(final Object o, final long n) {
        return e(o, n, 10);
    }
    
    public final void c(final Object o, final long n) {
        final List list = (List)ahcj.i(o, n);
        Object o2;
        if (list instanceof ahaj) {
            o2 = ((ahaj)list).d();
        }
        else {
            if (ahak.c.isAssignableFrom(list.getClass())) {
                return;
            }
            if (list instanceof ahbf && list instanceof agzy) {
                final agzy agzy = (agzy)list;
                if (agzy.c()) {
                    agzy.b();
                }
                return;
            }
            o2 = Collections.unmodifiableList((List<?>)list);
        }
        ahcj.v(o, n, o2);
    }
    
    public final void d(final Object o, final Object o2, final long n) {
        List a = a(o2, n);
        final List e = e(o, n, a.size());
        final int size = e.size();
        final int size2 = a.size();
        if (size > 0 && size2 > 0) {
            e.addAll(a);
        }
        if (size > 0) {
            a = e;
        }
        ahcj.v(o, n, (Object)a);
    }
}
