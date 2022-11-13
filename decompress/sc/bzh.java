import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class bzh implements bxi
{
    private final List a;
    private final long[] b;
    private final long[] c;
    
    public bzh(final List list) {
        this.a = Collections.unmodifiableList((List<?>)new ArrayList<Object>(list));
        final int size = list.size();
        this.b = new long[size + size];
        for (int i = 0; i < list.size(); ++i) {
            final bza bza = list.get(i);
            final long[] b = this.b;
            final long a = bza.a;
            final int n = i + i;
            b[n] = a;
            b[n + 1] = bza.b;
        }
        final long[] b2 = this.b;
        Arrays.sort(this.c = Arrays.copyOf(b2, b2.length));
    }
    
    public final int a() {
        return this.c.length;
    }
    
    public final int b(final long n) {
        final int au = bax.au(this.c, n, false);
        if (au < this.c.length) {
            return au;
        }
        return -1;
    }
    
    public final long c(final int n) {
        final boolean b = true;
        dk.f(n >= 0);
        dk.f(n < this.c.length && b);
        return this.c[n];
    }
    
    public final List d(final long n) {
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final int n2 = 0;
        for (int i = 0; i < this.a.size(); ++i) {
            final long[] b = this.b;
            final int n3 = i + i;
            if (b[n3] <= n && n < b[n3 + 1]) {
                final bza bza = this.a.get(i);
                final Object c = bza.c;
                if (((azy)c).g == -3.4028235E38f) {
                    list2.add(bza);
                }
                else {
                    list.add(c);
                }
            }
        }
        Collections.sort((List<Object>)list2, aar.p);
        for (int j = n2; j < list2.size(); ++j) {
            final azx azx = new azx((azy)((bza)list2.get(j)).c);
            azx.b((float)(-1 - j), 1);
            list.add(azx.a());
        }
        return list;
    }
}
