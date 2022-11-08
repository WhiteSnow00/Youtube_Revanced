import java.util.Map;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaep implements aadv
{
    public final aadv a;
    public Executor b;
    
    public aaep(final aadv a, final Executor b) {
        this.a = a;
        this.b = b;
    }
    
    public final void c(final boolean b, final boolean b2) {
        this.b.execute(aesm.h((Runnable)new aaeo(this, b, b2, 0)));
    }
    
    public final void d(final Map map) {
        this.b.execute((Runnable)new zst(this, map, 20));
    }
    
    public final void e(final zzo zzo) {
        this.b.execute((Runnable)new zst(this, zzo, 16));
    }
    
    public final void f(final zzo zzo) {
        this.b.execute((Runnable)new zst(this, zzo, 17));
    }
    
    public final void g(final zzo zzo, final boolean b) {
        this.b.execute((Runnable)new hrw(this, zzo, b, 14));
    }
    
    public final void h(final zzo zzo) {
        this.b.execute((Runnable)new aaer(this, zzo, 1));
    }
    
    public final void i(final zzo zzo) {
        this.b.execute((Runnable)new zst(this, zzo, 19));
    }
    
    public final void j(final zzo zzo) {
        this.b.execute((Runnable)new zst(this, zzo, 14));
    }
    
    public final void k(final zzo zzo) {
        this.b.execute((Runnable)new zst(this, zzo, 15));
    }
    
    public final void l(final zzo zzo, final amtj amtj, final zyw zyw) {
        this.b.execute((Runnable)new udn(this, zzo, amtj, zyw, 16));
    }
    
    public final void m(final zzo zzo) {
        this.b.execute((Runnable)new zst(this, zzo, 18));
    }
}
