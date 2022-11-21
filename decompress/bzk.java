import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class bzk implements bxl
{
    private final List a;
    private final long[] b;
    private final long[] c;
    
    public bzk(final List list) {
        this.a = Collections.unmodifiableList((List<?>)new ArrayList<Object>(list));
        final int size = list.size();
        this.b = new long[size + size];
        for (int i = 0; i < list.size(); ++i) {
            final bzd bzd = list.get(i);
            final long[] b = this.b;
            final long a = bzd.a;
            final int n = i + i;
            b[n] = a;
            b[n + 1] = bzd.b;
        }
        final long[] b2 = this.b;
        Arrays.sort(this.c = Arrays.copyOf(b2, b2.length));
    }
    
    public final int a() {
        return this.c.length;
    }
    
    public final int b(final long n) {
        final int au = baz.au(this.c, n, false);
        if (au < this.c.length) {
            return au;
        }
        return -1;
    }
    
    public final long c(final int n) {
        final boolean b = true;
        bad.d(n >= 0);
        bad.d(n < this.c.length && b);
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
                final bzd bzd = this.a.get(i);
                final Object c = bzd.c;
                if (((azz)c).g == -3.4028235E38f) {
                    list2.add(bzd);
                }
                else {
                    list.add(c);
                }
            }
        }
        Collections.sort((List<Object>)list2, aas.p);
        for (int j = n2; j < list2.size(); ++j) {
            final azy azy = new azy((azz)((bzd)list2.get(j)).c);
            azy.b((float)(-1 - j), 1);
            list.add(azy.a());
        }
        return list;
    }
}
