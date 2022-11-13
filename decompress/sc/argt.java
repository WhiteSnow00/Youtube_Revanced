import java.util.Arrays;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class argt extends arfz
{
    final arge d;
    private final int e;
    private final int f;
    
    public argt(final arge d, final long n, final long n2) {
        final String a = ((arfz)d).a;
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 6);
        sb.append("crop(");
        sb.append(a);
        sb.append(")");
        super(sb.toString());
        this.d = d;
        this.e = (int)n;
        this.f = (int)n2;
    }
    
    @Override
    public final drb b() {
        return ((argc)this.d).k;
    }
    
    public final void close() {
        throw null;
    }
    
    @Override
    public final List d() {
        final List g = ((argc)this.d).g;
        final long n = this.e;
        final long n2 = this.f;
        List list = null;
        if (g != null) {
            list = list;
            if (!g.isEmpty()) {
                final ListIterator listIterator = g.listIterator();
                final ArrayList list2 = new ArrayList();
                long n3 = 0L;
                dpy dpy;
                long n4;
                while (true) {
                    dpy = (dpy)listIterator.next();
                    n4 = dpy.a + n3;
                    if (n4 > n) {
                        break;
                    }
                    n3 = n4;
                }
                if (n4 >= n2) {
                    list2.add(new dpy((int)(n2 - n), dpy.b));
                    list = list2;
                }
                else {
                    list2.add(new dpy((int)(n4 - n), dpy.b));
                    int n5 = dpy.a;
                    while (true) {
                        n3 += n5;
                        if (!listIterator.hasNext()) {
                            break;
                        }
                        final dpy dpy2 = dpy = (dpy)listIterator.next();
                        if (dpy2.a + n3 >= n2) {
                            break;
                        }
                        list2.add(dpy2);
                        n5 = dpy2.a;
                        dpy = dpy2;
                    }
                    list2.add(new dpy((int)(n2 - n3), dpy.b));
                    list = list2;
                }
            }
        }
        return list;
    }
    
    @Override
    public final List f() {
        final List h = ((argc)this.d).h;
        if (h != null && !h.isEmpty()) {
            return ((argc)this.d).h.subList(this.e, this.f);
        }
        return null;
    }
    
    @Override
    public final long[] h() {
        monitorenter(this);
        try {
            if (this.d.h() != null) {
                final long[] h = this.d.h();
                final int length = h.length;
                final int n = 0;
                int n2 = 0;
                int i;
                while (true) {
                    i = length;
                    if (n2 >= h.length) {
                        break;
                    }
                    i = length;
                    if (h[n2] >= this.e) {
                        break;
                    }
                    ++n2;
                }
                while (i > 0) {
                    final long n3 = this.f;
                    final int n4 = i - 1;
                    if (n3 >= h[n4]) {
                        break;
                    }
                    i = n4;
                }
                final long[] copyOfRange = Arrays.copyOfRange(this.d.h(), n2, i);
                for (int j = n; j < copyOfRange.length; ++j) {
                    copyOfRange[j] -= this.e;
                }
                monitorexit(this);
                return copyOfRange;
            }
            monitorexit(this);
            return null;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final dqs i() {
        return ((argc)this.d).e;
    }
    
    public final argf j() {
        return ((argc)this.d).i;
    }
    
    public final String k() {
        return ((argc)this.d).j;
    }
    
    public final List l() {
        return ((argc)this.d).d.subList(this.e, this.f);
    }
    
    public final long[] m() {
        synchronized (this) {
            final int n = this.f - this.e;
            final long[] array = new long[n];
            System.arraycopy(this.d.m(), this.e, array, 0, n);
            return array;
        }
    }
}
