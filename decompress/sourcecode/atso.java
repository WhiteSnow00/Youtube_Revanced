import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public class atso extends atow implements atsn
{
    public final atsn b;
    
    public atso(final atli atli, final atsn b) {
        super(atli);
        this.b = b;
    }
    
    public final void B(final Throwable t) {
        final CancellationException k = atrk.K((atrk)this, t);
        this.b.r(k);
        this.E((Object)k);
    }
    
    public final Object b(final atld atld) {
        throw null;
    }
    
    public final auma k() {
        throw null;
    }
    
    public final Object m(final Object o) {
        return this.b.m(o);
    }
    
    public final void p(final atml atml) {
        this.b.p(atml);
    }
    
    public final boolean q(final Throwable t) {
        throw null;
    }
    
    public final void r(final CancellationException ex) {
        final Object w = this.w();
        if (!(w instanceof atpm) && (!(w instanceof atri) || !((atri)w).g())) {
            CancellationException ex2;
            if ((ex2 = ex) == null) {
                ex2 = new atrc(this.a(), null, (atrb)this);
            }
            this.B((Throwable)ex2);
        }
    }
    
    public final boolean s() {
        return this.b.s();
    }
}
