import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kbc extends gec
{
    public final tme d;
    private final atjj e;
    private final uyi f;
    
    public kbc(final tme d, final atjj e, final uyi f) {
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    protected final boolean l(final ged ged, int n) {
        n = this.d.a(tme.c);
        if ((n == 1 || n == 2 || n == 3 || n == 4) && this.d.a(tme.b) == 3) {
            n = tme.d;
            if (!tme.n(this.d.a(n))) {
                if (this.f.aI() >= 2L) {
                    this.d.b().V((asir)new jbd(this, 9));
                    return false;
                }
                ((mrm)this.e.a()).A((Callable)new kbe(this, 1));
                return false;
            }
        }
        return true;
    }
}
