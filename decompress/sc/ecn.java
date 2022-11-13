import android.content.Context;
import android.widget.ImageView$ScaleType;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ecn extends dst
{
    @dyi(a = 13)
    @dyj(a = dyk.l)
    Drawable a;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    ImageView$ScaleType b;
    
    public ecn() {
        super("Image");
    }
    
    private final fsu aD() {
        return (fsu)super.t;
    }
    
    protected static final fsu b() {
        return new fsu();
    }
    
    protected final int K() {
        return 30;
    }
    
    protected final Object R(final Context context) {
        return eco.c();
    }
    
    protected final void X(final dsx dsx, final Object o) {
        eco.b((dvw)o, this.aD().b, this.aD().a);
    }
    
    protected final void Y(final dsx dsx, final dtb dtb) {
        final elx elx = new elx();
        final elx elx2 = new elx();
        final elx elx3 = new elx();
        eco.g(dtb, this.a, this.b, elx, elx2, elx3);
        this.aD().c = elx.a;
        this.aD().b = (Integer)elx2.a;
        this.aD().a = (Integer)elx3.a;
    }
    
    public final void Z(final dsx dsx, final dtb dtb, final int n, final int n2, final dwq dwq) {
        eco.d(n, n2, dwq, this.a);
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    protected final void aa(final dsx dsx, final Object o) {
        eco.e((dvw)o, this.a, (duh)this.aD().c);
    }
    
    protected final void ac(final dsx dsx, final Object o) {
        eco.f((dvw)o);
    }
    
    protected final boolean af() {
        return true;
    }
    
    public final boolean al() {
        return true;
    }
    
    public final boolean am() {
        return true;
    }
    
    public final int an() {
        return 2;
    }
    
    protected final boolean ay(final dst dst, final dst dst2) {
        final ecn ecn = (ecn)dst;
        final ecn ecn2 = (ecn)dst2;
        final Object o = null;
        Object b;
        if (ecn == null) {
            b = null;
        }
        else {
            b = ecn.b;
        }
        final dub dub = new dub(b, (Object)ecn2.b);
        Object a;
        if (ecn == null) {
            a = o;
        }
        else {
            a = ecn.a;
        }
        return eco.a(dub, new dub(a, (Object)ecn2.a));
    }
    
    public final boolean f(final dst dst) {
        if (this == dst) {
            return true;
        }
        if (dst != null && this.getClass() == dst.getClass()) {
            final ecn ecn = (ecn)dst;
            final Drawable a = this.a;
            Label_0062: {
                if (a != null) {
                    if (a.equals(ecn.a)) {
                        break Label_0062;
                    }
                }
                else if (ecn.a == null) {
                    break Label_0062;
                }
                return false;
            }
            final ImageView$ScaleType b = this.b;
            if (b != null) {
                if (b.equals((Object)ecn.b)) {
                    return true;
                }
            }
            else if (ecn.b == null) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    public final /* bridge */ dst j() {
        final ecn ecn = (ecn)super.j();
        ecn.t = (duz)b();
        return ecn;
    }
    
    protected final /* bridge */ duz n() {
        return (duz)b();
    }
    
    protected final void r(final duz duz, final duz duz2) {
        final fsu fsu = (fsu)duz;
        final fsu fsu2 = (fsu)duz2;
        fsu.a = fsu2.a;
        fsu.c = fsu2.c;
        fsu.b = fsu2.b;
    }
}
