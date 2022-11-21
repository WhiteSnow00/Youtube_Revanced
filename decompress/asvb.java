import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

final class asvb extends AtomicLong implements aunb, asln
{
    private static final long serialVersionUID = -4453897557930727610L;
    final asvf a;
    final auna b;
    Object c;
    final AtomicLong d;
    boolean e;
    boolean f;
    
    public asvb(final asvf a, final auna b) {
        this.a = a;
        this.b = b;
        this.d = new AtomicLong();
    }
    
    @Override
    public final void dispose() {
        if (this.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.a.g(this);
            this.a.d();
            this.c = null;
        }
    }
    
    @Override
    public final void e(final long n) {
        if (atkw.h(n) && auop.B((AtomicLong)this, n) != Long.MIN_VALUE) {
            auop.A(this.d, n);
            this.a.d();
            this.a.i.b(this);
        }
    }
    
    @Override
    public final void ts() {
        this.dispose();
    }
    
    @Override
    public final boolean tz() {
        return this.get() == Long.MIN_VALUE;
    }
}
