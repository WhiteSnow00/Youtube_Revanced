import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cgb
{
    private final cfw a;
    private final AtomicBoolean b;
    private final atne c;
    
    public cgb(final cfw a) {
        this.a = a;
        this.b = new AtomicBoolean(false);
        this.c = aqvs.s((atps)new cga(this, 0));
    }
    
    private final chf a() {
        return (chf)this.c.a();
    }
    
    protected abstract String c();
    
    public final chf d() {
        this.a.i();
        chf chf;
        if (this.b.compareAndSet(false, true)) {
            chf = this.a();
        }
        else {
            chf = this.e();
        }
        return chf;
    }
    
    public final chf e() {
        final cfw a = this.a;
        a.i();
        a.j();
        return a.c().a().k(this.c());
    }
    
    public final void f(final chf chf) {
        chf.getClass();
        if (chf == this.a()) {
            this.b.set(false);
        }
    }
}
