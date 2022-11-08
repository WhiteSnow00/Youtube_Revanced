// 
// Decompiled by Procyon v0.6.0
// 

final class bgr
{
    public final azj a;
    public afcr b;
    public ayx c;
    public ayx d;
    public ayx e;
    private afcw f;
    
    public bgr(final azj a) {
        this.a = a;
        this.b = afcr.q();
        this.f = afgm.b;
    }
    
    public static ayx c(final azg azg, final afcr afcr, final ayx ayx, final azj azj) {
        final azl q = azg.q();
        final bew bew = (bew)azg;
        bew.ad();
        final boolean p4 = bew.G.a.p();
        int i = 0;
        int a;
        if (p4) {
            a = 0;
        }
        else {
            final bfm g = bew.G;
            a = g.a.a(g.q.a);
        }
        Object f;
        if (q.p()) {
            f = null;
        }
        else {
            f = q.f(a);
        }
        int b;
        if (!azg.F() && !q.p()) {
            b = q.m(a, azj).b(baw.w(azg.o()) - azj.e);
        }
        else {
            b = -1;
        }
        while (i < afcr.size()) {
            final ayx ayx2 = (ayx)afcr.get(i);
            if (e(ayx2, f, azg.F(), azg.h(), azg.i(), b)) {
                return ayx2;
            }
            ++i;
        }
        if (afcr.isEmpty() && ayx != null && e(ayx, f, azg.F(), azg.h(), azg.i(), b)) {
            return ayx;
        }
        return null;
    }
    
    private final void d(final afct afct, final ayx ayx, azl azl) {
        if (ayx == null) {
            return;
        }
        if (azl.a(ayx.a) != -1) {
            afct.g((Object)ayx, (Object)azl);
            return;
        }
        azl = (azl)this.f.get((Object)ayx);
        if (azl != null) {
            afct.g((Object)ayx, (Object)azl);
        }
    }
    
    private static boolean e(final ayx ayx, final Object o, final boolean b, final int n, final int n2, final int n3) {
        final boolean equals = ayx.a.equals(o);
        final boolean b2 = false;
        if (!equals) {
            return false;
        }
        if (b) {
            final boolean b3 = b2;
            if (ayx.b != n) {
                return b3;
            }
            if (ayx.c != n2) {
                return false;
            }
        }
        else {
            boolean b3 = b2;
            if (ayx.b != -1) {
                return b3;
            }
            b3 = b2;
            if (ayx.e != n3) {
                return b3;
            }
        }
        return true;
    }
    
    public final void a(final azl azl) {
        final afct h = afcw.h();
        if (this.b.isEmpty()) {
            this.d(h, this.d, azl);
            if (!aeda.v((Object)this.e, (Object)this.d)) {
                this.d(h, this.e, azl);
            }
            if (!aeda.v((Object)this.c, (Object)this.d) && !aeda.v((Object)this.c, (Object)this.e)) {
                this.d(h, this.c, azl);
            }
        }
        else {
            for (int i = 0; i < this.b.size(); ++i) {
                this.d(h, (ayx)this.b.get(i), azl);
            }
            if (!this.b.contains((Object)this.c)) {
                this.d(h, this.c, azl);
            }
        }
        this.f = h.c();
    }
    
    public final azl b(final ayx ayx) {
        return (azl)this.f.get((Object)ayx);
    }
}
