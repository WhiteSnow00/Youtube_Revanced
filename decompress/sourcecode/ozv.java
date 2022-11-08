import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ozv
{
    private final php a;
    
    public ozv(final php a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public static final void d(final View view) {
        qcj.s();
        final ozo b = ozu.b(view);
        b.getClass();
        b.a.f();
        agot.D(b.a.n() ^ true);
        b.a = null;
    }
    
    @Deprecated
    public final ozl a(final int n) {
        return new ozl(php.j(n), (aexg)npd.g, this.a, this, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final ozo b(final View view, final ozl ozl) {
        qcj.s();
        final ozo e = ((ozm)ozl).e(this.a);
        final ozo b = ozu.b(view);
        if (b == null) {
            ozu.r(view, e);
            return e;
        }
        if (!b.c()) {
            b.b(e);
            return b;
        }
        if (b.d()) {
            pbp.a((RuntimeException)new IllegalStateException("CVE is already impressed and cannot be replaced."));
        }
        else {
            pbp.a((RuntimeException)new IllegalStateException("CVE is already attached and cannot be replaced."));
        }
        return b;
    }
    
    public final void c(final View view, final ozl ozl) {
        final ozo b = ozu.b(view);
        if (b == null) {
            this.b(view, ozl);
            return;
        }
        if (b.a().h == ((ozr)((ozm)ozl).c.instance).h) {
            if (b.a().g != ((ozr)((ozm)ozl).c.instance).g) {
                new ozw(b.e.g()).a(b);
                final boolean n = b.a.n();
                if (n) {
                    b.e.f((Object)b);
                }
                b.d.clear();
                if (n) {
                    b.e.e((Object)b);
                }
                b.b(((ozm)ozl).e(this.a));
            }
            return;
        }
        throw new IllegalArgumentException("Disallowed Difference in CVE");
    }
    
    public final void e(final View view, final ozl ozl) {
        if (ozu.b(view) == null) {
            this.b(view, ozl);
        }
    }
}
