import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atbs implements asku, asln
{
    public final asku a;
    final long b;
    final TimeUnit c;
    public final asky d;
    asln e;
    
    public atbs(final asku a, final long b, final TimeUnit c, final asky d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.d.b((Runnable)new xpz(this, t, 5), 0L, this.c);
    }
    
    @Override
    public final void d(final asln e) {
        if (asmr.g(this.e, e)) {
            this.e = e;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.e.dispose();
        this.d.dispose();
    }
    
    @Override
    public final void tt(final Object o) {
        this.d.b((Runnable)new xpz(this, o, 6), this.b, this.c);
    }
    
    @Override
    public final void tw() {
        this.d.b((Runnable)new asgz(this, 11), this.b, this.c);
    }
    
    @Override
    public final boolean tz() {
        return this.d.tz();
    }
}
