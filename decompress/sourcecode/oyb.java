// 
// Decompiled by Procyon v0.6.0
// 

public class oyb
{
    protected double a;
    protected double b;
    protected double c;
    protected double d;
    protected final mck e;
    protected final mck f;
    
    public oyb() {
        this.a = -1.0;
        this.b = -1.0;
        this.c = -1.0;
        this.d = -1.0;
        this.e = new mck((int[])null);
        this.f = new mck(new double[] { oxz.k.l, oxz.j.l, oxz.i.l, oxz.h.l, oxz.g.l, oxz.f.l, oxz.e.l, oxz.d.l, oxz.c.l, oxz.b.l, oxz.a.l });
    }
    
    protected int a() {
        return 1000;
    }
    
    public final void b(final long n, double a, double min) {
        if (n > 0L) {
            this.e.i(a, n);
            this.f.i(min, n);
        }
        this.b = Math.max(a, this.b);
        final double a2 = this.a;
        if (a2 != -1.0) {
            a = Math.min(a, a2);
        }
        this.a = a;
        this.d = Math.max(min, this.d);
        a = this.c;
        if (a != -1.0) {
            min = Math.min(min, a);
        }
        this.c = min;
    }
    
    public final boolean c() {
        return this.e.h(3, oya.c.f) >= this.a();
    }
    
    public final Long[] d() {
        return this.e(true);
    }
    
    public final Long[] e(final boolean b) {
        return this.e.l(3, b);
    }
}
