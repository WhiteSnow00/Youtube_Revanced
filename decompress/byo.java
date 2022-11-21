import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class byo implements bxl
{
    private final int a;
    private final Object b;
    private final Object c;
    
    public byo(final List b, final List c, final int a) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public byo(final azz[] b, final long[] c, final int a) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final int a() {
        if (this.a != 0) {
            return ((List)this.c).size();
        }
        return ((long[])this.c).length;
    }
    
    public final int b(final long n) {
        if (this.a != 0) {
            final int at = baz.at((List)this.c, n);
            if (at < ((List)this.c).size()) {
                return at;
            }
            return -1;
        }
        else {
            final int au = baz.au((long[])this.c, n, false);
            if (au < ((long[])this.c).length) {
                return au;
            }
            return -1;
        }
    }
    
    public final long c(final int n) {
        final int a = this.a;
        final boolean b = true;
        final boolean b2 = true;
        if (a != 0) {
            bad.d(n >= 0);
            bad.d(n < ((List)this.c).size() && b2);
            return ((List<Long>)this.c).get(n);
        }
        bad.d(n >= 0);
        bad.d(n < ((long[])this.c).length && b);
        return ((long[])this.c)[n];
    }
    
    public final List d(final long n) {
        if (this.a != 0) {
            final int ac = baz.aC((List)this.c, n, true);
            List<Object> emptyList;
            if (ac == -1) {
                emptyList = Collections.emptyList();
            }
            else {
                emptyList = ((List<List<Object>>)this.b).get(ac);
            }
            return emptyList;
        }
        final int av = baz.av((long[])this.c, n, false);
        Object o;
        if (av != -1 && ((azz[])this.b)[av] != azz.a) {
            o = Collections.singletonList(((azz[])this.b)[av]);
        }
        else {
            o = Collections.emptyList();
        }
        return (List)o;
    }
}
