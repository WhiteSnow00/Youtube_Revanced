import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public class attj extends atpr implements atti
{
    public final atti b;
    
    public attj(final atmd atmd, final atti b) {
        super(atmd);
        this.b = b;
    }
    
    public final void B(final Throwable t) {
        final CancellationException k = atsf.K((atsf)this, t);
        this.b.r(k);
        this.E((Object)k);
    }
    
    public final Object b(final atly atly) {
        throw null;
    }
    
    public final aump k() {
        throw null;
    }
    
    public final Object m(final Object o) {
        return this.b.m(o);
    }
    
    public final void p(final atng atng) {
        this.b.p(atng);
    }
    
    public final boolean q(final Throwable t) {
        throw null;
    }
    
    public final void r(final CancellationException ex) {
        final Object w = this.w();
        if (!(w instanceof atqh) && (!(w instanceof atsd) || !((atsd)w).g())) {
            Object o;
            if ((o = ex) == null) {
                o = new atrx(this.a(), (Throwable)null, (atrw)this);
            }
            this.B((Throwable)o);
        }
    }
    
    public final boolean s() {
        return this.b.s();
    }
}
