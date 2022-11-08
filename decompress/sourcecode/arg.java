import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class arg implements aqr
{
    public static final arf a;
    public static final arf b;
    public static final arf c;
    public static final arf d;
    public static final arf e;
    public static final arf f;
    public float g;
    float h;
    boolean i;
    final Object j;
    final arh k;
    public boolean l;
    public final float m;
    private long n;
    private final ArrayList o;
    private final ArrayList p;
    
    static {
        a = (arf)new aqx();
        b = (arf)new aqy();
        c = (arf)new aqz();
        d = (arf)new ara();
        e = (arf)new arb();
        f = (arf)new aqv();
    }
    
    public arg(final ari ari) {
        this.g = 0.0f;
        this.h = Float.MAX_VALUE;
        this.i = false;
        this.l = false;
        this.n = 0L;
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.j = null;
        this.k = new aqw(ari);
        this.m = 1.0f;
    }
    
    public arg(final Object j, final arh k) {
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
        if (k != arg.c && k != arg.d && k != arg.e) {
            if (k == arg.f) {
                m = 0.00390625f;
            }
            else if (k != arg.a && k != arg.b) {
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
        final float f = aqu.a().f;
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
        final aqu a = aqu.a();
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
                ((ard)this.o.get(i)).a(b);
            }
            ++i;
        }
        h(this.o);
    }
    
    final void c(final float n) {
        this.k.b(this.j, n);
        for (int i = 0; i < this.p.size(); ++i) {
            if (this.p.get(i) != null) {
                ((are)this.p.get(i)).a(this.h);
            }
        }
        h(this.p);
    }
    
    public abstract boolean d(final long p0);
    
    public final void e(final ard ard) {
        if (!this.o.contains(ard)) {
            this.o.add(ard);
        }
    }
    
    public final void f(final are are) {
        if (!this.l) {
            if (!this.p.contains(are)) {
                this.p.add(are);
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
