import java.util.Map;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaij implements aaho
{
    public final aaho a;
    public Executor b;
    
    public aaij(final aaho a, final Executor b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void c(final boolean b, final boolean b2) {
        this.b.execute(aewf.h(new aaih(this, b, b2, 0)));
    }
    
    @Override
    public final void d(final Map map) {
        this.b.execute(new aaii(this, map, 4));
    }
    
    @Override
    public final void e(final aadf aadf) {
        this.b.execute(new aaii(this, aadf, 1));
    }
    
    @Override
    public final void f(final aadf aadf) {
        this.b.execute(new aaii(this, aadf, 0));
    }
    
    @Override
    public final void g(final aadf aadf, final boolean b) {
        this.b.execute((Runnable)new hta(this, aadf, b, 14));
    }
    
    @Override
    public final void h(final aadf aadf) {
        this.b.execute(new aaii(this, aadf, 5));
    }
    
    @Override
    public final void i(final aadf aadf) {
        this.b.execute(new aaii(this, aadf, 3));
    }
    
    @Override
    public final void j(final aadf aadf) {
        this.b.execute((Runnable)new zwj(this, aadf, 19));
    }
    
    @Override
    public final void k(final aadf aadf) {
        this.b.execute((Runnable)new zwj(this, aadf, 20));
    }
    
    @Override
    public final void l(final aadf aadf, final amxs amxs, final aacn aacn) {
        this.b.execute((Runnable)new ugu(this, aadf, amxs, aacn, 16));
    }
    
    @Override
    public final void m(final aadf aadf) {
        this.b.execute(new aaii(this, aadf, 2));
    }
}
