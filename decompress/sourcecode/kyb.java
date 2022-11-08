// 
// Decompiled by Procyon v0.6.0
// 

public final class kyb implements aamj
{
    public final abi a;
    public kxy b;
    public kye c;
    public boolean d;
    
    public kyb() {
        this.d = false;
        this.a = new abi();
    }
    
    public final void m(final anec anec, final boolean b) {
        final kye c = this.c;
        if (c != null) {
            c.b(true);
            final kxy b2 = this.b;
            if (b2 != null) {
                ajsq ajsq;
                if ((anec.b & 0x2) != 0x0) {
                    if ((ajsq = anec.d) == null) {
                        ajsq = ajsq.a;
                    }
                }
                else {
                    ajsq = null;
                }
                b2.h((CharSequence)abyh.b(ajsq));
                if (b2.v) {
                    b2.f.removeCallbacks(b2.q);
                    b2.f.setSelected(false);
                    b2.f.postDelayed(b2.q, kxy.a);
                }
            }
        }
    }
    
    public final void mk() {
        if (this.d) {
            final kye c = this.c;
            if (c != null) {
                c.b(false);
            }
            final kxy b = this.b;
            if (b != null) {
                if (b.v) {
                    b.f.removeCallbacks(b.q);
                    b.f.setSelected(false);
                }
                b.h(b.z);
            }
        }
    }
    
    public final void n(final long n, final long n2) {
        if (this.d) {
            final kye c = this.c;
            if (c != null) {
                final int n3 = (int)n2;
                final int n4 = (int)n;
                final kyc g = c.g;
                if (g != null) {
                    g.c(n3, n4);
                }
            }
        }
    }
}
