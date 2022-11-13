import java.util.Iterator;
import java.util.Map;
import android.util.SparseArray;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dzp
{
    public static final int a = 0;
    private static final List b;
    
    static {
        b = new ArrayList();
    }
    
    public static dzo a(final dzu dzu, final dzt dzt, final dzt dzt2, final List list, final cya cya, final String s, final String s2, String c, final String s3, final boolean b) {
        final int n = 0;
        final boolean b2 = dzt2 == null;
        final boolean b3 = dzt == null;
        if (b3 && b2) {
            throw new IllegalStateException("Both currentRoot and newRoot are null.");
        }
        if (b2) {
            final int i = dzt.i;
            list.add(dzt);
            final dzo d = dzo.d(dzt.i, dzt2, b);
            for (int j = 0; j < i; ++j) {
                d.f(dzm.f(0, null));
            }
            return d;
        }
        final String c2 = c(dzt, s2);
        c = c(dzt2, c);
        if (!b3 && !dzv.o(dzt, dzt2)) {
            final dzo d2 = dzo.d(dzt.i, dzt2, b);
            dzt2.i = d2.a;
            cya.q(s, dzt, dzt2, c2, c, false, s3);
            return d2;
        }
        cya.q(s, dzt, dzt2, c2, c, true, s3);
        if (((dzv)dzt2).j()) {
            int k;
            if (b3) {
                k = n;
            }
            else {
                k = dzt.i;
            }
            final dzo d3 = dzo.d(k, dzt2, b);
            final dzu c3 = dzt2.c;
            dzt dzt3 = dzt;
            if (dzt == null) {
                dzt3 = null;
            }
            ((dzv)dzt2).m(c3, d3, dzt3, dzt2);
            dzt2.i = d3.a;
            return d3;
        }
        final dzo c4 = dzo.c(dzt2, b);
        final Map d4 = dzt.d(dzt);
        final Map d5 = dzt.d(dzt2);
        List b4;
        if (dzt == null) {
            b4 = dzp.b;
        }
        else {
            b4 = new ArrayList(dzt.j);
        }
        final List l = dzt2.j;
        int n2 = 0;
        int n3 = -1;
        int n4 = -1;
        while (n2 < l.size()) {
            final String m = l.get(n2).k;
            if (d4.containsKey(m)) {
                final akq akq = d4.get(m);
                final dzt dzt4 = (dzt)akq.a;
                final int intValue = (int)akq.b;
                if (n3 > intValue) {
                    for (int n5 = 0; n5 < dzt4.i; ++n5) {
                        c4.f(dzm.a(b(b4, m), n4, null));
                    }
                    b4.remove(intValue);
                    b4.add(n3, dzt4);
                    for (int size = b4.size(), n6 = 0; n6 < size; ++n6) {
                        final dzt dzt5 = b4.get(n6);
                        final akq akq2 = d4.get(dzt5.k);
                        if ((int)akq2.b != n6) {
                            d4.put(dzt5.k, new akq((Object)akq2.a, (Object)n6));
                        }
                    }
                }
                else if (intValue > n3) {
                    n4 = b(b4, m) + ((dzt)b4.get(intValue)).i - 1;
                    n3 = intValue;
                }
            }
            ++n2;
        }
        final SparseArray sparseArray = new SparseArray();
        for (int n7 = 0; n7 < b4.size(); ++n7) {
            final String k2 = b4.get(n7).k;
            final dzt dzt6 = b4.get(n7);
            if (d5.get(k2) == null) {
                sparseArray.put(n7, (Object)a(dzu, dzt6, null, list, cya, s, c2, c, s3, b));
            }
        }
        int n8 = 0;
        int n9 = 0;
        while (n8 < l.size()) {
            final dzt dzt7 = l.get(n8);
            final akq akq3 = d4.get(dzt7.k);
            int intValue2;
            if (akq3 != null) {
                intValue2 = (int)akq3.b;
            }
            else {
                intValue2 = -1;
            }
            if (intValue2 < 0) {
                final dzo dzo = (dzo)sparseArray.get(n9);
                final dzo a = a(dzu, null, dzt7, list, cya, s, c2, c, s3, b);
                sparseArray.put(n9, (Object)dzo.e(dzo, a));
                if (dzo != null) {
                    dzo.h();
                }
                a.h();
            }
            else {
                final dzo dzo2 = (dzo)sparseArray.get(intValue2);
                final dzo a2 = a(dzu, b4.get(intValue2), dzt7, list, cya, s, c2, c, s3, b);
                sparseArray.put(intValue2, (Object)dzo.e(dzo2, a2));
                if (dzo2 != null) {
                    dzo2.h();
                }
                a2.h();
                n9 = intValue2;
            }
            ++n8;
        }
        final int size2 = sparseArray.size();
        int n10 = 0;
        dzo e = c4;
        while (n10 < size2) {
            final dzo dzo3 = (dzo)sparseArray.valueAt(n10);
            e = dzo.e(e, dzo3);
            if (dzo3 != null) {
                dzo3.h();
            }
            ++n10;
        }
        dzt2.i = e.a;
        return e;
    }
    
    private static final int b(final List list, final String s) {
        final Iterator iterator = list.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final dzt dzt = (dzt)iterator.next();
            if (dzt.k.equals(s)) {
                break;
            }
            n += dzt.i;
        }
        return n;
    }
    
    private static final String c(final dzt dzt, final String s) {
        if (dzt != null && dzt.a == null) {
            return dzt.getClass().getSimpleName();
        }
        if (dzt != null) {
            final String simpleName = dzt.getClass().getSimpleName();
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append("->");
            sb.append(simpleName);
            return sb.toString();
        }
        return "";
    }
}
