import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fmi implements tec
{
    public final asho a;
    public final tdz b;
    public final vbq c;
    public final vcf d;
    public final fml e;
    public final zki f;
    public asic g;
    public asic h;
    public asic i;
    public asic j;
    public atid k;
    public atid l;
    public atid m;
    public asgt n;
    public final Object o;
    public Future p;
    public final uyi q;
    private final ExecutorService r;
    
    public fmi(final asho a, final ExecutorService r, final tdz b, final vbq c, final vcf d, final fml e, final zki f, final uyi q) {
        this.o = new Object();
        this.a = a;
        this.r = r;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.q = q;
    }
    
    public final void a() {
        final asic j = this.j;
        if (j != null) {
            athh.f((AtomicReference)j);
        }
    }
    
    public final void b() {
        final asic h = this.h;
        if (h != null) {
            asjg.b((AtomicReference)h);
        }
    }
    
    public final void c() {
        final asic g = this.g;
        if (g != null) {
            asjg.b((AtomicReference)g);
        }
    }
    
    public final void d() {
        final asic i = this.i;
        if (i != null) {
            asjg.b((AtomicReference)i);
        }
    }
    
    public final void f() {
        synchronized (this.o) {
            if (this.p != null) {
                return;
            }
            this.k = atid.aD();
            this.l = atid.aD();
            final atid ad = atid.aD();
            this.m = ad;
            this.n = asgt.tz((aujo)this.k, (aujo)this.l, (aujo)ad, (asiy)exg.d).p();
            this.b.g((Object)this);
            this.p = this.r.submit(aesm.h((Runnable)new exu(this, 7)));
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        if (n != -1) {
            final Class[] array = null;
            if (n != 0) {
                if (n == 1) {
                    final zkx zkx = (zkx)o;
                    this.b.m((Object)this);
                    return array;
                }
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            else {
                final zkv zkv = (zkv)o;
                synchronized (this.o) {
                    final Future p3 = this.p;
                    if (p3 != null) {
                        p3.cancel(false);
                        this.p = null;
                    }
                    this.a();
                    this.d();
                    this.b();
                    this.c();
                    monitorexit(this.o);
                    this.f();
                    return array;
                }
            }
        }
        return new Class[] { zkv.class, zkx.class };
    }
}
