import java.util.PriorityQueue;
import java.util.ArrayDeque;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bxv implements bxi
{
    private final ArrayDeque a;
    public final ArrayDeque b;
    public long c;
    private final PriorityQueue d;
    private bxt e;
    private long f;
    
    public bxv() {
        this.a = new ArrayDeque();
        final int n = 0;
        for (int i = 0; i < 10; ++i) {
            this.a.add(new bxt());
        }
        this.b = new ArrayDeque();
        for (int j = n; j < 2; ++j) {
            this.b.add(new bxu((bdc)new bdl(this, 3)));
        }
        this.d = new PriorityQueue();
    }
    
    private final void l(final bxt bxt) {
        ((bcv)bxt).clear();
        this.a.add(bxt);
    }
    
    public void d() {
        this.f = 0L;
        this.c = 0L;
        while (!this.d.isEmpty()) {
            final bxt bxt = this.d.poll();
            final int a = baw.a;
            this.l(bxt);
        }
        final bxt e = this.e;
        if (e != null) {
            this.l(e);
            this.e = null;
        }
    }
    
    public void f() {
    }
    
    protected abstract bxh h();
    
    public bxl i() {
        if (!this.b.isEmpty()) {
            while (!this.d.isEmpty()) {
                final bxt bxt = this.d.peek();
                final int a = baw.a;
                if (bxt.e > this.c) {
                    break;
                }
                final bxt bxt2 = this.d.poll();
                if (((bcv)bxt2).isEndOfStream()) {
                    final bxl bxl = this.b.pollFirst();
                    ((bcv)bxl).addFlag(4);
                    this.l(bxt2);
                    return bxl;
                }
                this.j((bxk)bxt2);
                if (this.k()) {
                    final bxh h = this.h();
                    final bxl bxl2 = this.b.pollFirst();
                    bxl2.e(bxt2.e, h, Long.MAX_VALUE);
                    this.l(bxt2);
                    return bxl2;
                }
                this.l(bxt2);
            }
        }
        return null;
    }
    
    protected abstract void j(final bxk p0);
    
    protected abstract boolean k();
    
    public final void t(final long c) {
        this.c = c;
    }
}
