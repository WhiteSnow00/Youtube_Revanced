import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewm extends ewo
{
    private final atke b;
    private final toj c;
    private final Executor d;
    private final Runnable e;
    
    public ewm(final vaf vaf, final atke b, final toj c, final Executor d, final Runnable e) {
        super(vaf);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a() {
        this.c.j(8);
        this.c.j(32);
        if (((vai)this.b.a()).aJ() == 3L) {
            this.d.execute(this.e);
            return;
        }
        this.e.run();
    }
    
    public final boolean b() {
        return this.c.p(8);
    }
}
