import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adrt extends adnf
{
    public final AtomicBoolean b;
    public final asmo c;
    public final adgg d;
    private final int e;
    private final Executor f;
    private asln g;
    private final askp h;
    
    public adrt(final Executor f, final adgg d, final int n, final int e, final admj admj, final String s, final asmo c, final byte[] array, final byte[] array2, final byte[] array3) {
        super(n);
        this.f = f;
        this.d = d;
        this.e = e;
        this.c = c;
        final askp h = admj.a.get(s);
        h.getClass();
        this.h = h;
        this.b = new AtomicBoolean();
    }
    
    protected final void e() {
        this.g = this.h.ap(atmg.b(this.f)).af(atmg.b(this.f)).aJ(new adrr(this, 0), new adrr(this, 2), new adrs(this));
    }
    
    protected final void f() {
        final asln g = this.g;
        if (g != null) {
            asmr.b((AtomicReference)g);
        }
    }
    
    public final adnr g() {
        asmr.b((AtomicReference)this.h.ar(1L).aI(new adrr(this, 3), new adrr(this, 4)));
        adnr adnr;
        if (this.b.get()) {
            adnr = adnr.a;
        }
        else {
            adnr = adnr.a(this.e);
        }
        return adnr;
    }
}
