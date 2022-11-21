import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cfy implements cgv, cgu
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
    
    public cfy(int f) {
        this.f = f;
        ++f;
        this.h = new int[f];
        this.b = new long[f];
        this.c = new double[f];
        this.d = new String[f];
        this.e = new byte[f][];
    }
    
    public static final cfy a(final String s, final int n) {
        final TreeMap a = cfy.a;
        synchronized (a) {
            final Map.Entry<Integer, Object> ceilingEntry = a.ceilingEntry(n);
            cfy cfy2;
            if (ceilingEntry != null) {
                a.remove(ceilingEntry.getKey());
                final cfy cfy = ceilingEntry.getValue();
                cfy.i(s, n);
                cfy.getClass();
                monitorexit(a);
                cfy2 = cfy;
            }
            else {
                monitorexit(a);
                final cfy cfy3 = new cfy(n);
                cfy3.i(s, n);
                cfy2 = cfy3;
            }
            return cfy2;
        }
    }
    
    @Override
    public final String b() {
        final String g = this.g;
        if (g != null) {
            return g;
        }
        throw new IllegalStateException("Required value was null.");
    }
    
    @Override
    public final void c(final int n, final byte[] array) {
        throw null;
    }
    
    @Override
    public final void close() {
    }
    
    @Override
    public final void d(final int n, final double n2) {
        throw null;
    }
    
    @Override
    public final void e(final int n, final long n2) {
        this.h[n] = 2;
        this.b[n] = n2;
    }
    
    @Override
    public final void f(final int n) {
        this.h[n] = 1;
    }
    
    @Override
    public final void g(final int n, final String s) {
        this.h[n] = 4;
        this.d[n] = s;
    }
    
    @Override
    public final void h(final cgu cgu) {
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
                                    cgu.c(n, array);
                                }
                            }
                            else {
                                final String s = this.d[n];
                                if (s == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                cgu.g(n, s);
                            }
                        }
                        else {
                            cgu.d(n, this.c[n]);
                        }
                    }
                    else {
                        cgu.e(n, this.b[n]);
                    }
                }
                else {
                    cgu.f(n);
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
        final TreeMap a = cfy.a;
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
