import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class arh implements aqs
{
    public static final arg a;
    public static final arg b;
    public static final arg c;
    public static final arg d;
    public static final arg e;
    public static final arg f;
    public float g;
    float h;
    boolean i;
    final Object j;
    final ari k;
    public boolean l;
    public final float m;
    private long n;
    private final ArrayList o;
    private final ArrayList p;
    
    static {
        a = new aqy();
        b = new aqz();
        c = new ara();
        d = new arb();
        e = new arc();
        f = new aqw();
    }
    
    public arh(final arj arj) {
        this.g = 0.0f;
        this.h = Float.MAX_VALUE;
        this.i = false;
        this.l = false;
        this.n = 0L;
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.j = null;
        this.k = new aqx(arj);
        this.m = 1.0f;
    }
    
    public arh(final Object j, final ari k) {
        this.g = 0.0f;
        this.h = Float.MAX_VALUE;
        this.i = false;
        this.l = false;
        this.n = 0L;
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.j = j;
        this.k = k;
        float m;
        if (k != arh.c && k != arh.d && k != arh.e) {
            if (k == arh.f) {
                m = 0.00390625f;
            }
            else if (k != arh.a && k != arh.b) {
                m = 1.0f;
            }
            else {
                m = 0.002f;
            }
        }
        else {
            m = 0.1f;
        }
        this.m = m;
    }
    
    private static void h(final ArrayList list) {
        int size = list.size();
        while (true) {
            final int n = size - 1;
            if (n < 0) {
                break;
            }
            size = n;
            if (list.get(n) != null) {
                continue;
            }
            list.remove(n);
            size = n;
        }
    }
    
    public final void a(long n) {
        final long n2 = this.n;
        if (n2 == 0L) {
            this.n = n;
            this.c(this.h);
            return;
        }
        this.n = n;
        final float f = aqv.a().f;
        if (f == 0.0f) {
            n = 2147483647L;
        }
        else {
            n = (long)((n - n2) / f);
        }
        final boolean d = this.d(n);
        final float min = Math.min(this.h, Float.MAX_VALUE);
        this.h = min;
        this.c(this.h = Math.max(min, -3.4028235E38f));
        if (d) {
            this.b(false);
        }
    }
    
    public final void b(final boolean b) {
        int i = 0;
        this.l = false;
        final aqv a = aqv.a();
        a.a.remove((Object)this);
        final int index = a.b.indexOf(this);
        if (index >= 0) {
            a.b.set(index, null);
            a.e = true;
        }
        this.n = 0L;
        this.i = false;
        while (i < this.o.size()) {
            if (this.o.get(i) != null) {
                ((are)this.o.get(i)).a(b);
            }
            ++i;
        }
        h(this.o);
    }
    
    final void c(final float n) {
        this.k.b(this.j, n);
        for (int i = 0; i < this.p.size(); ++i) {
            if (this.p.get(i) != null) {
                ((arf)this.p.get(i)).a(this.h);
            }
        }
        h(this.p);
    }
    
    public abstract boolean d(final long p0);
    
    public final void e(final are are) {
        if (!this.o.contains(are)) {
            this.o.add(are);
        }
    }
    
    public final void f(final arf arf) {
        if (!this.l) {
            if (!this.p.contains(arf)) {
                this.p.add(arf);
            }
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }
    
    public final void g(final float h) {
        this.h = h;
        this.i = true;
    }
}
