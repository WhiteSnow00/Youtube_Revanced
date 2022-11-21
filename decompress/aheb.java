import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

final class aheb extends ahed
{
    private static final Class c;
    
    static {
        c = Collections.unmodifiableList(Collections.emptyList()).getClass();
    }
    
    public aheb() {
    }
    
    static List a(final Object o, final long n) {
        return (List)ahfz.i(o, n);
    }
    
    private static List e(final Object o, final long n, final int n2) {
        final List a = a(o, n);
        Object e;
        if (a.isEmpty()) {
            if (a instanceof ahea) {
                e = new ahdz(n2);
            }
            else if (a instanceof ahew && a instanceof ahdp) {
                e = ((ahdp)a).e(n2);
            }
            else {
                e = new ArrayList(n2);
            }
            ahfz.v(o, n, e);
        }
        else {
            Object o2;
            if (aheb.c.isAssignableFrom(((ahfu)a).getClass())) {
                final ArrayList list = new ArrayList(a.size() + n2);
                list.addAll(a);
                ahfz.v(o, n, (Object)list);
                o2 = list;
            }
            else if (a instanceof ahfu) {
                final ahdz ahdz = new ahdz(a.size() + n2);
                ((ahbf)ahdz).addAll((Collection)a);
                ahfz.v(o, n, (Object)ahdz);
                o2 = ahdz;
            }
            else {
                e = a;
                if (!(a instanceof ahew)) {
                    return (List)e;
                }
                e = a;
                if (!(a instanceof ahdp)) {
                    return (List)e;
                }
                final ahdp ahdp = (ahdp)a;
                if (ahdp.c()) {
                    e = a;
                    return (List)e;
                }
                final ahdp e2 = ahdp.e(a.size() + n2);
                ahfz.v(o, n, (Object)e2);
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
        final List list = (List)ahfz.i(o, n);
        Object o2;
        if (list instanceof ahea) {
            o2 = ((ahea)list).d();
        }
        else {
            if (aheb.c.isAssignableFrom(list.getClass())) {
                return;
            }
            if (list instanceof ahew && list instanceof ahdp) {
                final ahdp ahdp = (ahdp)list;
                if (ahdp.c()) {
                    ahdp.b();
                }
                return;
            }
            o2 = Collections.unmodifiableList((List<?>)list);
        }
        ahfz.v(o, n, o2);
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
        ahfz.v(o, n, (Object)a);
    }
}
