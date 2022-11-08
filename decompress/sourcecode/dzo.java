import java.util.Iterator;
import java.util.Map;
import android.util.SparseArray;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dzo
{
    private static final List b;
    
    static {
        b = new ArrayList();
    }
    
    public static dzn a(final dzt dzt, final dzs dzs, final dzs dzs2, final List list, final cxz cxz, final String s, final String s2, String c, final String s3, final boolean b) {
        final int n = 0;
        final boolean b2 = dzs == null;
        final boolean b3 = dzs2 == null;
        if (b2 && b3) {
            throw new IllegalStateException("Both currentRoot and newRoot are null.");
        }
        if (b3) {
            final int i = dzs.i;
            list.add(dzs);
            final dzn d = dzn.d(dzs.i, dzs2, b);
            for (int j = 0; j < i; ++j) {
                d.f(dzl.f(0, null));
            }
            return d;
        }
        final String c2 = c(dzs, s2);
        c = c(dzs2, c);
        if (!b2 && !dzu.o(dzs, dzs2)) {
            final dzn d2 = dzn.d(dzs.i, dzs2, b);
            dzs2.i = d2.a;
            cxz.q(s, dzs, dzs2, c2, c, false, s3);
            return d2;
        }
        cxz.q(s, dzs, dzs2, c2, c, true, s3);
        if (((dzu)dzs2).j()) {
            int k;
            if (b2) {
                k = n;
            }
            else {
                k = dzs.i;
            }
            final dzn d3 = dzn.d(k, dzs2, b);
            final dzt c3 = dzs2.c;
            dzs dzs3 = dzs;
            if (dzs == null) {
                dzs3 = null;
            }
            ((dzu)dzs2).m(c3, d3, dzs3, dzs2);
            dzs2.i = d3.a;
            return d3;
        }
        final dzn c4 = dzn.c(dzs2, b);
        final Map d4 = dzs.d(dzs);
        final Map d5 = dzs.d(dzs2);
        List b4;
        if (dzs == null) {
            b4 = dzo.b;
        }
        else {
            b4 = new ArrayList(dzs.j);
        }
        final List l = dzs2.j;
        int n2 = 0;
        int n3 = -1;
        int n4 = -1;
        while (n2 < l.size()) {
            final String m = l.get(n2).k;
            if (d4.containsKey(m)) {
                final akp akp = d4.get(m);
                final dzs dzs4 = (dzs)akp.a;
                final int intValue = (int)akp.b;
                if (n4 > intValue) {
                    for (int n5 = 0; n5 < dzs4.i; ++n5) {
                        c4.f(dzl.a(b(b4, m), n3, null));
                    }
                    b4.remove(intValue);
                    b4.add(n4, dzs4);
                    for (int size = b4.size(), n6 = 0; n6 < size; ++n6) {
                        final dzs dzs5 = b4.get(n6);
                        final akp akp2 = d4.get(dzs5.k);
                        if ((int)akp2.b != n6) {
                            d4.put(dzs5.k, new akp((Object)akp2.a, (Object)n6));
                        }
                    }
                }
                else if (intValue > n4) {
                    n3 = b(b4, m) + ((dzs)b4.get(intValue)).i - 1;
                    n4 = intValue;
                }
            }
            ++n2;
        }
        final SparseArray sparseArray = new SparseArray();
        for (int n7 = 0; n7 < b4.size(); ++n7) {
            final String k2 = b4.get(n7).k;
            final dzs dzs6 = b4.get(n7);
            if (d5.get(k2) == null) {
                sparseArray.put(n7, (Object)a(dzt, dzs6, null, list, cxz, s, c2, c, s3, b));
            }
        }
        int n8 = 0;
        int n9 = 0;
        while (n8 < l.size()) {
            final dzs dzs7 = l.get(n8);
            final akp akp3 = d4.get(dzs7.k);
            int intValue2;
            if (akp3 != null) {
                intValue2 = (int)akp3.b;
            }
            else {
                intValue2 = -1;
            }
            if (intValue2 < 0) {
                final dzn dzn = (dzn)sparseArray.get(n9);
                final dzn a = a(dzt, null, dzs7, list, cxz, s, c2, c, s3, b);
                sparseArray.put(n9, (Object)dzn.e(dzn, a));
                if (dzn != null) {
                    dzn.h();
                }
                a.h();
            }
            else {
                final dzn dzn2 = (dzn)sparseArray.get(intValue2);
                final dzn a2 = a(dzt, b4.get(intValue2), dzs7, list, cxz, s, c2, c, s3, b);
                sparseArray.put(intValue2, (Object)dzn.e(dzn2, a2));
                if (dzn2 != null) {
                    dzn2.h();
                }
                a2.h();
                n9 = intValue2;
            }
            ++n8;
        }
        final int size2 = sparseArray.size();
        int n10 = 0;
        dzn e = c4;
        while (n10 < size2) {
            final dzn dzn3 = (dzn)sparseArray.valueAt(n10);
            e = dzn.e(e, dzn3);
            if (dzn3 != null) {
                dzn3.h();
            }
            ++n10;
        }
        dzs2.i = e.a;
        return e;
    }
    
    private static final int b(final List list, final String s) {
        final Iterator iterator = list.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final dzs dzs = (dzs)iterator.next();
            if (dzs.k.equals(s)) {
                break;
            }
            n += dzs.i;
        }
        return n;
    }
    
    private static final String c(final dzs dzs, final String s) {
        if (dzs != null && dzs.a == null) {
            return dzs.getClass().getSimpleName();
        }
        if (dzs != null) {
            final String simpleName = dzs.getClass().getSimpleName();
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append("->");
            sb.append(simpleName);
            return sb.toString();
        }
        return "";
    }
}
