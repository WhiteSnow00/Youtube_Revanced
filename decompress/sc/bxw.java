import java.util.PriorityQueue;
import java.util.ArrayDeque;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bxw implements bxj
{
    private final ArrayDeque a;
    public final ArrayDeque b;
    public long c;
    private final PriorityQueue d;
    private bxu e;
    private long f;
    
    public bxw() {
        this.a = new ArrayDeque();
        final int n = 0;
        for (int i = 0; i < 10; ++i) {
            this.a.add(new bxu());
        }
        this.b = new ArrayDeque();
        for (int j = n; j < 2; ++j) {
            this.b.add(new bxv((bdd)new bdm(this, 3)));
        }
        this.d = new PriorityQueue();
    }
    
    private final void l(final bxu bxu) {
        ((bcw)bxu).clear();
        this.a.add(bxu);
    }
    
    public final /* bridge */ Object a() {
        dk.h(this.e == null);
        if (this.a.isEmpty()) {
            return null;
        }
        return this.e = this.a.pollFirst();
    }
    
    public /* bridge */ Object b() {
        return this.i();
    }
    
    public void d() {
        this.f = 0L;
        this.c = 0L;
        while (!this.d.isEmpty()) {
            final bxu bxu = this.d.poll();
            final int a = bax.a;
            this.l(bxu);
        }
        final bxu e = this.e;
        if (e != null) {
            this.l(e);
            this.e = null;
        }
    }
    
    public final /* bridge */ void e(final Object o) {
        final bxl bxl = (bxl)o;
        dk.f(bxl == this.e);
        final bxu bxu = (bxu)bxl;
        if (((bcw)bxu).isDecodeOnly()) {
            this.l(bxu);
        }
        else {
            final long f = this.f;
            this.f = 1L + f;
            bxu.h = f;
            this.d.add(bxu);
        }
        this.e = null;
    }
    
    public void f() {
    }
    
    protected abstract bxi h();
    
    public bxm i() {
        if (!this.b.isEmpty()) {
            while (!this.d.isEmpty()) {
                final bxu bxu = this.d.peek();
                final int a = bax.a;
                if (bxu.e > this.c) {
                    break;
                }
                final bxu bxu2 = this.d.poll();
                if (((bcw)bxu2).isEndOfStream()) {
                    final bxm bxm = this.b.pollFirst();
                    ((bcw)bxm).addFlag(4);
                    this.l(bxu2);
                    return bxm;
                }
                this.j((bxl)bxu2);
                if (this.k()) {
                    final bxi h = this.h();
                    final bxm bxm2 = this.b.pollFirst();
                    bxm2.e(bxu2.e, h, Long.MAX_VALUE);
                    this.l(bxu2);
                    return bxm2;
                }
                this.l(bxu2);
            }
        }
        return null;
    }
    
    protected abstract void j(final bxl p0);
    
    protected abstract boolean k();
    
    @Override
    public final void t(final long c) {
        this.c = c;
    }
}
