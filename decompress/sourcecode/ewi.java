import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewi extends ewk
{
    private final atjj b;
    private final tmd c;
    private final Executor d;
    private final Runnable e;
    
    public ewi(final uyf uyf, final atjj b, final tmd c, final Executor d, final Runnable e) {
        super(uyf);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final void a() {
        this.c.j(8);
        this.c.j(32);
        if (((uyi)this.b.a()).aI() >= 3L) {
            this.d.execute(this.e);
            return;
        }
        this.e.run();
    }
    
    @Override
    public final boolean b() {
        return this.c.p(8);
    }
}
