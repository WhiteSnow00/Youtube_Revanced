import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cfy
{
    private final cft a;
    private final AtomicBoolean b;
    private final atkh c;
    
    public cfy(final cft a) {
        this.a = a;
        this.b = new AtomicBoolean(false);
        this.c = aqsz.x((atmv)new cfx(this, 0));
    }
    
    private final chc a() {
        return (chc)this.c.a();
    }
    
    protected abstract String c();
    
    public final chc d() {
        this.a.i();
        chc chc;
        if (this.b.compareAndSet(false, true)) {
            chc = this.a();
        }
        else {
            chc = this.e();
        }
        return chc;
    }
    
    public final chc e() {
        final cft a = this.a;
        a.i();
        a.j();
        return a.c().a().k(this.c());
    }
    
    public final void f(final chc chc) {
        chc.getClass();
        if (chc == this.a()) {
            this.b.set(false);
        }
    }
}
