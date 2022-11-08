import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cfu implements cgr, cgq
{
    public static final TreeMap a;
    public final long[] b;
    public final double[] c;
    public final String[] d;
    public final byte[][] e;
    private final int f;
    private volatile String g;
    private final int[] h;
    private int i;
    
    static {
        a = new TreeMap();
    }
    
    public cfu(int f) {
        this.f = f;
        ++f;
        this.h = new int[f];
        this.b = new long[f];
        this.c = new double[f];
        this.d = new String[f];
        this.e = new byte[f][];
    }
    
    public static final cfu a(final String s, final int n) {
        final TreeMap a = cfu.a;
        synchronized (a) {
            final Map.Entry<Integer, Object> ceilingEntry = a.ceilingEntry(n);
            cfu cfu2;
            if (ceilingEntry != null) {
                a.remove(ceilingEntry.getKey());
                final cfu cfu = ceilingEntry.getValue();
                cfu.i(s, n);
                cfu.getClass();
                monitorexit(a);
                cfu2 = cfu;
            }
            else {
                monitorexit(a);
                final cfu cfu3 = new cfu(n);
                cfu3.i(s, n);
                cfu2 = cfu3;
            }
            return cfu2;
        }
    }
    
    public final String b() {
        final String g = this.g;
        if (g != null) {
            return g;
        }
        throw new IllegalStateException("Required value was null.");
    }
    
    public final void c(final int n, final byte[] array) {
        throw null;
    }
    
    public final void close() {
    }
    
    public final void d(final int n, final double n2) {
        throw null;
    }
    
    public final void e(final int n, final long n2) {
        this.h[n] = 2;
        this.b[n] = n2;
    }
    
    public final void f(final int n) {
        this.h[n] = 1;
    }
    
    public final void g(final int n, final String s) {
        this.h[n] = 4;
        this.d[n] = s;
    }
    
    public final void h(final cgq cgq) {
        final int i = this.i;
        if (i > 0) {
            int n = 1;
            while (true) {
                final int n2 = this.h[n];
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            if (n2 != 4) {
                                if (n2 == 5) {
                                    final byte[] array = this.e[n];
                                    if (array == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    cgq.c(n, array);
                                }
                            }
                            else {
                                final String s = this.d[n];
                                if (s == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                cgq.g(n, s);
                            }
                        }
                        else {
                            cgq.d(n, this.c[n]);
                        }
                    }
                    else {
                        cgq.e(n, this.b[n]);
                    }
                }
                else {
                    cgq.f(n);
                }
                if (n == i) {
                    break;
                }
                ++n;
            }
        }
    }
    
    public final void i(final String g, final int i) {
        this.g = g;
        this.i = i;
    }
    
    public final void j() {
        final TreeMap a = cfu.a;
        monitorenter(a);
        try {
            a.put(this.f, this);
            if (a.size() > 15) {
                int i = a.size() - 10;
                final Iterator iterator = a.descendingKeySet().iterator();
                iterator.getClass();
                while (i > 0) {
                    iterator.next();
                    iterator.remove();
                    --i;
                }
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
}
