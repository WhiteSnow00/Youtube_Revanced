import android.content.Context;
import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adio extends adia
{
    public final oco a;
    long b;
    private final atnb c;
    private final atnb d;
    private boolean e;
    
    public adio(final tpq tpq, final oco a, final atnb c, final atnb d) {
        this.e = false;
        this.b = 0L;
        this.a = a;
        this.c = c;
        this.d = d;
        final Duration b = tpq.b();
        if (b != null) {
            this.b = b.toMillis();
        }
    }
    
    public final boolean b() {
        return true;
    }
    
    public final asla e(final long n, final ahcr ahcr) {
        if (!this.e) {
            return asla.C(new Throwable("Capture disabled"));
        }
        final vex a = ((vey)this.c.a()).a(((zoa)this.d.a()).c());
        return asla.W(a.k(), a.b(), new adin(this, ((ahcz)aoss.a).createBuilder(), n, ahcr));
    }
    
    public final void f(final aotm aotm) {
        boolean e;
        final boolean b = e = false;
        if (aotm != null) {
            e = b;
            if ((aotm.b & 0x400) != 0x0) {
                aotj aotj;
                if ((aotj = aotm.i) == null) {
                    aotj = aotj.a;
                }
                e = b;
                if (aotj.b) {
                    e = true;
                }
            }
        }
        this.e = e;
    }
    
    public final boolean g() {
        return this.e;
    }
    
    public final boolean h(final Context context, final ahcr ahcr) {
        return false;
    }
}
